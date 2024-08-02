package net.laleixo.coppernbronze.block.custom;

import net.laleixo.coppernbronze.CoppernBronze;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;

import java.util.List;

public class CopperButtonBlock extends Block {
    public CopperButtonBlock(Properties pProperties){
        super(pProperties);
    }

    @Override
    public void appendHoverText(ItemStack pStack, Item.TooltipContext pContext, List<Component> pTooltipComponents, TooltipFlag pTooltipFlag) {
        pTooltipComponents.add(Component.translatable("tooltip.coppernbronze.copper_button"));
        super.appendHoverText(pStack, pContext, pTooltipComponents, pTooltipFlag);
    }

    //TO DO: CAN BE PRESSED REALLY FAST + SENDS 1 TICK REDSTONE SIGNAL!

    /*
    @Override
    public int tickRate(World worldIn) {
        return 10;
    }
    */
}
