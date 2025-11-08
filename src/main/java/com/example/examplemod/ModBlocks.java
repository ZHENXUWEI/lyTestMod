package com.example.examplemod;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.MapColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlocks {
    // 创建方块延迟注册器
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, ExampleMod.MOD_ID);

//    // 注册一个自定义方块（示例：发光方块）
//    public static final RegistryObject<Block> GLOWING_BLOCK = BLOCKS.register("glowing_block",
//            () -> new Block(BlockBehaviour.Properties.of()
//                    .mapColor(MapColor.STONE)  // 地图颜色
//                    .strength(2.0f)  // 硬度
//                    .sound(SoundType.STONE)  // 声音类型
//                    .lightLevel(state -> 15)  // 最大亮度（15级）
//                    .requiresCorrectToolForDrops()  // 需要正确工具挖掘
//            )
//    );

    // 紫色烈焰块
    public static final RegistryObject<Block> PURPLE_STICK_BLOCK = BLOCKS.register("purple_stick_block",
            () -> new Block(BlockBehaviour.Properties.of()
                    .mapColor(MapColor.STONE)  // 地图颜色
                    .strength(2.0f)  // 硬度
                    .sound(SoundType.STONE)  // 声音类型
                    .lightLevel(state -> 15)  // 最大亮度（15级）
                    .requiresCorrectToolForDrops()  // 需要正确工具挖掘
            )
    );


}