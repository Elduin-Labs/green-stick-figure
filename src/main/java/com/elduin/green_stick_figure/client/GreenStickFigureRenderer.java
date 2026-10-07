package com.elduin.green_stick_figure.client;

import com.elduin.green_stick_figure.GreenStickFigure;
import com.elduin.green_stick_figure.entity.GreenStickFigureEntity;

import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.Identifier;

public class GreenStickFigureRenderer extends MobRenderer<GreenStickFigureEntity, GreenStickFigureRenderState, GreenStickFigureModel> {

	private static final Identifier TEXTURE = GreenStickFigure.id("textures/entity/green_stick_figure/green_stick_figure.png");

	public GreenStickFigureRenderer(EntityRendererProvider.Context context) {
		super(context, new GreenStickFigureModel(context.bakeLayer(GreenStickFigureClient.RED)), 0.4F);
	}

	@Override
	public Identifier getTextureLocation(GreenStickFigureRenderState state) {
		return TEXTURE;
	}

	@Override
	public GreenStickFigureRenderState createRenderState() {
		return new GreenStickFigureRenderState();
	}
}
