package io.github.megatato.fauna;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SpawnEggItem;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class Fauna implements ModInitializer {

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.
		registerBlocks();
		registerItems();
		addSpawnEggs();
	}

	private void registerBlocks(){
		
	}

	private void registerItems(){
		Registry.register(Registry.ITEM, new Identifier(Univar.MODID, "venison"), FaunaItems.VENISON);
		Registry.register(Registry.ITEM, new Identifier(Univar.MODID, "cooked_venison"), FaunaItems.COOKED_VENISON);
		Registry.register(Registry.ITEM, new Identifier(Univar.MODID, "venison_stew"), FaunaItems.VENISON_STEW);
		Registry.register(Registry.ITEM, new Identifier(Univar.MODID, "acorn"), FaunaItems.ACORN);
	}

	private void addSpawnEggs(){
		Registry.register(
			Registry.ITEM,
			new Identifier(Univar.MODID, "deer" + "_spawn_egg"),
			new SpawnEggItem(
				FaunaEntityType.DEER,
				0xc4ac72,
				0xffffff,
				new Item.Settings().group(ItemGroup.MISC)
			)
		);
	}
}
