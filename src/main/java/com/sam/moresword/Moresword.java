package com.sam.moresword;

import com.sam.moresword.items.*;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

import java.awt.*;

public class Moresword implements ModInitializer {

    public static final ToolItem COMPRESSION_LV1_WOODEN_SWORD = new SwordItem(CompressionLv1WoodenSword.INSTANCE,4,2,new Item.Settings());
    public static final ToolItem COMPRESSION_LV2_WOODEN_SWORD = new SwordItem(CompressionLv2WoodenSword.INSTANCE,6,3,new Item.Settings());
    public static final ToolItem COMPRESSION_LV3_WOODEN_SWORD = new SwordItem(CompressionLv3WoodenSword.INSTANCE,10,4,new Item.Settings());
    public static final ToolItem COMPRESSION_LV4_WOODEN_SWORD = new SwordItem(CompressionLv4WoodenSword.INSTANCE,14,6,new Item.Settings());
    public static final ToolItem COMPRESSION_LV5_WOODEN_SWORD = new SwordItem(CompressionLv5WoodenSword.INSTANCE,18,8,new Item.Settings());
    public static final ToolItem COMPRESSION_LV6_WOODEN_SWORD = new SwordItem(CompressionLv6WoodenSword.INSTANCE,22,11,new Item.Settings());
    public static final ToolItem COMPRESSION_LV7_WOODEN_SWORD = new SwordItem(CompressionLv7WoodenSword.INSTANCE,24,14,new Item.Settings());
    public static final ToolItem COMPRESSION_LV8_WOODEN_SWORD = new SwordItem(CompressionLv8WoodenSword.INSTANCE,26,20,new Item.Settings());
    public static final ToolItem COMPRESSION_LV9_WOODEN_SWORD = new SwordItem(compressionLv9WoodenSword.INSTANCE,32,25,new Item.Settings());
    public static final ToolItem COMPRESSION_LV10_WOODEN_SWORD = new SwordItem(ComprssionLv10WoodenSword.INSTANCE,42,35,new Item.Settings());
    public static final ToolItem COMPRESSION_LV1_LABYMOD_SWORD = new SwordItem(CompressionLv1LabyModSwordEasterEgg.INSTANCE,50,50,new Item.Settings());
    public static final ToolItem COMPRESSION_LV1_STONE_SWORD = new SwordItem(CompressionLv1StoneSword.INSTANCE,50,50,new Item.Settings());
    public static final ToolItem COMPRESSION_LV2_STONE_SWORD = new SwordItem(CompressionLv2StoneSword.INSTANCE,57,57,new Item.Settings());
    public static final ToolItem COMPRESSION_LV3_STONE_SWORD = new SwordItem(CompressionLv3StoneSword.INSTANCE,70,70,new Item.Settings());
    public static final ToolItem COMPRESSION_LV4_STONE_SWORD = new SwordItem(CompressionLv4StoneSword.INSTANCE,87,86,new Item.Settings());
    public static final ToolItem COMPRESSION_LV5_STONE_SWORD = new SwordItem(CompressionLv5StoneSword.INSTANCE,94,94,new Item.Settings());
    public static final ToolItem COMPRESSION_LV6_STONE_SWORD = new SwordItem(CompressionLv6StoneSword.INSTANCE,105,105,new Item.Settings());
    public static final ToolItem COMPRESSION_LV7_STONE_SWORD = new SwordItem(CompressionLv7StoneSword.INSTANCE,120,120,new Item.Settings());
    public static final ToolItem COMPRESSION_LV8_STONE_SWORD = new SwordItem(CompressionLv8StoneSword.INSTANCE,150,150,new Item.Settings());
    public static final ToolItem COMPRESSION_LV9_STONE_SWORD = new SwordItem(CompressionLv9StoneSword.INSTANCE,170,170,new Item.Settings());
    public static final ToolItem COMPRESSION_LV10_STONE_SWORD = new SwordItem(CompressionLv10StoneSword.INSTANCE,190,190,new Item.Settings());
    public static final ToolItem COMPRESSION_LV1_IRON_SWORD = new SwordItem(CompressionLv1IronSword.INSTANCE,250,250,new Item.Settings());
    public static final ToolItem COMPRESSION_LV2_IRON_SWORD = new SwordItem(CompressionLv2IronSword.INSTANCE,300,300,new Item.Settings());
    public static final ToolItem COMPRESSION_LV3_IRON_SWORD = new SwordItem(CompressionLv3IronSword.INSTANCE,350,350,new Item.Settings());
    public static final ToolItem COMPRESSION_LV4_IRON_SWORD = new SwordItem(CompressionLv4IronSword.INSTANCE,370,370,new Item.Settings());
    public static final ToolItem COMPRESSION_LV5_IRON_SWORD = new SwordItem(CompressionLv5IronSword.INSTANCE,450,450,new Item.Settings());
    public static final ToolItem COMPRESSION_LV6_IRON_SWORD = new SwordItem(CompressionLv6IronSword.INSTANCE,500,500,new Item.Settings());
    public static final ToolItem COMPRESSION_LV7_IRON_SWORD = new SwordItem(CompressionLv7IronSword.INSTANCE,550,550,new Item.Settings());

    public static final RegistryKey<ItemGroup> CUSTOM_ITEM_GROUP_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of("compression", "item_group"));
    public static final ItemGroup CUSTOM_ITEM_GROUP = FabricItemGroup.builder()
            .icon(() -> new ItemStack(COMPRESSION_LV1_WOODEN_SWORD))
            .displayName(Text.translatable("itemGroup.compression_sword"))
            .build();

    @Override
    public void onInitialize() {

        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv1_wooden_sword"),COMPRESSION_LV1_WOODEN_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv2_wooden_sword"),COMPRESSION_LV2_WOODEN_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv3_wooden_sword"),COMPRESSION_LV3_WOODEN_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv4_wooden_sword"),COMPRESSION_LV4_WOODEN_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv5_wooden_sword"),COMPRESSION_LV5_WOODEN_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv6_wooden_sword"),COMPRESSION_LV6_WOODEN_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv7_wooden_sword"),COMPRESSION_LV7_WOODEN_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv8_wooden_sword"),COMPRESSION_LV8_WOODEN_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv9_wooden_sword"),COMPRESSION_LV9_WOODEN_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv10_wooden_sword"),COMPRESSION_LV10_WOODEN_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv1_stone_sword"),COMPRESSION_LV1_STONE_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compressioneasteregg","compression_lv1_labymod_sword_eastereggs"),COMPRESSION_LV1_LABYMOD_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv2_stone_sword"),COMPRESSION_LV2_STONE_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv3_stone_sword"),COMPRESSION_LV3_STONE_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv4_stone_sword"),COMPRESSION_LV4_STONE_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv5_stone_sword"),COMPRESSION_LV5_STONE_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv6_stone_sword"),COMPRESSION_LV6_STONE_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv7_stone_sword"),COMPRESSION_LV7_STONE_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv8_stone_sword"),COMPRESSION_LV8_STONE_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv9_stone_sword"),COMPRESSION_LV9_STONE_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv10_stone_sword"),COMPRESSION_LV10_STONE_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression", "compression_lv1_iron_sword"),COMPRESSION_LV1_IRON_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression", "compression_lv2_iron_sword"),COMPRESSION_LV2_IRON_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv3_iron_sword"),COMPRESSION_LV3_IRON_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv4_iron_sword"),COMPRESSION_LV4_IRON_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv5_iron_sword"),COMPRESSION_LV5_IRON_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv6_iron_sword"),COMPRESSION_LV6_IRON_SWORD);
        Registry.register(Registries.ITEM,new Identifier("compression","compression_lv7_iron_sword"),COMPRESSION_LV7_IRON_SWORD);

        Registry.register(Registries.ITEM_GROUP,CUSTOM_ITEM_GROUP_KEY,CUSTOM_ITEM_GROUP);

        ItemGroupEvents.modifyEntriesEvent(CUSTOM_ITEM_GROUP_KEY).register(itemGroup->{
            itemGroup.add(COMPRESSION_LV1_WOODEN_SWORD);
            itemGroup.add(COMPRESSION_LV2_WOODEN_SWORD);
            itemGroup.add(COMPRESSION_LV3_WOODEN_SWORD);
            itemGroup.add(COMPRESSION_LV4_WOODEN_SWORD);
            itemGroup.add(COMPRESSION_LV5_WOODEN_SWORD);
            itemGroup.add(COMPRESSION_LV6_WOODEN_SWORD);
            itemGroup.add(COMPRESSION_LV7_WOODEN_SWORD);
            itemGroup.add(COMPRESSION_LV8_WOODEN_SWORD);
            itemGroup.add(COMPRESSION_LV9_WOODEN_SWORD);
            itemGroup.add(COMPRESSION_LV10_WOODEN_SWORD);
            itemGroup.add(COMPRESSION_LV1_STONE_SWORD);
            itemGroup.add(COMPRESSION_LV2_STONE_SWORD);
            itemGroup.add(COMPRESSION_LV3_STONE_SWORD);
            itemGroup.add(COMPRESSION_LV4_STONE_SWORD);
            itemGroup.add(COMPRESSION_LV5_STONE_SWORD);
            itemGroup.add(COMPRESSION_LV6_STONE_SWORD);
            itemGroup.add(COMPRESSION_LV7_STONE_SWORD);
            itemGroup.add(COMPRESSION_LV8_STONE_SWORD);
            itemGroup.add(COMPRESSION_LV9_STONE_SWORD);
            itemGroup.add(COMPRESSION_LV10_STONE_SWORD);
            itemGroup.add(COMPRESSION_LV1_IRON_SWORD);
            itemGroup.add(COMPRESSION_LV2_IRON_SWORD);
            itemGroup.add(COMPRESSION_LV3_IRON_SWORD);
            itemGroup.add(COMPRESSION_LV4_IRON_SWORD);
            itemGroup.add(COMPRESSION_LV5_IRON_SWORD);
            itemGroup.add(COMPRESSION_LV6_IRON_SWORD);
            itemGroup.add(COMPRESSION_LV7_IRON_SWORD);
        });
    }
}
