package com.elduin.green_stick_figure.platform.fabric;

//? fabric {

import com.elduin.green_stick_figure.GreenStickFigure;
import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.api.ModInitializer;

@Entrypoint("main")
public class FabricEntrypoint implements ModInitializer {

	@Override
	public void onInitialize() {
		GreenStickFigure.onInitialize();
		FabricEventSubscriber.registerEvents();
	}
}
//?}
