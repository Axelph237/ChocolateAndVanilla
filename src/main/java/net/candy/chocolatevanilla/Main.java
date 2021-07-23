package net.candy.chocolatevanilla;

import com.ibm.icu.impl.CacheValue;
import net.candy.chocolatevanilla.item.TeaItem;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Main implements ModInitializer {

	public static final Item SWEET_BERRY_PIE = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(5F/7F).build()));
	public static final Item APPLE_PIE = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(5F/8F).build()));
	public static final Item GLOW_BERRY_PIE = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(5F/6F).build()));
	public static final Item CARROT_CAKE = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(6).saturationModifier(5F/6F).build()));
	public static final Item BEETROOT_SEED_CAKE = new Item(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(10).saturationModifier(13F/10F).build()));
	public static final MushroomStewItem BEEF_STROGANOFF = new MushroomStewItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(12).saturationModifier(12F/14F).build()));
	public static final Item JAM_SANDWICH = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(6F/7F).build()));
	public static final Item HONEY_SANDWICH = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(6F/7F).build()));
	public static final Item CHOCOLATE_MILK = new MilkBucketItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).build()));
	public static final Item HOT_CHOCOLATE = new MilkBucketItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(4).saturationModifier(3F/4F).build()));
	public static final Item BUCKET_OF_CHOCOLATE_ICECREAM = new MilkBucketItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(4).saturationModifier(3F/4F).build()));
	public static final Item GRILLED_BEETROOT = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(6F/5F).build()));
	public static final Item BRAISED_BAMBOO = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(5).saturationModifier(1F).build()));
	public static final Item ROASTED_PUMPKIN_SEEDS = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(2F/3F).snack().build()));
	public static final Item ROASTED_MELON_SEEDS = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(2F/3F).snack().build()));
	public static final MushroomStewItem SQUID_INK_PASTA = new MushroomStewItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(8).saturationModifier(6F/8F).build()));
	public static final MushroomStewItem GLOW_SQUID_INK_PASTA = new MushroomStewItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(5).saturationModifier(4F/5F).statusEffect(new StatusEffectInstance(StatusEffects.NIGHT_VISION, 200, 0), 1F).build()));
	public static final Item CHICKEN_SANDWICH = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(9F/8F).build()));
	public static final Item FISH_SANDWICH = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(8F/7F).build()));
	public static final Item SUSHI = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(9).saturationModifier(1F).build()));
	public static final TeaItem WATERMELON_AGUA_FRESCA = new TeaItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).build()));
	public static final TeaItem CHORUS_FRUIT_AGUA_FRESCA = new TeaItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).build()));
	public static final TeaItem ENCHANTEA = new TeaItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(4).saturationModifier(18F/4F).build()));
	public static final TeaItem ROSE_TEA = new TeaItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).build()));
	public static final TeaItem WITHER_ROSE_TEA = new TeaItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(4).saturationModifier(0.5F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 1F).build()));
	public static final Item CANDIED_TULIP_PETALS = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(3).saturationModifier(1F/3F).snack().build()));
	public static final MushroomStewItem PUFFERFISH_STEW = new MushroomStewItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(9).saturationModifier(13F/9F).build()));
	public static final Item FRIED_EGG = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(4).saturationModifier(4F).build()));
	public static final MushroomStewItem SCALDING_STEW = new MushroomStewItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(1).food(new FoodComponent.Builder().hunger(14).saturationModifier(1F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 1F).build()));
	public static final TeaItem SPIKED_BERRY_TEA = new TeaItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(7).saturationModifier(6F/7F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 100, 0), 1F).build()));
	public static final TeaItem DRAGONS_SPIRIT = new TeaItem(new FabricItemSettings().group(ItemGroup.FOOD).maxCount(16).food(new FoodComponent.Builder().hunger(7).saturationModifier(6F/7F).statusEffect(new StatusEffectInstance(StatusEffects.NAUSEA, 200, 0), 1F).build()));
	public static final Item CHICHARONES = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(8).saturationModifier(7F/8F).snack().build()));
	public static final Item JELLIED_ENDER_EYE = new Item(new FabricItemSettings().group(ItemGroup.FOOD).food(new FoodComponent.Builder().hunger(7).saturationModifier(6F/7F).snack().build()));

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "sweet_berry_pie"), SWEET_BERRY_PIE);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "apple_pie"), APPLE_PIE);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "glow_berry_pie"), GLOW_BERRY_PIE);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "carrot_cake"), CARROT_CAKE);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "beetroot_seed_cake"), BEETROOT_SEED_CAKE);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "jam_sandwich"), JAM_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "honey_sandwich"), HONEY_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "fish_sandwich"), FISH_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "chicken_sandwich"), CHICKEN_SANDWICH);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "chocolate_milk"), CHOCOLATE_MILK);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "hot_chocolate"), HOT_CHOCOLATE);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "chocolate_icecream_bucket"), BUCKET_OF_CHOCOLATE_ICECREAM);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "grilled_beetroot"), GRILLED_BEETROOT);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "braised_bamboo"), BRAISED_BAMBOO);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "fried_egg"), FRIED_EGG);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "roasted_pumpkin_seeds"), ROASTED_PUMPKIN_SEEDS);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "roasted_melon_seeds"), ROASTED_MELON_SEEDS);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "candied_petals"), CANDIED_TULIP_PETALS);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "fried_membrane"), CHICHARONES);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "jellied_ender_eye"), JELLIED_ENDER_EYE);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "watermelon_juice"), WATERMELON_AGUA_FRESCA);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "chorus_juice"), CHORUS_FRUIT_AGUA_FRESCA);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "rose_tea"), ROSE_TEA);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "wither_rose_tea"), WITHER_ROSE_TEA);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "spiked_berry_tea"), SPIKED_BERRY_TEA);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "dragon_spirit"), DRAGONS_SPIRIT);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "enchantea"), ENCHANTEA);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "sushi"), SUSHI);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "squid_ink_pasta"), SQUID_INK_PASTA);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "glow_squid_ink_pasta"), GLOW_SQUID_INK_PASTA);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "beef_stroganoff"), BEEF_STROGANOFF);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "pufferfish_stew"), PUFFERFISH_STEW);
		Registry.register(Registry.ITEM, new Identifier("chocolate_vanilla", "scalding_stew"), SCALDING_STEW);

		System.out.println("Hello Fabric world!");
	}
}
