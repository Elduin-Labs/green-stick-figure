package com.elduin.green_stick_figure.platform.fabric;

//? fabric {

import com.elduin.green_stick_figure.GreenStickFigure;
import dev.kikugie.fletching_table.annotation.fabric.Entrypoint;
import net.fabricmc.api.ClientModInitializer;

@Entrypoint("client")
public class FabricClientEntrypoint implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		GreenStickFigure.onInitializeClient();
	}

}
//?}
