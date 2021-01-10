package com.demonvenom.mememod.registry;

import com.demonvenom.mememod.DripArmorMaterial;
import com.demonvenom.mememod.DripItem;
import com.demonvenom.mememod.MemeMod;
import com.demonvenom.mememod.MemeToolMaterial;
import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.*;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModItems {

    // Items
    public static final Item IRONY = new Item (new Item.Settings().group(MemeMod.ITEM_GROUP));

    // Tool Items
    public static ToolItem FIST_OF_SHAGGY =
            new SwordItem(MemeToolMaterial.SHAGGY, 3, -2.4F,
            new Item.Settings().group(MemeMod.ITEM_GROUP));

    // Armor Items
    public static final ArmorMaterial dripArmorMaterial = new DripArmorMaterial();
    public static final Item DRIP = new DripItem(new Item.Settings().group(MemeMod.ITEM_GROUP));
    public static final Item DRIP_HELMET = new ArmorItem(dripArmorMaterial, EquipmentSlot.HEAD, new Item.Settings().group(MemeMod.ITEM_GROUP).fireproof());
    public static final Item DRIP_CHESTPLATE = new ArmorItem(dripArmorMaterial, EquipmentSlot.CHEST, new Item.Settings().group(MemeMod.ITEM_GROUP).fireproof());
    public static final Item DRIP_LEGGINGS = new ArmorItem(dripArmorMaterial, EquipmentSlot.LEGS, new Item.Settings().group(MemeMod.ITEM_GROUP).fireproof());
    public static final Item DRIP_BOOTS = new ArmorItem(dripArmorMaterial, EquipmentSlot.FEET, new Item.Settings().group(MemeMod.ITEM_GROUP).fireproof());




    public static void registerItems() {
        Registry.register(Registry.ITEM, new Identifier(MemeMod.MOD_ID, "irony"), IRONY);
        Registry.register(Registry.ITEM, new Identifier(MemeMod.MOD_ID, "shaggy"), FIST_OF_SHAGGY);

        Registry.register(Registry.ITEM, new Identifier(MemeMod.MOD_ID, "drip"), DRIP);
        Registry.register(Registry.ITEM, new Identifier(MemeMod.MOD_ID, "drip_helmet"), DRIP_HELMET);
        Registry.register(Registry.ITEM, new Identifier(MemeMod.MOD_ID, "drip_chestplate"), DRIP_CHESTPLATE);
        Registry.register(Registry.ITEM, new Identifier(MemeMod.MOD_ID, "drip_leggings"), DRIP_LEGGINGS);
        Registry.register(Registry.ITEM, new Identifier(MemeMod.MOD_ID, "drip_boots"), DRIP_BOOTS);

    }
}
