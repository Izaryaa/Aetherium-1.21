package name.aetherium.datagen;

import name.aetherium.block.ModBlocks;
import name.aetherium.item.ModItems;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import net.minecraft.item.ArmorItem;
import net.minecraft.registry.RegistryWrapper;

import java.util.concurrent.CompletableFuture;

public class ModModelProvider extends FabricModelProvider {

    public ModModelProvider(FabricDataOutput output) {
        super(output);

    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool aetheriumPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.AETHERIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.AETHERIUM_SHARD_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_AETHERIUM_SHARD_ORE);
    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.AETHERIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.AETHERIUM_SHARD, Models.GENERATED);
        itemModelGenerator.register(ModItems.AETHERIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERIUM_PICKAXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERIUM_AXE, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERIUM_SHOVEL, Models.HANDHELD);
        itemModelGenerator.register(ModItems.AETHERIUM_HOE, Models.HANDHELD);

        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERIUM_HELMET));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERIUM_CHESTPLATE));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERIUM_LEGGINGS));
        itemModelGenerator.registerArmor(((ArmorItem) ModItems.AETHERIUM_BOOTS));
    }
}