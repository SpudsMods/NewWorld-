package net.digitalpear.newworld.common.worldgen;

import net.digitalpear.newworld.NewWorld;
import net.digitalpear.newworld.common.worldgen.features.FallenLogFeature;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.FeatureConfig;
import net.minecraft.world.gen.feature.SingleStateFeatureConfig;

public class NWFeature {
    public static final Feature<SingleStateFeatureConfig> FALLEN_LOG = register("fallen_log_feature", new FallenLogFeature(SingleStateFeatureConfig.CODEC));


    private static <C extends FeatureConfig, F extends Feature<C>> F register(String name, F feature) {
        return (F) Registry.register(Registry.FEATURE, NewWorld.getId(name), feature);
    }
}
