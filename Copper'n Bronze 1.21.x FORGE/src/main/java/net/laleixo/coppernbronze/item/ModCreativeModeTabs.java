package net.laleixo.coppernbronze.item;

import net.laleixo.coppernbronze.CoppernBronze;
import net.laleixo.coppernbronze.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.Items;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CoppernBronze.MOD_ID);

    public static final RegistryObject<CreativeModeTab> COPPERNBRONZE_TAB = CREATIVE_MODE_TABS.register("coppernbronze_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BRONZE_INGOT.get()))
                    .title(Component.translatable("creativetab.coppernbronze_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(Items.COPPER_INGOT);

                        output.accept(ModItems.BRONZE_INGOT.get());
                        output.accept(ModItems.BRONZE_NUGGET.get());
                        output.accept(ModItems.BRONZE_SWORD.get());

                        output.accept(ModBlocks.BRONZE_BLOCK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus){
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
