package olivermakesco.de.vi;

import net.fabricmc.api.ModInitializer;
import olivermakesco.de.vi.registry.BlockRegistry;
import olivermakesco.de.vi.registry.ItemRegistry;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class OliversIdeas implements ModInitializer {
	public static final Logger LOGGER = LogManager.getLogger("modid");

	@Override
	public void onInitialize() {
		ItemRegistry.register();
		BlockRegistry.register();
	}
}
