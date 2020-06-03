package io.github.megatato.fauna.item.food;

import java.util.List;

import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraft.text.Text;
import net.minecraft.text.TranslatableText;

public class VenisonStew extends Item {

    public VenisonStew(Settings settings) {
        super(settings);
    }

    @Override
    public void appendTooltip(ItemStack itemStack, World world, List<Text> tooltip, TooltipContext tooltipContext){
        tooltip.add(new TranslatableText("item.fauna.venison_stew.tooltip_1"));
        tooltip.add(new TranslatableText("item.fauna.venison_stew.tooltip_2"));
    }
    
}