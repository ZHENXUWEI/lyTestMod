package com.example.examplemod;

import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

// 这里的 MOD_ID 必须与 mods.toml 中的 modId 完全一致（全小写）
@Mod(ExampleMod.MOD_ID)
public class ExampleMod {
    // 修正：使用全小写的 modid，与 mods.toml 保持一致
    public static final String MOD_ID = "lytestmod";

    public ExampleMod() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        // 注册物品、方块和方块物品（记得添加 ModBlockItems 的注册）
        ModItems.ITEMS.register(bus);
        ModBlocks.BLOCKS.register(bus);
        ModBlockItems.BLOCK_ITEMS.register(bus); // 之前可能遗漏了这个
        ModCreativeModeTabs.CREATIVE_MODE_TABS.register(bus);  // 注册创造模式分组

        bus.addListener(this::setup);
        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            // 初始化逻辑
        });
    }
}