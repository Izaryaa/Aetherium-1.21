package name.aetherium.world;

import name.aetherium.Aetherium;
import name.aetherium.block.ModBlocks;
import net.minecraft.registry.Registerable;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.BlockTags;
import net.minecraft.structure.rule.RuleTest;
import net.minecraft.structure.rule.TagMatchRuleTest;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.feature.*;

import java.util.List;

public class ModConfiguredFeatures {

    public static final RegistryKey<ConfiguredFeature<?, ?>> AETHERIUM_SHARD_ORE_KEY = registryKey("aetherium_shard_ore");
    public static final RegistryKey<ConfiguredFeature<?, ?>> DEEPSLATE_AETHERIUM_SHARD_ORE_KEY = registryKey("deepslate_aetherium_shard_ore");

    public static void boostrap(Registerable<ConfiguredFeature<?, ?>> context) {
        RuleTest stoneReplacables = new TagMatchRuleTest(BlockTags.STONE_ORE_REPLACEABLES);
        RuleTest deepslateReplacables = new TagMatchRuleTest(BlockTags.DEEPSLATE_ORE_REPLACEABLES);

        List<OreFeatureConfig.Target> overworldAetheriumShardOres =
                List.of(OreFeatureConfig.createTarget(stoneReplacables, ModBlocks.AETHERIUM_SHARD_ORE.getDefaultState()),
                        OreFeatureConfig.createTarget(deepslateReplacables, ModBlocks.DEEPSLATE_AETHERIUM_SHARD_ORE.getDefaultState()));

        register(context, AETHERIUM_SHARD_ORE_KEY, Feature.ORE, new OreFeatureConfig(overworldAetheriumShardOres, 3));

    }
    public static RegistryKey<ConfiguredFeature<?, ?>> registryKey(String name) {
        return RegistryKey.of(RegistryKeys.CONFIGURED_FEATURE, Identifier.of(Aetherium.MOD_ID, name));
    }

    private static <FC extends FeatureConfig, F extends Feature<FC>> void register(Registerable<ConfiguredFeature<?, ?>> context,
                                                                                   RegistryKey<ConfiguredFeature<?, ?>> key, F feature, FC configuration) {
        context.register(key, new ConfiguredFeature<>(feature, configuration));
    }

}
