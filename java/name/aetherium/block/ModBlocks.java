package name.aetherium.block;

import name.aetherium.Aetherium;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    public static final Block AETHERIUM_SHARD_ORE = registerBlock("aetherium_shard_ore",
            new Block(AbstractBlock.Settings.create().strength(3f)
                    .requiresTool()));
    public static final Block DEEPSLATE_AETHERIUM_SHARD_ORE = registerBlock("deepslate_aetherium_shard_ore",
            new Block(AbstractBlock.Settings.create().strength(4.5F)
                    .requiresTool().sounds(BlockSoundGroup.DEEPSLATE)));
    public static final Block AETHERIUM_BLOCK= registerBlock("aetherium_block",
            new Block(AbstractBlock.Settings.create().strength(5f)
                    .requiresTool().sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Aetherium.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Aetherium.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Aetherium.LOGGER.info("Registering Mod Blocks for" + Aetherium.MOD_ID);
    }

}
