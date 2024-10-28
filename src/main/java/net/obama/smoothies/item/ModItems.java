package net.obama.smoothies.item;

import com.ibm.icu.util.Region;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.obama.smoothies.SmoothiesMilkshakes;

public class ModItems {

    public static final Item BLENDER = registerItem("blender", new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(SmoothiesMilkshakes.MOD_ID, name), item);
    }


    public static void registerModItems(){
        SmoothiesMilkshakes.LOGGER.info("Registering Mod Itmes for" + SmoothiesMilkshakes.MOD_ID);
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.FOOD_AND_DRINK).register(entries -> {
            entries.add(BLENDER);
        });
    }
}
