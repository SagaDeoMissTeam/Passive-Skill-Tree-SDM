package daripher.skilltree.client.data;

import com.google.gson.JsonIOException;
import com.google.gson.stream.JsonReader;
import daripher.skilltree.data.reloader.SkillTreesReloader;
import daripher.skilltree.data.reloader.SkillsReloader;
import daripher.skilltree.skill.PassiveSkill;
import daripher.skilltree.skill.PassiveSkillTree;
import java.io.*;
import java.util.*;
import javax.annotation.Nullable;
import net.minecraft.ChatFormatting;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.MutableComponent;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.fml.loading.FMLPaths;

public class SkillTreeClientData {
  private static final Map<ResourceLocation, PassiveSkill> EDITOR_PASSIVE_SKILLS = new HashMap<>();
  private static final Map<ResourceLocation, PassiveSkillTree> EDITOR_TREES = new HashMap<>();
  public static int[] skill_points_costs;
  public static int first_skill_cost;
  public static int last_skill_cost;
  public static int max_skill_points;
  public static boolean enable_exp_exchange;
  public static boolean use_skill_cost_array;

  public static int getSkillPointCost(int level) {
    if (use_skill_cost_array) {
      if (level > skill_points_costs.length) {
        return skill_points_costs[skill_points_costs.length - 1];
      }
      return skill_points_costs[level];
    }
    return first_skill_cost + (last_skill_cost - first_skill_cost) * level / max_skill_points;
  }

  public static PassiveSkill getEditorSkill(ResourceLocation id) {
    return EDITOR_PASSIVE_SKILLS.get(id);
  }

  public static @Nullable PassiveSkillTree getOrCreateEditorTree(ResourceLocation treeId) {
    try {
      File folder = getSkillTreeSavesFolder(treeId);
      if (!folder.exists()) {
        folder.mkdirs();
      }
      File mcmetaFile = new File(getEditorFolder(), "pack.mcmeta");
      if (!mcmetaFile.exists()) {
        generatePackMcmetaFile(mcmetaFile);
      }
      if (!getSkillTreeSaveFile(treeId).exists()) {
        PassiveSkillTree skillTree = SkillTreesReloader.getSkillTreeById(treeId);
        if (skillTree != null) saveEditorSkillTree(skillTree);
      }
      if (!EDITOR_TREES.containsKey(treeId)) {
        loadEditorSkillTree(treeId);
      }
      PassiveSkillTree editorSkillTree =
          EDITOR_TREES.getOrDefault(treeId, new PassiveSkillTree(treeId));
      editorSkillTree.getSkillIds().forEach(SkillTreeClientData::loadOrCreateEditorSkill);
      return editorSkillTree;
    } catch (RuntimeException e) {
      EDITOR_TREES.clear();
      EDITOR_PASSIVE_SKILLS.clear();
      sendSystemMessage("Error while reading editor files", ChatFormatting.DARK_RED);
      sendSystemMessage("");
      String errorMessage = e.getMessage() == null ? "No error message" : e.getMessage();
      sendSystemMessage(errorMessage, ChatFormatting.RED);
      sendSystemMessage("");
      sendSystemMessage("Try removing files from folder", ChatFormatting.DARK_RED);
      sendSystemMessage("");
      sendSystemMessage(getSavesFolder().getPath(), ChatFormatting.RED);
      return null;
    }
  }

  private static void generatePackMcmetaFile(File file) {
    try {
      BufferedWriter writer = new BufferedWriter(new FileWriter(file));
      writer.write(
          """
          {
              "pack": {
                  "description": "PST editor data",
                  "pack_format": 9,
                  "forge:data_pack_format": 10
              }
          }
          """);
      writer.close();
    } catch (IOException e) {
      throw new RuntimeException(e);
    }
  }

  private static void loadOrCreateEditorSkill(ResourceLocation skillId) {
    File skillSavesFolder = getSkillSavesFolder(skillId);
    if (!skillSavesFolder.exists()) {
      skillSavesFolder.mkdirs();
    }
    if (!getSkillSaveFile(skillId).exists()) {
      PassiveSkill skill = SkillsReloader.getSkillById(skillId);
      if (skill != null) saveEditorSkill(skill);
    }
    if (!EDITOR_PASSIVE_SKILLS.containsKey(skillId)) {
      loadEditorSkill(skillId);
    }
  }

  public static void saveEditorSkillTree(PassiveSkillTree skillTree) {
    try (FileWriter writer = new FileWriter(getSkillTreeSaveFile(skillTree.getId()))) {
      SkillTreesReloader.GSON.toJson(skillTree, writer);
    } catch (JsonIOException | IOException e) {
      throw new RuntimeException("Can't save editor skill tree " + skillTree.getId());
    }
  }

  public static void loadEditorSkillTree(ResourceLocation treeId) {
    PassiveSkillTree skillTree;
    try {
      skillTree = readFromFile(PassiveSkillTree.class, getSkillTreeSaveFile(treeId));
    } catch (IOException e) {
      throw new RuntimeException("Can't load editor tree " + treeId);
    }
    if (skillTree == null) {
      skillTree = new PassiveSkillTree(treeId);
      saveEditorSkillTree(skillTree);
    }
    EDITOR_TREES.put(treeId, skillTree);
  }

  public static void saveEditorSkill(PassiveSkill skill) {
    try (FileWriter writer = new FileWriter(getSkillSaveFile(skill.getId()))) {
      SkillsReloader.GSON.toJson(skill, writer);
    } catch (JsonIOException | IOException e) {
      throw new RuntimeException("Can't save editor skill " + skill.getId());
    }
  }

  public static void loadEditorSkill(ResourceLocation skillId) {
    PassiveSkill skill;
    try {
      skill = readFromFile(PassiveSkill.class, getSkillSaveFile(skillId));
    } catch (IOException e) {
      throw new RuntimeException("Can't load editor skill " + skillId);
    }
    EDITOR_PASSIVE_SKILLS.put(skillId, skill);
  }

  public static void deleteEditorSkill(PassiveSkill skill) {
    getSkillSaveFile(skill.getId()).delete();
    EDITOR_PASSIVE_SKILLS.remove(skill.getId());
  }

  private static File getSavesFolder() {
    return new File(getEditorFolder(), "data");
  }

  private static File getEditorFolder() {
    return new File(FMLPaths.GAMEDIR.get().toFile(), "skilltree/editor");
  }

  private static File getSkillSavesFolder(ResourceLocation skillId) {
    return new File(getSavesFolder(), skillId.getNamespace() + "/skills");
  }

  private static File getSkillTreeSavesFolder(ResourceLocation skillTreeId) {
    return new File(getSavesFolder(), skillTreeId.getNamespace() + "/skill_trees");
  }

  private static File getSkillSaveFile(ResourceLocation skillId) {
    return new File(getSkillSavesFolder(skillId), skillId.getPath() + ".json");
  }

  private static File getSkillTreeSaveFile(ResourceLocation skillTreeId) {
    return new File(getSkillTreeSavesFolder(skillTreeId), skillTreeId.getPath() + ".json");
  }

  private static <T> T readFromFile(Class<T> objectType, File file) throws IOException {
    try (JsonReader reader = new JsonReader(new FileReader(file))) {
      return SkillsReloader.GSON.fromJson(reader, objectType);
    }
  }

  private static void sendSystemMessage(String text, ChatFormatting... styles) {
    LocalPlayer player = Minecraft.getInstance().player;
    if (player != null) {
      MutableComponent component = Component.literal(text);
      for (ChatFormatting style : styles) {
        component.withStyle(style);
      }
      player.sendSystemMessage(component);
    }
  }
}
