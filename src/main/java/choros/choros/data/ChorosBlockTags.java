package choros.choros.data;

import choros.choros.Choros;
import choros.choros.registry.ChorosBlocks;
import choros.choros.registry.ChorosTags;
import javax.annotation.Nullable;
import net.minecraft.block.Block;

import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.TagsProvider;

import net.minecraft.tags.ITag;

import net.minecraftforge.common.data.ExistingFileHelper;


public class ChorosBlockTags extends BlockTagsProvider {

    public ChorosBlockTags(DataGenerator generatorIn, @Nullable ExistingFileHelper existingFileHelper) {
        super(generatorIn, Choros.MODID, existingFileHelper);
    }

    @Override
    public String getName() {
        return "Choros Block Tags";
    }

    @Override
    protected void registerTags() {
        tag(ChorosTags.Blocks.LUNAR_SURFACE).add(ChorosBlocks.Moon_Turf.get());
    }

    private TagsProvider.Builder<Block> tag(ITag.INamedTag<Block> tag) {
        return this.getOrCreateBuilder(tag);
    }
}
