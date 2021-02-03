package choros.choros.registry;

import choros.choros.Choros;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.IFeatureConfig;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ChorosFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Choros.MODID);

        public static final class ConfiguredFeatures {
            static final RuleTest MOON_SURFACE = new TagMatchRuleTest(ChorosTags.Blocks.LUNAR_SURFACE);

            public static final ConfiguredFeature<?,?> LUNAR_ICE_ORE = Feature.ORE.withConfiguration(
                    new OreFeatureConfig(MOON_SURFACE, ChorosBlocks.Lunar_Ice_Ore.get().getDefaultState(), 10)
            );


        }
    public static void registerConfiguredFeatures() {
           register("lunar_ice_ore", ConfiguredFeatures.LUNAR_ICE_ORE.range(256).square().func_242731_b(30));
    }
    private static <FC extends IFeatureConfig> void register(String name, ConfiguredFeature<FC, ?> feature) {
        Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(Choros.MODID, name), feature);
    }
}