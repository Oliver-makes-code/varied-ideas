package olivermakesco.de.vi.registry;

import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import olivermakesco.de.vi.item.AllItems;

public class ItemRegistry {

    public static void register() {
        for (Identifier id : AllItems.items.keySet()) {
            Item item = AllItems.items.get(id);
            Registry.register(Registry.ITEM,id,item);
        }
    }
}
