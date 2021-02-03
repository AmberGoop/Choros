package choros.choros.registry;

import choros.choros.Choros;
import net.minecraft.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.util.ResourceLocation;

public class ChorosTags {
    public static class Blocks {

        public static final ITag.INamedTag<Block> LUNAR_SURFACE = tag("lunar_surface");

        private static ITag.INamedTag<Block> tag(String name) {
            return BlockTags.createOptional(new ResourceLocation(Choros.MODID, name));
        }
    }
}
