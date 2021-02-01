package choros.choros.registry;

import choros.choros.Choros;
import net.minecraft.util.RegistryKey;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.biome.Biome;
import net.minecraftforge.common.BiomeDictionary;

public class ChorosBiomes {

    public static final RegistryKey<Biome> MOON_PLAINS = RegistryKey.getOrCreateKey(Registry.BIOME_KEY, name("moon_plains"));

    public static void toDictionary() {
        BiomeDictionary.addTypes(MOON_PLAINS, BiomeDictionary.Type.PLAINS);
    }

    private static ResourceLocation name(String name) {
        return new ResourceLocation(Choros.MODID, name);
    }
}
