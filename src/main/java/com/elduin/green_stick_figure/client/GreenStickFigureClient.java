package com.elduin.green_stick_figure.client;

import com.elduin.green_stick_figure.GreenStickFigure;
import com.elduin.green_stick_figure.entity.ModEntities;

import net.fabricmc.fabric.api.client.rendering.v1.EntityRendererRegistry;
//? if >=26 {
/*import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
*///? } else {
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
//? }
import net.minecraft.client.model.geom.ModelLayerLocation;

public final class GreenStickFigureClient {

	public static final ModelLayerLocation RED = new ModelLayerLocation(GreenStickFigure.id("green_stick_figure"), "main");

	private GreenStickFigureClient() {
	}

	public static void register() {
		// Fabric renamed its model layer registry in 26.
		//? if >=26 {
		/*ModelLayerRegistry.registerModelLayer(RED, GreenStickFigureModel::createBodyLayer);
		*///? } else {
		EntityModelLayerRegistry.registerModelLayer(RED, GreenStickFigureModel::createBodyLayer);
		//? }
		EntityRendererRegistry.register(ModEntities.RED, GreenStickFigureRenderer::new);
	}
}
