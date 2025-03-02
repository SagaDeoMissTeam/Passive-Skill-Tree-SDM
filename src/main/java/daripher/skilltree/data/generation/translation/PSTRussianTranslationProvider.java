package daripher.skilltree.data.generation.translation;

import daripher.skilltree.SkillTreeMod;
import daripher.skilltree.init.*;
import daripher.skilltree.skill.bonus.player.GainedExperienceBonus;
import daripher.skilltree.skill.bonus.player.LootDuplicationBonus;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.effect.MobEffects;
import top.theillusivec4.curios.common.CuriosHelper;

public class PSTRussianTranslationProvider extends PSTTranslationProvider {
  public PSTRussianTranslationProvider(DataGenerator gen) {
    super(gen, SkillTreeMod.MOD_ID, "ru_ru");
  }

  @Override
  protected void addTranslations() {
    addSkill("void", "Пустота", "Ничего не даёт");
    // hunter skills
    addSkill("hunter_class", "Охотник");
    addSkill("hunter_crafting_notable_1", "Бережливость");
    addSkill("hunter_defensive_notable_1", "Желание выжить");
    addSkill("hunter_offensive_notable_1", "Искусный стрелок");
    addSkill("hunter_life_notable_1", "Движение - жизнь");
    addSkill("hunter_speed_notable_1", "Скоростная стрельба");
    addSkill("hunter_healing_notable_1", "Кровожадные стрелы");
    addSkill("hunter_crit_notable_1", "Точность");
    addSkill("hunter_defensive_crafting_keystone_1", "Шляпник");
    addSkill("hunter_offensive_crafting_keystone_1", "Декоративные луки");
    addSkill("hunter_defensive_keystone_1", "Подогнанная броня");
    addSkill("hunter_offensive_keystone_1", "Снайпер");
    addSkill("hunter_mastery", "Охотник за сокровищами");
    addSkill("hunter_gateway", "Пространственные врата", "Соединяются с пространственными вратами");
    addSkillBranch("hunter_crafting", "Возврат Стрел", 1, 3);
    addSkillBranch("hunter_offensive_crafting", "Скорость атаки создаваемого оружия", 1, 7);
    addSkillBranch("hunter_defensive_crafting", "Уклонение создаваемой брони", 1, 7);
    addSkillBranch("hunter_offensive", "Урон снарядов", 1, 8);
    addSkillBranch("hunter_defensive", "Уклонение", 1, 8);
    addSkillBranch("hunter_lesser", "Преумножение добычи", 1, 6);
    addSkillBranch("hunter_life", "Здоровье", 1, 2);
    addSkillBranch("hunter_speed", "Скорость атаки", 1, 2);
    addSkillBranch("hunter_crit", "Шанс крита", 1, 2);
    addSkillBranch("hunter_healing", "Здоровье за удар", 1, 4);
    // ranger skills
    addSkill("hunter_subclass_1", "Рейнджер");
    addSkill("hunter_subclass_1_mastery", "Неуловимость");
    addSkill("hunter_subclass_1_crafting_notable_1", "Мягкие подошвы");
    addSkill("hunter_subclass_1_offensive_notable_1", "Без следа");
    addSkill("hunter_subclass_special", "Кровожадный клинок");
    addSkillBranch("hunter_subclass_1_defensive", "Уклонение", 1, 4);
    addSkillBranch("hunter_subclass_1_offensive", "Скрытность и Скорость атаки", 1, 4);
    addSkillBranch("hunter_subclass_1_crafting", "Скрытность создаваемой брони", 1, 5);
    // fletcher skills
    addSkill("hunter_subclass_2", "Стрельник");
    addSkill("hunter_subclass_2_mastery", "Бездонный колчан");
    addSkill("hunter_subclass_2_crafting_notable_1", "Облегчённые стрелы");
    addSkill("hunter_subclass_2_life_notable_1", "Уверенность");
    addSkillBranch("hunter_subclass_2_defensive", "Блокирование и Уклонение", 1, 4);
    addSkillBranch("hunter_subclass_2_life", "Здоровье", 1, 4);
    addSkillBranch("hunter_subclass_2_crafting", "Вместимость создаваемых колчанов", 1, 5);
    // cook skills
    addSkill("cook_class", "Повар");
    addSkill("cook_crafting_notable_1", "Фрукт амброзии");
    addSkill("cook_defensive_notable_1", "Толстые руки");
    addSkill("cook_offensive_notable_1", "Тяжелый удар");
    addSkill("cook_life_notable_1", "Здоровая диета");
    addSkill("cook_speed_notable_1", "Запас энергии");
    addSkill("cook_healing_notable_1", "Перекус");
    addSkill("cook_crit_notable_1", "Острое блюдо");
    addSkill("cook_defensive_crafting_keystone_1", "Вегетарианство");
    addSkill("cook_offensive_crafting_keystone_1", "Горячая еда");
    addSkill("cook_defensive_keystone_1", "Лишний вес");
    addSkill("cook_offensive_keystone_1", "Жирное тело");
    addSkill("cook_mastery", "Большие порции");
    addSkill("cook_gateway", "Духовные врата", "Соединяются с духовными вратами");
    addSkillBranch("cook_crafting", "Регенерация от создаваемой еды", 1, 3);
    addSkillBranch("cook_offensive_crafting", "Бонус у урону от создаваемой еды", 1, 7);
    addSkillBranch("cook_defensive_crafting", "Исцеление от создаваемой еды", 1, 7);
    addSkillBranch("cook_offensive", "Урон если не голоден", 1, 8);
    addSkillBranch("cook_defensive", "Блокирование", 1, 8);
    addSkillBranch("cook_lesser", "Насыщение от создаваемой еды", 1, 6);
    addSkillBranch("cook_life", "Здоровье", 1, 2);
    addSkillBranch("cook_speed", "Скорость атаки", 1, 2);
    addSkillBranch("cook_crit", "Шанс крита", 1, 2);
    addSkillBranch("cook_healing", "Здоровье при блоке", 1, 4);
    // berserker skills
    addSkill("cook_subclass_1", "Берсерк");
    addSkill("cook_subclass_1_mastery", "Кровавая пелена");
    addSkill("cook_subclass_1_crafting_notable_1", "Топор палача");
    addSkill("cook_subclass_1_offensive_notable_1", "Грань смерти");
    addSkill("cook_subclass_special", "Изучение останков");
    addSkillBranch("cook_subclass_1_defensive", "Блокирование", 1, 4);
    addSkillBranch("cook_subclass_1_offensive", "Скорость атаки", 1, 4);
    addSkillBranch("cook_subclass_1_crafting", "Шанс крита создаваемых топоров", 1, 5);
    // fisherman skills
    addSkill("cook_subclass_2", "Рыбак");
    addSkill("cook_subclass_2_mastery", "Дар моря");
    addSkill("cook_subclass_2_crafting_notable_1", "Опытный рыбак");
    addSkill("cook_subclass_2_life_notable_1", "Везучий рыбак");
    addSkillBranch("cook_subclass_2_defensive", "Броня и Блокирование", 1, 4);
    addSkillBranch("cook_subclass_2_life", "Здоровье", 1, 4);
    addSkillBranch("cook_subclass_2_crafting", "Опыт за рыбалку", 1, 5);
    // alchemist skills
    addSkill("alchemist_class", "Алхимик");
    addSkill("alchemist_crafting_notable_1", "Эксперимент");
    addSkill("alchemist_defensive_notable_1", "Улучшенные рефлексы");
    addSkill("alchemist_offensive_notable_1", "Жестокость");
    addSkill("alchemist_life_notable_1", "Зависимость");
    addSkill("alchemist_speed_notable_1", "Адреналин");
    addSkill("alchemist_healing_notable_1", "Зелье крови");
    addSkill("alchemist_crit_notable_1", "Интоксикация");
    addSkill("alchemist_defensive_crafting_keystone_1", "Чистота");
    addSkill("alchemist_offensive_crafting_keystone_1", "Стойкий токсин");
    addSkill("alchemist_defensive_keystone_1", "Мутация");
    addSkill("alchemist_offensive_keystone_1", "Передозировка");
    addSkill("alchemist_mastery", "Секретный ингредиент");
    addSkill("alchemist_gateway", "Духовные врата", "Соединяются с духовными вратами");
    addSkillBranch("alchemist_crafting", "Усиление создаваемых зелий", 1, 3);
    addSkillBranch("alchemist_offensive_crafting", "Усиление создаваемых вредящих зелий", 1, 7);
    addSkillBranch("alchemist_defensive_crafting", "Усиление создаваемых благотворных зелий", 1, 7);
    addSkillBranch("alchemist_offensive", "Урон по отравленным", 1, 8);
    addSkillBranch("alchemist_defensive", "Уклонение", 1, 8);
    addSkillBranch("alchemist_lesser", "Длительность создаваемых зелий", 1, 6);
    addSkillBranch("alchemist_life", "Здоровье", 1, 2);
    addSkillBranch("alchemist_speed", "Скорость атаки", 1, 2);
    addSkillBranch("alchemist_crit", "Шанс крита", 1, 2);
    addSkillBranch("alchemist_healing", "Здоровье за удар", 1, 4);
    // assassin skills
    addSkill("alchemist_subclass_1", "Ассасин");
    addSkill("alchemist_subclass_1_mastery", "Потрошение");
    addSkill("alchemist_subclass_1_crafting_notable_1", "Отравитель");
    addSkill("alchemist_subclass_1_offensive_notable_1", "Удар в спину");
    addSkill("alchemist_subclass_special", "Шипастые кольца");
    addSkillBranch("alchemist_subclass_1_defensive", "Броня и Уклонение", 1, 4);
    addSkillBranch("alchemist_subclass_1_offensive", "Шанс крита", 1, 4);
    addSkillBranch("alchemist_subclass_1_crafting", "Усиление создаваемых вредящих зелий", 1, 5);
    // healer skills
    addSkill("alchemist_subclass_2", "Лекарь");
    addSkill("alchemist_subclass_2_mastery", "Самолечение");
    addSkill("alchemist_subclass_2_crafting_notable_1", "Панацея");
    addSkill("alchemist_subclass_2_life_notable_1", "Крепкое здоровье");
    addSkillBranch("alchemist_subclass_2_defensive", "Уклонение", 1, 4);
    addSkillBranch("alchemist_subclass_2_life", "Здоровье и Получаемое лечение", 1, 4);
    addSkillBranch(
        "alchemist_subclass_2_crafting", "Усиление создаваемых благотворных зелий", 1, 5);
    // enchanter skills
    addSkill("enchanter_class", "Зачарователь");
    addSkill("enchanter_crafting_notable_1", "Магический поток");
    addSkill("enchanter_defensive_notable_1", "Рунический барьер");
    addSkill("enchanter_offensive_notable_1", "Руническое лезвие");
    addSkill("enchanter_life_notable_1", "Жизнь из магии");
    addSkill("enchanter_speed_notable_1", "Оживленное оружие");
    addSkill("enchanter_healing_notable_1", "Энергетическая призма");
    addSkill("enchanter_crit_notable_1", "Жнец");
    addSkill("enchanter_defensive_crafting_keystone_1", "Руна защиты");
    addSkill("enchanter_offensive_crafting_keystone_1", "Руна разрушения");
    addSkill("enchanter_defensive_keystone_1", "Эгида");
    addSkill("enchanter_offensive_keystone_1", "Экскалибур");
    addSkill("enchanter_mastery", "Сокрытое знание");
    addSkill("enchanter_gateway", "Астральные врата", "Соединяются с астральными вратами");
    addSkillBranch("enchanter_crafting", "Шанс бесплатного зачарования", 1, 3);
    addSkillBranch("enchanter_offensive_crafting", "Усиление зачарований оружия", 1, 7);
    addSkillBranch("enchanter_defensive_crafting", "Усиление зачарований брони", 1, 7);
    addSkillBranch("enchanter_offensive", "Урон с зачарованным оружием", 1, 8);
    addSkillBranch("enchanter_defensive", "Блокирование", 1, 8);
    addSkillBranch("enchanter_lesser", "Требование к уровню для зачарований", 1, 6);
    addSkillBranch("enchanter_life", "Здоровье", 1, 2);
    addSkillBranch("enchanter_speed", "Скорость атаки", 1, 2);
    addSkillBranch("enchanter_crit", "Шанс крита", 1, 2);
    addSkillBranch("enchanter_healing", "Здоровье при блоке", 1, 4);
    // arsonist skills
    addSkill("enchanter_subclass_1", "Поджигатель");
    addSkill("enchanter_subclass_1_mastery", "Испепеление");
    addSkill("enchanter_subclass_1_crafting_notable_1", "Пламенный клинок");
    addSkill("enchanter_subclass_1_offensive_notable_1", "Опалённая плоть");
    addSkill("enchanter_subclass_special", "Адские колчаны");
    addSkillBranch("enchanter_subclass_1_defensive", "Блокирование и Уклонение", 1, 4);
    addSkillBranch("enchanter_subclass_1_offensive", "Урон по горящим", 1, 4);
    addSkillBranch("enchanter_subclass_1_crafting", "Шанс поджога создаваемого оружия", 1, 5);
    // scholar skills
    addSkill("enchanter_subclass_2", "Учёный");
    addSkill("enchanter_subclass_2_mastery", "Изучение звёзд");
    addSkill("enchanter_subclass_2_crafting_notable_1", "Изучение минералов");
    addSkill("enchanter_subclass_2_life_notable_1", "Медитация");
    addSkillBranch("enchanter_subclass_2_defensive", "Блокирование", 1, 4);
    addSkillBranch("enchanter_subclass_2_life", "Здоровье и Прирост опыта", 1, 4);
    addSkillBranch("enchanter_subclass_2_crafting", "Прирост опыта", 1, 5);
    // blacksmith skills
    addSkill("blacksmith_class", "Кузнец");
    addSkill("blacksmith_crafting_notable_1", "Создатель щитов");
    addSkill("blacksmith_defensive_notable_1", "Железный панцирь");
    addSkill("blacksmith_offensive_notable_1", "Противовес");
    addSkill("blacksmith_life_notable_1", "Уверенная стойка");
    addSkill("blacksmith_speed_notable_1", "Амбидекстр");
    addSkill("blacksmith_healing_notable_1", "Укрытие");
    addSkill("blacksmith_crit_notable_1", "Столкновение");
    addSkill("blacksmith_defensive_crafting_keystone_1", "Крепкий металл");
    addSkill("blacksmith_offensive_crafting_keystone_1", "Лёгкий сплав");
    addSkill("blacksmith_defensive_keystone_1", "Живая крепость");
    addSkill("blacksmith_offensive_keystone_1", "Колосс");
    addSkill("blacksmith_mastery", "Чёрная сталь");
    addSkill(
        "blacksmith_gateway", "Пространственные врата", "Соединяются с пространственными вратами");
    addSkillBranch("blacksmith_crafting", "Защита создаваемых щитов", 1, 3);
    addSkillBranch("blacksmith_offensive_crafting", "Урон создаваемого оружия ближнего боя", 1, 7);
    addSkillBranch("blacksmith_defensive_crafting", "Защита создаваемой брони", 1, 7);
    addSkillBranch("blacksmith_offensive", "Урон с экипированным щитом", 1, 8);
    addSkillBranch("blacksmith_defensive", "Броня", 1, 8);
    addSkillBranch("blacksmith_lesser", "Прочность создаваемой экипировки", 1, 6);
    addSkillBranch("blacksmith_life", "Здоровье", 1, 2);
    addSkillBranch("blacksmith_speed", "Скорость атаки", 1, 2);
    addSkillBranch("blacksmith_crit", "Шанс крита", 1, 2);
    addSkillBranch("blacksmith_healing", "Регенерация здоровья", 1, 4);
    // soldier skills
    addSkill("blacksmith_subclass_1", "Солдат");
    addSkill("blacksmith_subclass_1_mastery", "Военная подготовки");
    addSkill("blacksmith_subclass_1_crafting_notable_1", "Заточка");
    addSkill("blacksmith_subclass_1_offensive_notable_1", "Опытный боец");
    addSkill("blacksmith_subclass_special", "Жадные клинки");
    addSkillBranch("blacksmith_subclass_1_defensive", "Броня и Блокирование", 1, 4);
    addSkillBranch("blacksmith_subclass_1_offensive", "Урон в ближнем бою и Блокирование", 1, 4);
    addSkillBranch(
        "blacksmith_subclass_1_crafting", "Шанс крита создаваемого оружия ближнего боя", 1, 5);
    // artisan skills
    addSkill("blacksmith_subclass_2", "Ремесленник");
    addSkill("blacksmith_subclass_2_mastery", "Мастер на все руки");
    addSkill("blacksmith_subclass_2_crafting_notable_1", "Облегчённые щиты");
    addSkill("blacksmith_subclass_2_life_notable_1", "Закалено в крови");
    addSkillBranch("blacksmith_subclass_2_defensive", "Броня", 1, 4);
    addSkillBranch("blacksmith_subclass_2_life", "Здоровье от создаваемой брони", 1, 4);
    addSkillBranch("blacksmith_subclass_2_crafting", "Эффективность починки", 1, 5);
    // miner skills
    addSkill("miner_class", "Шахтёр");
    addSkill("miner_crafting_notable_1", "Раскопки");
    addSkill("miner_defensive_notable_1", "Защитная каска");
    addSkill("miner_offensive_notable_1", "Полировка");
    addSkill("miner_life_notable_1", "Кристалл жизни");
    addSkill("miner_speed_notable_1", "Лёгкие кристаллы");
    addSkill("miner_healing_notable_1", "Исцеляющий кристалл");
    addSkill("miner_crit_notable_1", "Проклятый камень");
    addSkill("miner_defensive_crafting_keystone_1", "Куллинан");
    addSkill("miner_offensive_crafting_keystone_1", "Звезда Фуры");
    addSkill("miner_defensive_keystone_1", "Каменное сердце");
    addSkill("miner_offensive_keystone_1", "Драгоценное оружие");
    addSkill("miner_mastery", "Алчность");
    addSkill("miner_gateway", "Астральные врата", "Соединяются с астральными вратами");
    addSkillBranch("miner_crafting", "Преумножение самоцветов", 1, 3);
    addSkillBranch("miner_offensive_crafting", "Сила Самоцветов в оружии", 1, 7);
    addSkillBranch("miner_defensive_crafting", "Сила Самоцветов в броне", 1, 7);
    addSkillBranch("miner_offensive", "Урон с Самоцветами в оружии", 1, 8);
    addSkillBranch("miner_defensive", "Броня", 1, 8);
    addSkillBranch("miner_lesser", "Скорость добычи с киркой", 1, 6);
    addSkillBranch("miner_life", "Здоровье", 1, 2);
    addSkillBranch("miner_speed", "Скорость атаки", 1, 2);
    addSkillBranch("miner_crit", "Шанс крита", 1, 2);
    addSkillBranch("miner_healing", "Регенерация здоровья", 1, 4);
    // explorer skills
    addSkill("miner_subclass_1", "Исследователь");
    addSkill("miner_subclass_1_mastery", "Первооткрыватель");
    addSkill("miner_subclass_1_crafting_notable_1", "Сапоги скороходы");
    addSkill("miner_subclass_1_offensive_notable_1", "Спешка");
    addSkill("miner_subclass_special", "Декоративные ботинки");
    addSkillBranch("miner_subclass_1_defensive", "Броня", 1, 4);
    addSkillBranch("miner_subclass_1_offensive", "Скорость атаки", 1, 4);
    addSkillBranch("miner_subclass_1_crafting", "Скорость от создаваемых ботинок", 1, 5);
    // jeweler skills
    addSkill("miner_subclass_2", "Ювелир");
    addSkill("miner_subclass_2_mastery", "Аристократ");
    addSkill("miner_subclass_2_crafting_notable_1", "Осколки звёзд");
    addSkill("miner_subclass_2_life_notable_1", "Оберег");
    addSkillBranch("miner_subclass_2_defensive", "Броня и Уклонение", 1, 4);
    addSkillBranch("miner_subclass_2_life", "Здоровье", 1, 4);
    addSkillBranch("miner_subclass_2_crafting", "Сила самоцветов в бижутерии", 1, 5);
    // skill bonuses
    add(PSTSkillBonuses.DAMAGE.get(), "Урон");
    add(PSTSkillBonuses.CRIT_DAMAGE.get(), "Критический урон");
    add(PSTSkillBonuses.CRIT_CHANCE.get(), "Шанс критического удара");
    add(PSTSkillBonuses.CRAFTED_ITEM_BONUS.get(), "Создаваем%s: %s");
    add(PSTSkillBonuses.GEM_POWER.get(), "Самоцветы вставляемые в %s: %s");
    add(PSTSkillBonuses.GEM_POWER.get(), "bonus", "Сила Эффектов");
    add(PSTSkillBonuses.PLAYER_SOCKETS.get(), "Гнёзда Самоцветов в %s");
    add(PSTSkillBonuses.BLOCK_BREAK_SPEED.get(), "Скорость добычи Блоков");
    add(PSTSkillBonuses.REPAIR_EFFICIENCY.get(), "Ремонтируем%s: %s");
    add(PSTSkillBonuses.REPAIR_EFFICIENCY.get(), "bonus", "Прочности восстановлено");
    add(PSTSkillBonuses.ENCHANTMENT_AMPLIFICATION.get(), "%s: %s");
    add(PSTSkillBonuses.ENCHANTMENT_AMPLIFICATION.get(), "bonus", "Шанс усиления");
    add(PSTSkillBonuses.ENCHANTMENT_REQUIREMENT.get(), "Зачарование: %s");
    add(PSTSkillBonuses.ENCHANTMENT_REQUIREMENT.get(), "bonus", "Требование к уровню");
    add(PSTSkillBonuses.FREE_ENCHANTMENT.get(), "Зачарование: %s");
    add(PSTSkillBonuses.FREE_ENCHANTMENT.get(), "bonus", "Шанс бесплатного зачарование");
    add(PSTSkillBonuses.RECIPE_UNLOCK.get(), "Открывает рецепт: %s");
    add(PSTSkillBonuses.JUMP_HEIGHT.get(), "Высота прыжка");
    add(PSTSkillBonuses.INCOMING_HEALING.get(), "Получаемое лечение");
    add(PSTSkillBonuses.LOOT_DUPLICATION.get(), "Шанс получить +%s%% %s");
    add(PSTSkillBonuses.GAINED_EXPERIENCE.get(), "Опыт %s");
    add(PSTSkillBonuses.IGNITE_CHANCE.get(), "Шанс наложить Поджог на %s");
    add(PSTSkillBonuses.ARROW_RETRIEVAL.get(), "Шанс вернуть стрелы");
    add(PSTSkillBonuses.HEALTH_RESERVATION.get(), "Удержание здоровья");
    add(PSTSkillBonuses.ALL_ATTRIBUTES.get(), "Все характеристики");
    add(PSTSkillBonuses.EFFECT_ON_ATTACK.get(), "Шанс наложить %s на %s");
    // item bonuses
    add(PSTItemBonuses.SOCKETS.get(), "+%d Гнезда для Самоцветов");
    add(PSTItemBonuses.DURABILITY.get(), "Прочность");
    add(PSTItemBonuses.QUIVER_CAPACITY.get(), "Вместимость");
    add(PSTItemBonuses.POTION_AMPLIFICATION.get(), "Шанс Усиления");
    add(PSTItemBonuses.POTION_DURATION.get(), "Длительность");
    add(PSTItemBonuses.FOOD_EFFECT.get(), "%s на %s");
    add(PSTItemBonuses.FOOD_SATURATION.get(), "Насыщение");
    add(PSTItemBonuses.FOOD_HEALING.get(), "Восстанавливает %s Здоровья");
    // experience sources
    add(GainedExperienceBonus.ExperienceSource.MOBS.getDescriptionId(), "с Существ");
    add(GainedExperienceBonus.ExperienceSource.ORE.getDescriptionId(), "из Руды");
    add(GainedExperienceBonus.ExperienceSource.FISHING.getDescriptionId(), "за Рыбалку");
    // loot conditions
    add(LootDuplicationBonus.LootType.MOBS.getDescriptionId(), "Награды с существ");
    add(LootDuplicationBonus.LootType.FISHING.getDescriptionId(), "Награды с рыбалки");
    add(LootDuplicationBonus.LootType.GEMS.getDescriptionId(), "Самоцветы из руды");
    // living conditions
    add(PSTLivingConditions.EFFECT_AMOUNT.get(), "target.you", "Вас есть");
    add(PSTLivingConditions.EFFECT_AMOUNT.get(), "target.target", "Цели");
    add(PSTLivingConditions.EFFECT_AMOUNT.get(), "min.1", "%s если на %s есть Эффекты");
    add(PSTLivingConditions.EFFECT_AMOUNT.get(), "min", "%s если на %s минимум %d Эффектов");
    add(PSTLivingConditions.EFFECT_AMOUNT.get(), "max", "%s если на %s максимум %d Эффектов");
    add(PSTLivingConditions.EFFECT_AMOUNT.get(), "range", "%s если на %s от %d до %d Эффектов");
    add(PSTLivingConditions.HEALTH_PERCENTAGE.get(), "target.you", "если у Вас");
    add(PSTLivingConditions.HEALTH_PERCENTAGE.get(), "target.target", "если у Цели");
    add(PSTLivingConditions.HEALTH_PERCENTAGE.get(), "min", "%s %s минимум %s%% здоровья");
    add(PSTLivingConditions.HEALTH_PERCENTAGE.get(), "max", "%s %s максимум %s%% здоровья");
    add(PSTLivingConditions.HEALTH_PERCENTAGE.get(), "range", "%s %s от %s%% до %s%% здоровья");
    add(PSTLivingConditions.HAS_ITEM_EQUIPPED.get(), "target.you", "Вас");
    add(PSTLivingConditions.HAS_ITEM_EQUIPPED.get(), "target.target", "Цели");
    add(PSTLivingConditions.HAS_ITEM_EQUIPPED.get(), "%s если на %s %s");
    add(PSTLivingConditions.HAS_GEMS.get(), "target.you", "если у Вас есть");
    add(PSTLivingConditions.HAS_GEMS.get(), "target.target", "если у Цели есть");
    add(PSTLivingConditions.HAS_GEMS.get(), "min.1", "%s %s Самоцветы в %s");
    add(PSTLivingConditions.HAS_GEMS.get(), "min", "%s %s минимум %d Самоцветов в %s");
    add(PSTLivingConditions.HAS_GEMS.get(), "max", "%s %s максимум %d Самоцветов в %s");
    add(PSTLivingConditions.HAS_GEMS.get(), "range", "%s %s от %d до %d Самоцветов в %s");
    add(PSTLivingConditions.HAS_EFFECT.get(), "target.you", "Вас");
    add(PSTLivingConditions.HAS_EFFECT.get(), "target.target", "Цель");
    add(PSTLivingConditions.HAS_EFFECT.get(), "%s если на %s действует %s");
    add(PSTLivingConditions.HAS_EFFECT.get(), "amplifier", "%s если на %s действует %s или выше");
    add(PSTLivingConditions.BURNING.get(), "target.you", "Вы горите");
    add(PSTLivingConditions.BURNING.get(), "target.target", "Цель горит");
    add(PSTLivingConditions.BURNING.get(), "%s если %s");
    add(PSTLivingConditions.ATTRIBUTE_VALUE.get(), "target.you", "у Вас");
    add(PSTLivingConditions.ATTRIBUTE_VALUE.get(), "target.target", "у Цели");
    add(PSTLivingConditions.ATTRIBUTE_VALUE.get(), "min", "%s если %s минимум %s %s");
    add(PSTLivingConditions.ATTRIBUTE_VALUE.get(), "max", "%s если %s максимум %s %s");
    add(PSTLivingConditions.ATTRIBUTE_VALUE.get(), "range", "%s если %s от %s%% до %s %s");
    add(PSTLivingConditions.FOOD_LEVEL.get(), "target.you", "у Вас");
    add(PSTLivingConditions.FOOD_LEVEL.get(), "target.target", "у Цели");
    add(PSTLivingConditions.FOOD_LEVEL.get(), "min", "%s если %s минимум %s очков Голода");
    add(PSTLivingConditions.FOOD_LEVEL.get(), "max", "%s если %s максимум %s очков Голода");
    add(PSTLivingConditions.FOOD_LEVEL.get(), "range", "%s если %s от %s%% до %s очков Голода");
    add(PSTLivingConditions.FISHING.get(), "target.you", "Вы рыбачите");
    add(PSTLivingConditions.FISHING.get(), "target.target", "Цель рыбачит");
    add(PSTLivingConditions.FISHING.get(), "%s если %s");
    add(PSTLivingConditions.UNDERWATER.get(), "target.you", "Вы");
    add(PSTLivingConditions.UNDERWATER.get(), "target.target", "Цель");
    add(PSTLivingConditions.UNDERWATER.get(), "%s если %s под водой");
    add(PSTLivingConditions.DUAL_WIELDING.get(), "target.you", "Вы держите");
    add(PSTLivingConditions.DUAL_WIELDING.get(), "target.target", "Цель держит");
    add(PSTLivingConditions.DUAL_WIELDING.get(), "%s если %s %s в обеих руках");
    add(PSTLivingConditions.HAS_ITEM_IN_HAND.get(), "target.you", "Вас");
    add(PSTLivingConditions.HAS_ITEM_IN_HAND.get(), "target.target", "Цели");
    add(PSTLivingConditions.HAS_ITEM_IN_HAND.get(), "%s если у %s в руке %s");
    // damage conditions
    add(PSTDamageConditions.IS_PROJECTILE.get(), "Урон снарядов");
    add(PSTDamageConditions.IS_MELEE.get(), "Урон в ближнем бою");
    add(PSTDamageConditions.NONE.get(), "Урон");
    // enchantment conditions
    add(PSTEnchantmentConditions.WEAPON.get(), "Зачарование оружия");
    add(PSTEnchantmentConditions.ARMOR.get(), "Зачарование брони");
    add(PSTEnchantmentConditions.NONE.get(), "Зачарование");
    // item conditions
    add(PSTItemConditions.NONE.get(), "Предмет");
    add(PSTItemConditions.NONE.get(), "where", "Предмете");
    add(PSTItemConditions.NONE.get(), "type", "ый Предмет");
    add(PSTItemConditions.NONE.get(), "plural.type", "ые Предметы");
    add(PSTItemConditions.WEAPON.get(), "any", "Оружие");
    add(PSTItemConditions.WEAPON.get(), "any.where", "Оружии");
    add(PSTItemConditions.WEAPON.get(), "any.type", "ое Оружие");
    add(PSTItemConditions.WEAPON.get(), "any.plural.type", "ое Оружие");
    add(PSTItemConditions.WEAPON.get(), "ranged", "Оружие дальнего боя");
    add(PSTItemConditions.WEAPON.get(), "ranged.where", "Оружии дальнего боя");
    add(PSTItemConditions.WEAPON.get(), "ranged.type", "ое Оружие дальнего боя");
    add(PSTItemConditions.WEAPON.get(), "ranged.plural.type", "ое Оружие дальнего боя");
    add(PSTItemConditions.WEAPON.get(), "bow", "Лук");
    add(PSTItemConditions.WEAPON.get(), "bow.where", "Луке");
    add(PSTItemConditions.WEAPON.get(), "bow.type", "ый Лук");
    add(PSTItemConditions.WEAPON.get(), "bow.plural.type", "ые Луки");
    add(PSTItemConditions.WEAPON.get(), "crossbow", "Арбалет");
    add(PSTItemConditions.WEAPON.get(), "crossbow.where", "Арбалете");
    add(PSTItemConditions.WEAPON.get(), "crossbow.type", "ый Арбалет");
    add(PSTItemConditions.WEAPON.get(), "crossbow.plural.type", "ые Арбалеты");
    add(PSTItemConditions.WEAPON.get(), "melee", "Оружие ближнего боя");
    add(PSTItemConditions.WEAPON.get(), "melee.where", "Оружии ближнего боя");
    add(PSTItemConditions.WEAPON.get(), "melee.type", "ое Оружие ближнего боя");
    add(PSTItemConditions.WEAPON.get(), "melee.plural.type", "ое Оружие ближнего боя");
    add(PSTItemConditions.WEAPON.get(), "axe", "Топор");
    add(PSTItemConditions.WEAPON.get(), "axe.where", "Топоре");
    add(PSTItemConditions.WEAPON.get(), "axe.type", "ый Топор");
    add(PSTItemConditions.WEAPON.get(), "axe.plural.type", "ые Топоры");
    add(PSTItemConditions.WEAPON.get(), "sword", "Меч");
    add(PSTItemConditions.WEAPON.get(), "sword.where", "Мече");
    add(PSTItemConditions.WEAPON.get(), "sword.type", "ый Меч");
    add(PSTItemConditions.WEAPON.get(), "sword.plural.type", "ые Мечи");
    add(PSTItemConditions.WEAPON.get(), "trident", "Трезубец");
    add(PSTItemConditions.WEAPON.get(), "trident.where", "Трезубце");
    add(PSTItemConditions.WEAPON.get(), "trident.type", "ый Трезубец");
    add(PSTItemConditions.WEAPON.get(), "trident.plural.type", "ые Трезубцы");
    add(PSTItemConditions.CURIO.get(), "ring", "Кольцо");
    add(PSTItemConditions.CURIO.get(), "ring.where", "Кольцах");
    add(PSTItemConditions.CURIO.get(), "ring.type", "ое Кольцо");
    add(PSTItemConditions.CURIO.get(), "ring.plural.type", "ые Кольца");
    add(PSTItemConditions.CURIO.get(), "necklace", "Ожерелье");
    add(PSTItemConditions.CURIO.get(), "necklace.type", "ое Ожерелье");
    add(PSTItemConditions.CURIO.get(), "necklace.plural.type", "ые Ожерелья");
    add(PSTItemConditions.CURIO.get(), "quiver", "Колчан");
    add(PSTItemConditions.CURIO.get(), "quiver.where", "Колчане");
    add(PSTItemConditions.CURIO.get(), "quiver.type", "ый Колчан");
    add(PSTItemConditions.CURIO.get(), "quiver.plural.type", "ые Колчаны");
    add(PSTItemConditions.ARMOR.get(), "any", "Броня");
    add(PSTItemConditions.ARMOR.get(), "any.where", "Броне");
    add(PSTItemConditions.ARMOR.get(), "any.type", "ая Броня");
    add(PSTItemConditions.ARMOR.get(), "any.plural.type", "ая Броня");
    add(PSTItemConditions.ARMOR.get(), "helmet", "Шлем");
    add(PSTItemConditions.ARMOR.get(), "helmet.where", "Шлеме");
    add(PSTItemConditions.ARMOR.get(), "helmet.type", "ый Шлем");
    add(PSTItemConditions.ARMOR.get(), "helmet.plural.type", "ые Шлемы");
    add(PSTItemConditions.ARMOR.get(), "chestplate", "Нагрудник");
    add(PSTItemConditions.ARMOR.get(), "chestplate.where", "Нагруднике");
    add(PSTItemConditions.ARMOR.get(), "chestplate.type", "ый Нагрудник");
    add(PSTItemConditions.ARMOR.get(), "chestplate.plural.type", "ые Нагрудники");
    add(PSTItemConditions.ARMOR.get(), "leggings", "Штаны");
    add(PSTItemConditions.ARMOR.get(), "leggings.where", "Штанах");
    add(PSTItemConditions.ARMOR.get(), "leggings.type", "ые Штаны");
    add(PSTItemConditions.ARMOR.get(), "leggings.plural.type", "ые Штаны");
    add(PSTItemConditions.ARMOR.get(), "boots", "Ботинки");
    add(PSTItemConditions.ARMOR.get(), "boots.where", "Ботинках");
    add(PSTItemConditions.ARMOR.get(), "boots.type", "ые Ботинки");
    add(PSTItemConditions.ARMOR.get(), "boots.plural.type", "ые Ботинки");
    add(PSTItemConditions.ARMOR.get(), "shield", "Щит");
    add(PSTItemConditions.ARMOR.get(), "shield.where", "Щите");
    add(PSTItemConditions.ARMOR.get(), "shield.type", "ый Щит");
    add(PSTItemConditions.ARMOR.get(), "shield.plural.type", "ые Щиты");
    add(PSTItemConditions.EQUIPMENT.get(), "Экипировка");
    add(PSTItemConditions.EQUIPMENT.get(), "where", "Экипировке");
    add(PSTItemConditions.EQUIPMENT.get(), "type", "ая Экипировка");
    add(PSTItemConditions.EQUIPMENT.get(), "plural.type", "ая Экипировка");
    add(PSTItemConditions.POTIONS.get(), "any", "Зелье");
    add(PSTItemConditions.POTIONS.get(), "any.type", "ое Зелье");
    add(PSTItemConditions.POTIONS.get(), "any.plural.type", "ые Зелья");
    add(PSTItemConditions.POTIONS.get(), "beneficial", "Благотворное Зелье");
    add(PSTItemConditions.POTIONS.get(), "beneficial.type", "ое Благотворное Зелье");
    add(PSTItemConditions.POTIONS.get(), "beneficial.plural.type", "ые Благотворные Зелья");
    add(PSTItemConditions.POTIONS.get(), "harmful", "Вредящее Зелье");
    add(PSTItemConditions.POTIONS.get(), "harmful.type", "ое Вредящее Зелье");
    add(PSTItemConditions.POTIONS.get(), "harmful.plural.type", "ые Вредящие Зелья");
    add(PSTItemConditions.POTIONS.get(), "neutral", "Нейтральное Зелье");
    add(PSTItemConditions.POTIONS.get(), "neutral.type", "ое Нейтральное Зелье");
    add(PSTItemConditions.POTIONS.get(), "neutral.plural.type", "ые Нейтральные Зелья");
    add(PSTItemConditions.FOOD.get(), "Еда");
    add(PSTItemConditions.FOOD.get(), "type", "ая Еда");
    add(PSTItemConditions.FOOD.get(), "plural.type", "ая Еда");
    add(PSTItemConditions.JEWELRY.get(), "Бижутерия");
    add(PSTItemConditions.JEWELRY.get(), "where", "Бижутерии");
    add(PSTItemConditions.JEWELRY.get(), "type", "ая Бижутерия");
    add(PSTItemConditions.JEWELRY.get(), "plural.type", "ая Бижутерия");
    add(PSTItemConditions.TOOL.get(), "any", "Инструмент");
    add(PSTItemConditions.TOOL.get(), "any.where", "Инструменте");
    add(PSTItemConditions.TOOL.get(), "any.type", "ый Инструмент");
    add(PSTItemConditions.TOOL.get(), "any.plural.type", "ые Инструменты");
    add(PSTItemConditions.TOOL.get(), "axe", "Топор");
    add(PSTItemConditions.TOOL.get(), "axe.where", "Топоре");
    add(PSTItemConditions.TOOL.get(), "axe.type", "ый Топор");
    add(PSTItemConditions.TOOL.get(), "axe.plural.type", "ые Топоры");
    add(PSTItemConditions.TOOL.get(), "hoe", "Мотыга");
    add(PSTItemConditions.TOOL.get(), "hoe.where", "Мотыге");
    add(PSTItemConditions.TOOL.get(), "hoe.type", "ая Мотыга");
    add(PSTItemConditions.TOOL.get(), "hoe.plural.type", "ые Мотыги");
    add(PSTItemConditions.TOOL.get(), "pickaxe", "Кирка");
    add(PSTItemConditions.TOOL.get(), "pickaxe.where", "Кирке");
    add(PSTItemConditions.TOOL.get(), "pickaxe.type", "ая Кирка");
    add(PSTItemConditions.TOOL.get(), "pickaxe.plural.type", "ые Кирки");
    add(PSTItemConditions.TOOL.get(), "shovel", "Лопата");
    add(PSTItemConditions.TOOL.get(), "shovel.where", "Лопате");
    add(PSTItemConditions.TOOL.get(), "shovel.type", "ая Лопата");
    add(PSTItemConditions.TOOL.get(), "shovel.plural.type", "ые Лопаты");
    add(PSTItemConditions.ENCHANTED.get(), "Зачарованн%s");
    // skill multipliers
    add(PSTLivingMultipliers.EFFECT_AMOUNT.get(), "%s за каждый эффект на вас");
    add(PSTLivingMultipliers.ATTRIBUTE_VALUE.get(), "%s за каждую единицу %s");
    add(PSTLivingMultipliers.ATTRIBUTE_VALUE.get(), "divisor", "%s за каждые %s %s");
    add(PSTLivingMultipliers.ENCHANTS_AMOUNT.get(), "%s за каждое зачарование на %s");
    add(PSTLivingMultipliers.ENCHANTS_LEVELS.get(), "%s за каждый уровень зачарований на %s");
    add(PSTLivingMultipliers.GEMS_AMOUNT.get(), "%s за каждый Самоцвет в %s");
    add(PSTLivingMultipliers.FOOD_LEVEL.get(), "%s за каждую единицу Голода");
    add(PSTLivingMultipliers.DISTANCE_TO_TARGET.get(), "%s за каждый Блок между Вами и Целью");
    add(
        PSTLivingMultipliers.MISSING_HEALTH_POINTS.get(),
        "%s за каждую единицу недостающего здоровья");
    add(
        PSTLivingMultipliers.MISSING_HEALTH_POINTS.get(),
        "divisor",
        "%s за каждые %s недостающего здоровья");
    add(
        PSTLivingMultipliers.MISSING_HEALTH_PERCENTAGE.get(),
        "%s за каждый процент недостающего здоровья");
    add(
        PSTLivingMultipliers.MISSING_HEALTH_PERCENTAGE.get(),
        "divisor",
        "%s за каждые %s недостающего здоровья");
    // recipes
    addRecipe("skilltree:weapon_poisoning", "Отравление Оружия");
    addRecipe("skilltree:potion_mixing", "Смешивание Зелий");
    // potions info
    add("potion.superior", "Качественное %s");
    add("item.minecraft.potion.mixture", "Микстура");
    add("item.minecraft.splash_potion.mixture", "Взрывная микстура");
    add("item.minecraft.lingering_potion.mixture", "Туманная микстура");
    addMixture("ныряния", MobEffects.NIGHT_VISION, MobEffects.WATER_BREATHING);
    addMixture("вечной молодости", MobEffects.HEAL, MobEffects.REGENERATION);
    addMixture("болезни", MobEffects.POISON, MobEffects.WEAKNESS);
    addMixture("филина", MobEffects.INVISIBILITY, MobEffects.NIGHT_VISION);
    addMixture("труса", MobEffects.INVISIBILITY, MobEffects.MOVEMENT_SPEED);
    addMixture("драконьей крови", MobEffects.FIRE_RESISTANCE, MobEffects.REGENERATION);
    addMixture("демона", MobEffects.FIRE_RESISTANCE, MobEffects.DAMAGE_BOOST);
    addMixture("убийцы", MobEffects.HARM, MobEffects.POISON);
    addMixture("антигравитации", MobEffects.JUMP, MobEffects.SLOW_FALLING);
    addMixture("старения", MobEffects.MOVEMENT_SLOWDOWN, MobEffects.WEAKNESS);
    addMixture("атлета", MobEffects.JUMP, MobEffects.MOVEMENT_SPEED);
    addMixture("вора", MobEffects.INVISIBILITY, MobEffects.LUCK);
    addMixture("охотника за сокровищами", MobEffects.LUCK, MobEffects.WATER_BREATHING);
    addMixture("рыцаря", MobEffects.REGENERATION, MobEffects.DAMAGE_BOOST);
    addMixture("замедленного времени", MobEffects.SLOW_FALLING, MobEffects.MOVEMENT_SLOWDOWN);
    addMixture("солдата", MobEffects.HEAL, MobEffects.DAMAGE_BOOST);
    addMixture("ниндзя", MobEffects.DAMAGE_BOOST, MobEffects.MOVEMENT_SPEED);
    addMixture("благословения", MobEffects.LUCK, MobEffects.DAMAGE_BOOST);
    addMixture("чумы", MobEffects.POISON, MobEffects.MOVEMENT_SLOWDOWN);
    // gems info
    add("gem.socket", "Пустое гнездо");
    add("gem.additional_socket_1", "• Имеет дополнительное гнездо");
    add("gem.disabled", "Отключено с модулем приключений Apotheosis");
    add("gem_class_format", "• %s: %s");
    add("gem.tooltip", "• Можно вставить в предметы с гнёздами");
    add("gem_bonus.removal", "Уничтожает Самоцветы в предмете");
    add("gem_bonus.random", "Результат непредсказуем");
    // weapon info
    add("weapon.poisoned", "Отравлено:");
    // quiver info
    add("quiver.capacity", "• Вмещает до %s стрел");
    add("quiver.contents", "• Внутри: %s");
    // items
    addGem("citrine", "цитрин");
    addGem("ruby", "рубин");
    addGem("sapphire", "сапфир");
    addGem("jade", "нефрит");
    addGem("iriscite", "ирисцит");
    addGem("vacucite", "вакуцит");
    add(PSTItems.WISDOM_SCROLL.get(), "Свиток мудрости");
    add(PSTItems.AMNESIA_SCROLL.get(), "Свиток амнезии");
    add(PSTItems.COPPER_RING.get(), "Медное кольцо");
    add(PSTItems.IRON_RING.get(), "Железное кольцо");
    add(PSTItems.GOLDEN_RING.get(), "Золотое кольцо");
    add(PSTItems.COPPER_NUGGET.get(), "Кусочек меди");
    add(PSTItems.ASSASSIN_NECKLACE.get(), "Ожерелье убийцы");
    add(PSTItems.HEALER_NECKLACE.get(), "Ожерелье целителя");
    add(PSTItems.TRAVELER_NECKLACE.get(), "Ожерелье путешественника");
    add(PSTItems.SIMPLE_NECKLACE.get(), "Ожерелье простоты");
    add(PSTItems.SCHOLAR_NECKLACE.get(), "Ожерелье учёного");
    add(PSTItems.ARSONIST_NECKLACE.get(), "Ожерелье поджигателя");
    add(PSTItems.FISHERMAN_NECKLACE.get(), "Ожерелье рыбака");
    add(PSTItems.QUIVER.get(), "Колчан");
    add(PSTItems.ARMORED_QUIVER.get(), "Бронированный колчан");
    add(PSTItems.DIAMOND_QUIVER.get(), "Алмазный колчан");
    add(PSTItems.FIERY_QUIVER.get(), "Огненный колчан");
    add(PSTItems.GILDED_QUIVER.get(), "Позолоченный колчан");
    add(PSTItems.HEALING_QUIVER.get(), "Исцеляющий колчан");
    add(PSTItems.TOXIC_QUIVER.get(), "Токсичный колчан");
    add(PSTItems.SILENT_QUIVER.get(), "Бесшумный колчан");
    add(PSTItems.BONE_QUIVER.get(), "Костяной колчан");
    addTooltip(PSTItems.WISDOM_SCROLL.get(), "Дарует одно очко пассивных умений");
    addTooltip(PSTItems.AMNESIA_SCROLL.get(), "Сбрасывает ваше древо пассивных умений");
    addWarning(PSTItems.AMNESIA_SCROLL.get(), "%d%% очков умений будут потеряны");
    // attributes
    add(PSTAttributes.REGENERATION.get(), "Регенерация здоровья");
    add(PSTAttributes.LIFE_PER_HIT.get(), "Здоровье за удар");
    add(PSTAttributes.EVASION.get(), "Уклонение");
    add(PSTAttributes.BLOCKING.get(), "Блокирование");
    add(PSTAttributes.LIFE_ON_BLOCK.get(), "Здоровье при блоке");
    add(PSTAttributes.EXP_PER_MINUTE.get(), "Опыт в минуту");
    add(CuriosHelper.getOrCreateSlotAttribute("ring"), "Слоты колец");
    add(PSTAttributes.STEALTH.get(), "Скрытность");
    // effects
    add(PSTEffects.CRIT_DAMAGE_BONUS.get(), "Критический урон");
    add(PSTEffects.DAMAGE_BONUS.get(), "Урон");
    add(PSTEffects.LIFE_REGENERATION_BONUS.get(), "Регенерация здоровья");
    // system messages
    add(
        "skilltree.message.reset",
        "Древо пассивных умений изменилось. Ваши очки умений были восстановлены.");
    add("skilltree.message.reset_command", "Ваше древо пассивных умений было сброшено.");
    add("skilltree.message.point_command", "Получено очко пассивных умений.");
    // screen info
    add("widget.skill_points_left", "Очков осталось: %s");
    add("widget.skill_button.not_learned", "Умение не изучено");
    add("widget.skill_button.multiple_bonuses", "%s и %s");
    add("widget.buy_skill_button", "Купить очко умений");
    add("widget.confirm_button", "Подтвердить");
    add("widget.cancel_button", "Отмена");
    add("widget.show_stats", "Список бонусов");
    add("key.categories.skilltree", "Древо пассивных умений");
    add("key.display_skill_tree", "Открыть древо пассивных умений");
    // jei info
    add(
        "skilltree.jei.gem_info",
        "Самоцветы можно вставлять в предметы с гнёздами на кузнечном столе. Выпадают из любой руды с небольшим шансом (требуется инструмент без шёлкового касания).");
    // curios info
    add("curios.identifier.quiver", "Колчан");
    add("curios.modifiers.quiver", "Когда надет:");
    // tabs
    add("itemGroup.skilltree", "Passive Skill Tree");
    // misc
    add("item.modifiers.both_hands", "Когда в руке:");
    // apotheosis compatibility
    add("text.apotheosis.category.curios:ring.plural", "Кольца");
    add("text.apotheosis.category.curios:necklace.plural", "Ожерелья");
    add("gem_class.jewelry", "Бижутерия");
    // affix names
    add("affix.skilltree:jewelry/dmg_reduction/tempered", "Закалённый");
    add("affix.skilltree:jewelry/dmg_reduction/tempered.suffix", "Закалки");
    add("affix.skilltree:jewelry/attribute/immortal", "Бессмертный");
    add("affix.skilltree:jewelry/attribute/immortal.suffix", "Бессмертия");
    add("affix.skilltree:jewelry/attribute/experienced", "Опытный");
    add("affix.skilltree:jewelry/attribute/experienced.suffix", "Опыта");
    add("affix.skilltree:jewelry/attribute/lucky", "Удачливый");
    add("affix.skilltree:jewelry/attribute/lucky.suffix", "Удачи");
    add("affix.skilltree:jewelry/attribute/hasty", "Спешащий");
    add("affix.skilltree:jewelry/attribute/hasty.suffix", "Спешки");
    add("affix.skilltree:jewelry/attribute/greedy", "Жадный");
    add("affix.skilltree:jewelry/attribute/greedy.suffix", "Жадности");
    add("affix.skilltree:jewelry/attribute/healthy", "Здоровый");
    add("affix.skilltree:jewelry/attribute/healthy.suffix", "Здоровья");
  }

  protected void addGem(String type, String name) {
    super.addGem(
        type,
        name,
        "Раскрошенный",
        "Сломанный",
        "Некачественный",
        "Большой",
        "Редкий",
        "Исключительный");
  }
}
