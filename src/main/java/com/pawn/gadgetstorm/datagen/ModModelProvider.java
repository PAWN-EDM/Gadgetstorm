package com.pawn.gadgetstorm.datagen;

import com.pawn.gadgetstorm.block.ModBlocks;
import com.pawn.gadgetstorm.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DIAMITEC_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VIOSTONE_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VIOSTONE_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VIOSTONE_ORE_DEEPSLATE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VIOSTONE_ORE_NETHER);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.VIOSTONE_ORE_END);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.T1_CORE, Models.GENERATED);
        itemModelGenerator.register(ModItems.DIAMITEC_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.VIOSTONE, Models.GENERATED);
    }
}
