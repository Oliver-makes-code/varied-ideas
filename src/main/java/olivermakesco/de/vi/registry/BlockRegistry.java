package olivermakesco.de.vi.registry;

import net.minecraft.block.Block;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import olivermakesco.de.vi.block.AllBlocks;

public class BlockRegistry {

    public static void register() {
        for (Identifier id : AllBlocks.blocks.keySet()) {
            Block block = AllBlocks.blocks.get(id);
            Registry.register(Registry.BLOCK,id,block);
        }
    }
}
