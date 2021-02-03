package choros.choros.item;

import choros.choros.registry.ChorosItemGroups;
import net.minecraft.item.Item;

public class ChorosItem extends Item {

    public ChorosItem() {
        super(new Properties()
            .group(ChorosItemGroups.GROUP)
        );
    }
}
