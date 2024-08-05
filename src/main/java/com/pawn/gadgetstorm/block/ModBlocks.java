package com.pawn.gadgetstorm.block;

import com.pawn.gadgetstorm.Gadgetstorm;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.MapColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {
    public static final Block DIAMITEC_BLOCK = registerBlock("diamitec_block",
            new Block(FabricBlockSettings.copyOf(Blocks.IRON_BLOCK).mapColor(MapColor.CYAN).sounds(BlockSoundGroup.NETHERITE)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, new Identifier(Gadgetstorm.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, new Identifier(Gadgetstorm.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
    }

    public static void registerModBlocks() {
        Gadgetstorm.LOGGER.info("Registering Mod Blocks For " + Gadgetstorm.MOD_ID);
    }
}
