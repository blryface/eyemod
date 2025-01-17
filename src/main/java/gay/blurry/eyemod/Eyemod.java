package gay.blurry.eyemod;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricDefaultAttributeRegistry;
import net.minecraft.entity.attribute.EntityAttributes;
import net.minecraft.entity.mob.MobEntity;
import gay.blurry.eyemod.registry.*;
import gay.blurry.eyemod.item.ModItemGroups;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


public class Eyemod implements ModInitializer {
	public static final String MOD_ID = "eyemod";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		LOGGER.info("You just lost the game!");
		EyeBlocks.init();
		ModItemGroups.registerItemGroups();
	}
}