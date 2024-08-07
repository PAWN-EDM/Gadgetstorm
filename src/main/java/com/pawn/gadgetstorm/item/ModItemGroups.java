package com.pawn.gadgetstorm.item;

import com.pawn.gadgetstorm.Gadgetstorm;
import com.pawn.gadgetstorm.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup GADGET_MAT_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Gadgetstorm.MOD_ID, "gadget_mat"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.gadget_mat"))
                    .icon(() -> new ItemStack(ModItems.T1_CORE)).entries((displayContext, entries) -> {
                        //items
                        entries.add(ModItems.T1_CORE);
                        entries.add(ModItems.DIAMITEC_INGOT);
                        entries.add(ModItems.VIOSTONE);

                        //block items
                        entries.add(ModBlocks.DIAMITEC_BLOCK);
                        entries.add(ModBlocks.VIOSTONE_BLOCK);
                        entries.add(ModBlocks.VIOSTONE_ORE);
                        entries.add(ModBlocks.VIOSTONE_ORE_DEEPSLATE);
                        entries.add(ModBlocks.VIOSTONE_ORE_NETHER);
                        entries.add(ModBlocks.VIOSTONE_ORE_END);

                    }).build());

    public static void registerItemGroups() {
        Gadgetstorm.LOGGER.info("Registering Item Groups For " + Gadgetstorm.MOD_ID);
    }
}
