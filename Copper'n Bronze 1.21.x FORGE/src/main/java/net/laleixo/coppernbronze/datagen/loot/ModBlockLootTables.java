package net.laleixo.coppernbronze.datagen.loot;

import net.laleixo.coppernbronze.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collection;
import java.util.Collections;
import java.util.Set;
import java.util.stream.Collectors;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables(HolderLookup.Provider lookupProvider) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), lookupProvider);
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.BRONZE_BLOCK.get());
        this.dropSelf(ModBlocks.COPPER_BUTTON.get());
        /*
        * Block that drops ore else:
        * this.add(ModBlocks.ADAMANTIUM_ORE.get(),
        *   block -> createCustomOreDrops(ModBlocks.ADAMANTIUM_ORE.get(), ModItems.RAW_ADAMANTIUM.get()));
        */
    }
    /*
    *protected LootTable.Builder createCustomOreDrops(Block pBlock, Item item){
    *   return createSilkTouchDispatchTable(pBlock,
    *       this.applyExplosionDecay(pBlock,
    *           LootItem.lootTableItem(item)
    *               .apply(SetItemCountFunction.setCont(UniformGenerator.between(2.0F, 5.0F)))
    *               .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    *}
    */

    @Override
    protected Iterable<Block> getKnownBlocks(){
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
