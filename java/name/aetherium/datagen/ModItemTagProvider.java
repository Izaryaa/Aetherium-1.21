package name.aetherium.datagen;

import name.aetherium.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.ItemTags;

import java.rmi.registry.Registry;
import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends FabricTagProvider.ItemTagProvider {

    public ModItemTagProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> completableFuture) {
        super(output, completableFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {

        getOrCreateTagBuilder(ItemTags.SWORDS)
                .add(ModItems.AETHERIUM_SWORD);
        getOrCreateTagBuilder(ItemTags.PICKAXES)
                .add(ModItems.AETHERIUM_PICKAXE);
        getOrCreateTagBuilder(ItemTags.AXES)
                .add(ModItems.AETHERIUM_AXE);
        getOrCreateTagBuilder(ItemTags.SHOVELS)
                .add(ModItems.AETHERIUM_SHOVEL);
        getOrCreateTagBuilder(ItemTags.HOES)
                .add(ModItems.AETHERIUM_HOE);

        getOrCreateTagBuilder(ItemTags.HEAD_ARMOR)
                .add(ModItems.AETHERIUM_HELMET);
        getOrCreateTagBuilder(ItemTags.CHEST_ARMOR)
                .add(ModItems.AETHERIUM_CHESTPLATE);
        getOrCreateTagBuilder(ItemTags.LEG_ARMOR)
                .add(ModItems.AETHERIUM_LEGGINGS);
        getOrCreateTagBuilder(ItemTags.FOOT_ARMOR)
                .add(ModItems.AETHERIUM_BOOTS);

        getOrCreateTagBuilder(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.AETHERIUM_HELMET)
                .add(ModItems.AETHERIUM_CHESTPLATE)
                .add(ModItems.AETHERIUM_LEGGINGS)
                .add(ModItems.AETHERIUM_BOOTS);
    }
}
