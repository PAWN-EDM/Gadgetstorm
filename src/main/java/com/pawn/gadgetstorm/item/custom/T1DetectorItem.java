package com.pawn.gadgetstorm.item.custom;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.util.ActionResult;
import net.minecraft.util.math.BlockPos;

public class T1DetectorItem extends Item {
    public T1DetectorItem(Settings settings) {
        super(settings);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        if(!context.getWorld().isClient()) {
            BlockPos blockClicked = context.getBlockPos();
            PlayerEntity player = context.getPlayer();
            boolean hit = false;


        }

        return ActionResult.SUCCESS;
    }
}
