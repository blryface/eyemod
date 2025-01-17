package gay.blurry.eyemod.item;

import gay.blurry.eyemod.Eyemod;
import gay.blurry.eyemod.registry.EyeBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.block.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup TRANSMITTERS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Eyemod.MOD_ID, "eye"), FabricItemGroup.builder().displayName(Text.translatable("itemgroup.transmitters_group"))
                    .icon(() -> new ItemStack(EyeBlocks.TRANSMITTER2G)).entries((displayContext, entries) -> {

                        entries.add(EyeBlocks.TRANSMITTER2G);
                        entries.add(EyeBlocks.TRANSMITTER3G);
                        entries.add(EyeBlocks.TRANSMITTER4G);
                        entries.add(EyeBlocks.TRANSMITTER5G);
                        entries.add(EyeBlocks.TRANSMITTERAM);
                        entries.add(EyeBlocks.TRANSMITTERFM);
                        entries.add(EyeBlocks.TRANSMITTERANALOGTV);
                        entries.add(EyeBlocks.TRANSMITTERDIGITALTV);

                    }).build());

    public static void registerItemGroups() {

    }
}
