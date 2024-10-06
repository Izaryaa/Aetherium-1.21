package name.aetherium.item;

import name.aetherium.Aetherium;
import name.aetherium.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup AETHERIUM_ITEMS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Aetherium.MOD_ID, "aetherium_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModItems.AETHERIUM_INGOT))
                    .displayName(Text.translatable("itemgroup.aetherium.aetherium_items"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.AETHERIUM_INGOT);
                        entries.add(ModItems.AETHERIUM_SHARD);
                        entries.add(ModItems.AETHERIUM_UPGRADE_SMITHING_TEMPLATE);
                        entries.add(ModItems.AETHERIUM_SWORD);
                        entries.add(ModItems.AETHERIUM_PICKAXE);
                        entries.add(ModItems.AETHERIUM_AXE);
                        entries.add(ModItems.AETHERIUM_SHOVEL);
                        entries.add(ModItems.AETHERIUM_HOE);
                        entries.add(ModItems.AETHERIUM_HELMET);
                        entries.add(ModItems.AETHERIUM_CHESTPLATE);
                        entries.add(ModItems.AETHERIUM_LEGGINGS);
                        entries.add(ModItems.AETHERIUM_BOOTS);
                        entries.add(ModBlocks.AETHERIUM_BLOCK);
                        entries.add(ModBlocks.AETHERIUM_SHARD_ORE);
                        entries.add(ModBlocks.DEEPSLATE_AETHERIUM_SHARD_ORE);

                    }).build());

    public static void registerItemGroups() {
        Aetherium.LOGGER.info("Registering Item Groups for" + Aetherium.MOD_ID);
    }

}
