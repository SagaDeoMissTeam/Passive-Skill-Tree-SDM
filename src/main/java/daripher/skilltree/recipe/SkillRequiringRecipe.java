package daripher.skilltree.recipe;

import daripher.skilltree.container.InteractiveContainer;
import daripher.skilltree.skill.bonus.SkillBonusHandler;
import daripher.skilltree.skill.bonus.player.RecipeUnlockBonus;
import net.minecraft.world.Container;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.crafting.Recipe;

public interface SkillRequiringRecipe {
  default boolean isUncraftable(Container container, Recipe<?> recipe) {
    if (!(container instanceof InteractiveContainer)) return true;
    return isUncraftable((InteractiveContainer) container, recipe);
  }

  default boolean isUncraftable(InteractiveContainer container, Recipe<?> recipe) {
    Player player = container.getUser().orElse(null);
    if (player == null) return true;
    return SkillBonusHandler.getSkillBonuses(player, RecipeUnlockBonus.class).stream()
        .noneMatch(bonus -> bonus.getRecipeId().equals(recipe.getId()));
  }
}
