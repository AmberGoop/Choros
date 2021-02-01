package choros.choros.registry;

import choros.choros.Choros;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ChorosItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Choros.MODID);
    public static final RegistryObject<Item> Moon_Turf = ITEMS.register("moon_turf",()-> new BlockItem(ChorosBlocks.Moon_Turf.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
    public static final RegistryObject<Item> Moon_Rock = ITEMS.register("moon_rock",()-> new BlockItem(ChorosBlocks.Moon_Rock.get(), new Item.Properties().group(ItemGroup.DECORATIONS)));
}
