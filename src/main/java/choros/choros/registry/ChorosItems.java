package choros.choros.registry;

import choros.choros.Choros;
import choros.choros.item.ChorosItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ChorosItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Choros.MODID);
    public static final RegistryObject<Item> Moon_Turf = ITEMS.register("moon_turf",()-> new BlockItem(ChorosBlocks.Moon_Turf.get(), new Item.Properties().group(ChorosItemGroups.GROUP)));
    public static final RegistryObject<Item> Moon_Rock = ITEMS.register("moon_rock",()-> new BlockItem(ChorosBlocks.Moon_Rock.get(), new Item.Properties().group(ChorosItemGroups.GROUP)));
    public static final RegistryObject<Item> Lunar_Ice_Ore = ITEMS.register("lunar_ice_ore",()-> new BlockItem(ChorosBlocks.Lunar_Ice_Ore.get(), new Item.Properties().group(ChorosItemGroups.GROUP)));
    public static final RegistryObject<Item> Ice_Scraps = ITEMS.register("ice_scraps", ChorosItem::new);
}
