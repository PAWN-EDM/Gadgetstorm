package com.pawn.gadgetstorm.datagen;

import com.pawn.gadgetstorm.block.ModBlocks;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.block.Block;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends FabricTagProvider.BlockTagProvider {
    public ModBlockTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup arg) {
        getOrCreateTagBuilder(BlockTags.PICKAXE_MINEABLE)
                .add(ModBlocks.DIAMITEC_BLOCK)
                .add(ModBlocks.VIOSTONE_BLOCK)
                .add(ModBlocks.VIOSTONE_ORE)
                .add(ModBlocks.VIOSTONE_ORE_DEEPSLATE)
                .add(ModBlocks.VIOSTONE_ORE_NETHER)
                .add(ModBlocks.VIOSTONE_ORE_END);

        getOrCreateTagBuilder(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.DIAMITEC_BLOCK)
                .add(ModBlocks.VIOSTONE_ORE_NETHER);

        getOrCreateTagBuilder(BlockTags.NEEDS_DIAMOND_TOOL)
                .add(ModBlocks.VIOSTONE_BLOCK)
                .add(ModBlocks.VIOSTONE_ORE)
                .add(ModBlocks.VIOSTONE_ORE_DEEPSLATE);

        getOrCreateTagBuilder(TagKey.of(RegistryKeys.BLOCK, new Identifier("fabric", "needs_tool_level_4")))
                .add(ModBlocks.VIOSTONE_ORE_END);


        getOrCreateTagBuilder(BlockTags.BEACON_BASE_BLOCKS)
                .add(ModBlocks.DIAMITEC_BLOCK);


    }
}
