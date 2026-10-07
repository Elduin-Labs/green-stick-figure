package com.elduin.green_stick_figure.entity;

import com.elduin.green_stick_figure.GreenStickFigure;

import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityType;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.SpawnEggItem;

public final class ModEntities {

	public static final ResourceKey<EntityType<?>> RED_KEY =
			ResourceKey.create(Registries.ENTITY_TYPE, GreenStickFigure.id("green_stick_figure"));

	// As tall as a player but only a stick wide. It only comes from the spawn egg, so there is no spawn rule.
	public static final EntityType<GreenStickFigureEntity> RED = Registry.register(BuiltInRegistries.ENTITY_TYPE, RED_KEY,
			FabricEntityType.Builder.createMob(GreenStickFigureEntity::new, MobCategory.CREATURE, mob -> mob
							.defaultAttributes(GreenStickFigureEntity::createAttributes))
					.sized(0.5F, 2.0F)
					.clientTrackingRange(10)
					.build(RED_KEY));

	public static final ResourceKey<Item> SPAWN_EGG_KEY =
			ResourceKey.create(Registries.ITEM, GreenStickFigure.id("green_stick_figure_spawn_egg"));

	public static final Item GREEN_SPAWN_EGG = Registry.register(BuiltInRegistries.ITEM, SPAWN_EGG_KEY,
			new SpawnEggItem(new Item.Properties().spawnEgg(RED).setId(SPAWN_EGG_KEY)));

	private ModEntities() {
	}

	public static void register() {
		// Touching this class registers everything above.
	}
}
