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
    public static final Block VIOSTONE_BLOCK = registerBlock("viostone_block", new Block(FabricBlockSettings.copyOf(Blocks.REDSTONE_BLOCK).mapColor(MapColor.PURPLE)));
    public static final Block VIOSTONE_ORE = registerBlock("viostone_ore", new Block(FabricBlockSettings.copyOf(Blocks.IRON_ORE)));
    public static final Block VIOSTONE_ORE_DEEPSLATE = registerBlock("viostone_ore_deepslate", new Block(FabricBlockSettings.copyOf(Blocks.DEEPSLATE_IRON_ORE)));
    public static final Block VIOSTONE_ORE_END = registerBlock("viostone_ore_end", new Block(FabricBlockSettings.copyOf(Blocks.END_STONE).strength(5.0f, 5.0f)));
    public static final Block VIOSTONE_ORE_NETHER = registerBlock("viostone_ore_nether", new Block(FabricBlockSettings.copyOf(Blocks.NETHERRACK).strength(3.0f, 3.0f)));

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
