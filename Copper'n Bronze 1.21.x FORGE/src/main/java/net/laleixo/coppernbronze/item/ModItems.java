package net.laleixo.coppernbronze.item;

import net.laleixo.coppernbronze.CoppernBronze;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems{
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, CoppernBronze.MOD_ID);

    public static final RegistryObject<Item> BRONZEINGOT = ITEMS.register("bronzeingot",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> BRONZENUGGET = ITEMS.register("bronzenugget",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBUS){
        ITEMS.register(eventBUS);
    }
}
