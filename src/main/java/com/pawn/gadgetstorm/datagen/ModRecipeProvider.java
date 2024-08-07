package com.pawn.gadgetstorm.datagen;

import com.pawn.gadgetstorm.Gadgetstorm;
import com.pawn.gadgetstorm.block.ModBlocks;
import com.pawn.gadgetstorm.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeExporter;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> VIOSTONE_ORES = List.of(ModBlocks.VIOSTONE_ORE,
            ModBlocks.VIOSTONE_ORE_DEEPSLATE, ModBlocks.VIOSTONE_ORE_NETHER, ModBlocks.VIOSTONE_ORE_END);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(RecipeExporter exporter) {

        offerSmelting(exporter, VIOSTONE_ORES, RecipeCategory.MISC, ModItems.VIOSTONE,
                1.0f, 200, "viostone");


        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.VIOSTONE,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.VIOSTONE_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.MISC, ModItems.DIAMITEC_INGOT,
                RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIAMITEC_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.T1_CORE, 1)
                .pattern(" # ")
                .pattern("#X#")
                .pattern(" # ")
                .input('#', Items.STICK)
                .input('X', Items.REDSTONE)
                .criterion(hasItem(Items.REDSTONE), conditionsFromItem(Items.REDSTONE))
                .offerTo(exporter, new Identifier(getRecipeName(ModItems.T1_CORE)));

        ShapelessRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.DIAMITEC_INGOT, 1)
                .input(Items.IRON_INGOT)
                .input(Items.IRON_INGOT)
                .input(Items.COPPER_INGOT)
                .input(Items.DIAMOND)
                .criterion(hasItem(Items.DIAMOND), conditionsFromItem(Items.DIAMOND))
                .offerTo(exporter, new Identifier(Gadgetstorm.MOD_ID,"diamitec_ingot_from_components"));
    }
}
