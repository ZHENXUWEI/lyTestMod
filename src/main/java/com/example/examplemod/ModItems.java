package com.example.examplemod;

import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    // 创建物品延迟注册器
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, ExampleMod.MOD_ID);

    // 注册一个自定义物品（示例：魔法棒）
//    public static final RegistryObject<Item> MAGIC_WAND = ITEMS.register("magic_wand",
//            () -> new Item(new Item.Properties()
//                    .stacksTo(1)  // 最大堆叠数为1
//                    .fireResistant()  // 防火
//            )
//    );

    public static final RegistryObject<Item> PURPLE_STICK =ITEMS.register("purple_stick",
            ()->new Item(new Item.Properties()
                    .stacksTo(64)
                    .fireResistant())
    );
}