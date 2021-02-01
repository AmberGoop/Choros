package choros.choros.registry;


import choros.choros.Choros;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ChorosBlocks {

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Choros.MODID);
    public static final RegistryObject<Block> Moon_Turf = BLOCKS.register("moon_turf", ()-> new Block(AbstractBlock.Properties.from(Blocks.DIRT)));
    public static final RegistryObject<Block> Moon_Rock = BLOCKS.register("moon_rock", ()-> new Block(AbstractBlock.Properties.from(Blocks.STONE)));
}
