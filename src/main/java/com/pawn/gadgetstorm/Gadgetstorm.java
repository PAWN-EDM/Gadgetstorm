package com.pawn.gadgetstorm;

import com.pawn.gadgetstorm.block.ModBlocks;
import com.pawn.gadgetstorm.item.ModItemGroups;
import com.pawn.gadgetstorm.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Gadgetstorm implements ModInitializer {
	public static final String MOD_ID = "gadgetstorm";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}