package com.example.examplemod;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    // 注册创造模式分组
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ExampleMod.MOD_ID);

    // 定义自定义分组
    public static final RegistryObject<CreativeModeTab> EXAMPLE_TAB = CREATIVE_MODE_TABS.register(
            "example_tab",  // 分组ID（全小写）
            () -> CreativeModeTab.builder()
                    .title(Component.translatable("itemGroup.lytestmod.example_tab"))  // 分组名称（语言文件中定义）
                    .icon(() -> new ItemStack(ModItems.MAGIC_WAND.get()))  // 分组图标（用魔法棒作为图标）
                    .displayItems((params, output) -> {
                        // 向分组中添加物品
                        output.accept(ModItems.MAGIC_WAND.get());  // 添加魔法棒
                        output.accept(ModBlocks.GLOWING_BLOCK.get());  // 添加发光方块
                    })
                    .build()
    );
}