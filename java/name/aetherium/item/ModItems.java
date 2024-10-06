package name.aetherium.item;

import name.aetherium.Aetherium;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item AETHERIUM_INGOT = registerItem("aetherium_ingot", new Item(new Item.Settings()));
    public static final Item AETHERIUM_SHARD = registerItem("aetherium_shard", new Item(new Item.Settings()));
    public static final Item AETHERIUM_UPGRADE_SMITHING_TEMPLATE = registerItem("aetherium_upgrade_smithing_template", new Item(new Item.Settings()));

private static Item registerItem(String name, Item item) {
    return Registry.register(Registries.ITEM, Identifier.of(Aetherium.MOD_ID, name), item);
}

public static final Item AETHERIUM_SWORD = registerItem("aetherium_sword",
        new SwordItem(ModToolMaterials.AETHERIUM, new Item.Settings()
                .fireproof().attributeModifiers(SwordItem.createAttributeModifiers(ModToolMaterials.AETHERIUM, 3, -2.4f))));
public static final Item AETHERIUM_PICKAXE = registerItem("aetherium_pickaxe",
        new PickaxeItem(ModToolMaterials.AETHERIUM, new Item.Settings()
                .fireproof().attributeModifiers(PickaxeItem.createAttributeModifiers(ModToolMaterials.AETHERIUM, 1, -2.8f))));
public static final Item AETHERIUM_AXE = registerItem("aetherium_axe",
        new AxeItem(ModToolMaterials.AETHERIUM, new Item.Settings()
                .fireproof().attributeModifiers(AxeItem.createAttributeModifiers(ModToolMaterials.AETHERIUM, 5, -3.0f))));
public static final Item AETHERIUM_SHOVEL = registerItem("aetherium_shovel",
        new ShovelItem(ModToolMaterials.AETHERIUM, new Item.Settings()
                .fireproof().attributeModifiers(ShovelItem.createAttributeModifiers(ModToolMaterials.AETHERIUM, 1.5f, -3.0f))));
public static final Item AETHERIUM_HOE = registerItem("aetherium_hoe",
        new HoeItem(ModToolMaterials.AETHERIUM, new Item.Settings()
                .fireproof().attributeModifiers(HoeItem.createAttributeModifiers(ModToolMaterials.AETHERIUM, -5, -0))));

public static final Item AETHERIUM_HELMET = registerItem("aetherium_helmet",
        new ArmorItem(ModArmorMaterials.AETHERIUM_ARMOR_MATERIAL, ArmorItem.Type.HELMET, new Item.Settings()
                .fireproof().maxDamage(ArmorItem.Type.HELMET.getMaxDamage(42))));
public static final Item AETHERIUM_CHESTPLATE = registerItem("aetherium_chestplate",
        new ArmorItem(ModArmorMaterials.AETHERIUM_ARMOR_MATERIAL, ArmorItem.Type.CHESTPLATE, new Item.Settings()
                .fireproof().maxDamage(ArmorItem.Type.CHESTPLATE.getMaxDamage(42))));
public static final Item AETHERIUM_LEGGINGS = registerItem("aetherium_leggings",
        new ArmorItem(ModArmorMaterials.AETHERIUM_ARMOR_MATERIAL, ArmorItem.Type.LEGGINGS, new Item.Settings()
                .fireproof().maxDamage(ArmorItem.Type.LEGGINGS.getMaxDamage(42))));
public static final Item AETHERIUM_BOOTS = registerItem("aetherium_boots",
        new ArmorItem(ModArmorMaterials.AETHERIUM_ARMOR_MATERIAL, ArmorItem.Type.BOOTS, new Item.Settings()
                .fireproof().maxDamage(ArmorItem.Type.BOOTS.getMaxDamage(42))));

    public static void registerModItems() {
        Aetherium.LOGGER.info("Registering Mod Items for" + Aetherium.MOD_ID);
    }
}
