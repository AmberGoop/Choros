package choros.choros;

import choros.choros.registry.ChorosBiomes;
import choros.choros.registry.ChorosBlocks;
import choros.choros.registry.ChorosFeatures;
import choros.choros.registry.ChorosItems;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.InterModComms;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.InterModEnqueueEvent;
import net.minecraftforge.fml.event.lifecycle.InterModProcessEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.stream.Collectors;

@Mod("choros")
public class Choros {
    public static final String MODID = "choros";
    private static final Logger LOGGER = LogManager.getLogger();

    public Choros() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);

        DeferredRegister<?>[] registers = {
          ChorosBlocks.BLOCKS,
          ChorosItems.ITEMS,
          ChorosFeatures.FEATURES
        };
        for (DeferredRegister<?> register : registers) {
            register.register(bus);
        }

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            ChorosBiomes.toDictionary();
            ChorosFeatures.registerConfiguredFeatures();

            });
    }


}
