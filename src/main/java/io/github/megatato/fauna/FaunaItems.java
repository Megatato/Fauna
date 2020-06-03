package io.github.megatato.fauna;

import io.github.megatato.fauna.item.food.VenisonStew;
import net.minecraft.item.FoodComponents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;

public class FaunaItems {
    public static final Item VENISON = new Item(
        new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(FoodComponents.MUTTON)
    );

    public static final Item COOKED_VENISON = new Item(
        new Item.Settings()
            .group(ItemGroup.FOOD)
            .food(FoodComponents.COOKED_MUTTON)
    );

    public static final Item VENISON_STEW = new VenisonStew(
        new Item.Settings()
            .group(ItemGroup.FOOD)
            .maxCount(1)
            .food(FoodComponents.COOKED_BEEF)
    );

    public static final Item ACORN = new Item(
        new Item.Settings()
            .group(FaunaItemGroups.SEEDS)
    );
}