package name.aetherium.util;

import net.minecraft.block.Block;
import name.aetherium.Aetherium;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

import static net.minecraft.registry.tag.TagEntry.createTag;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> NEEDS_AETHERIUM_TOOL = createTag("needs_aetherium_tool");
        public static final TagKey<Block> INCORRECT_FOR_AETHERIUM_TOOL = createTag("incorrect_for_aetherium_tool");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, Identifier.of(Aetherium.MOD_ID, name));
        }
    }
}