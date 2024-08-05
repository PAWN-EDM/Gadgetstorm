package com.pawn.gadgetstorm.item;

import com.pawn.gadgetstorm.Gadgetstorm;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item T1_CORE = registerItem("t1_core", new Item(new FabricItemSettings()));
    public static final Item DIAMITEC_INGOT = registerItem("diamitec_ingot", new Item(new FabricItemSettings()));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Gadgetstorm.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Gadgetstorm.LOGGER.info("Registering Mod Items For " + Gadgetstorm.MOD_ID);
    }
}
