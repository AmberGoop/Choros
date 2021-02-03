package choros.choros.registry;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class ChorosItemGroups {
    public static final ItemGroup GROUP = new ItemGroup("choros_group") {
        @Override
        public ItemStack createIcon() {
            return new ItemStack(ChorosBlocks.Moon_Turf.get());
        }
    };

}
