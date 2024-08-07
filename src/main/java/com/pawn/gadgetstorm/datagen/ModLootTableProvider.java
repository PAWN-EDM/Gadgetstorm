package com.pawn.gadgetstorm.datagen;

import com.pawn.gadgetstorm.block.ModBlocks;
import com.pawn.gadgetstorm.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;

public class ModLootTableProvider extends FabricBlockLootTableProvider {
    public ModLootTableProvider(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.DIAMITEC_BLOCK);
        addDrop(ModBlocks.VIOSTONE_BLOCK);

        addDrop(ModBlocks.VIOSTONE_ORE, oreDrops(ModBlocks.VIOSTONE_ORE, ModItems.VIOSTONE));
        addDrop(ModBlocks.VIOSTONE_ORE_DEEPSLATE, oreDrops(ModBlocks.VIOSTONE_ORE_DEEPSLATE, ModItems.VIOSTONE));
        addDrop(ModBlocks.VIOSTONE_ORE_NETHER, oreDrops(ModBlocks.VIOSTONE_ORE_NETHER, ModItems.VIOSTONE));
        addDrop(ModBlocks.VIOSTONE_ORE_END, oreDrops(ModBlocks.VIOSTONE_ORE_END, ModItems.VIOSTONE));
    }
}
