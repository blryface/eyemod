package gay.blurry.eyemod.registry;

import gay.blurry.eyemod.Eyemod;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class EyeBlocks {

    // region Cellular Data transmitters

    public static final Block TRANSMITTER2G = registerBlock("2g_transmitter",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    public static final Block TRANSMITTER3G = registerBlock("3g_transmitter",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    public static final Block TRANSMITTER4G = registerBlock("4g_transmitter",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    public static final Block TRANSMITTER5G = registerBlock("5g_transmitter",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    public static final Block TRANSMITTERAM = registerBlock("am_transmitter",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    public static final Block TRANSMITTERFM = registerBlock("fm_transmitter",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    public static final Block TRANSMITTERANALOGTV = registerBlock("analog_tv_transmitter",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    public static final Block TRANSMITTERDIGITALTV = registerBlock("digital_tv_transmitter",
            new Block(AbstractBlock.Settings.copy(Blocks.STONE)));

    // endregion

    // region Registration Helpers
    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Eyemod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block) {
        return Registry.register(Registries.ITEM, Identifier.of(Eyemod.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }
    // endregion

    /**
     * Workaround to force classloading
     */
    public static void init() {
        // NO-OP
    }
}