package gay.blurry.eyemod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Eyemod implements ModInitializer {
	public static final String MOD_ID = "eyemod";

	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("You just lost the game!");
	}
}