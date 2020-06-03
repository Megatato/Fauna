package io.github.megatato.fauna;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class FaunaItemGroups {
    public static final ItemGroup SEEDS = FabricItemGroupBuilder.create(
        new Identifier(Univar.MODID, "seeds"))
        .icon(() -> new ItemStack(FaunaItems.ACORN))
        .build()
    ;
}