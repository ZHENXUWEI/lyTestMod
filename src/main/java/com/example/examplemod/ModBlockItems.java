package com.example.examplemod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockItems {
    public static final DeferredRegister<Item> BLOCK_ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    // 为发光方块创建对应的物品形式
    public static final RegistryObject<Item> GLOWING_BLOCK_ITEM = BLOCK_ITEMS.register("glowing_block",
            () -> new BlockItem(ModBlocks.GLOWING_BLOCK.get(), new Item.Properties())
    );
}