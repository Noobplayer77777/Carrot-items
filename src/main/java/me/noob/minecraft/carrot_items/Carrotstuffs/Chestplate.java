package me.noob.minecraft.carrot_items.Carrotstuffs;

import org.bukkit.*;
import org.bukkit.attribute.Attribute;
import org.bukkit.attribute.AttributeModifier;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.EquipmentSlot;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class Chestplate {

    public static ItemStack carrot_chestplate;

    public static void init() {
        createChestplate();
    }
    public static void createChestplate(){
        ItemStack item = new ItemStack(Material.NETHERITE_CHESTPLATE , 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Legendary Carrot Chestplate");
        List<String> lore = new ArrayList<>();
        lore.add("The Carrot Chestplate, made by");
        lore.add("the powerful ancient Carrot Gods.");
        lore.add("This sword you wield was used to kill the carrot");
        lore.add("village, such a dark past that was...");
        meta.setLore(lore);
        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", 4,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, speed);
        AttributeModifier heal = new AttributeModifier(UUID.randomUUID(), "generic.armor", 9,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.CHEST);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, heal);
        item.setItemMeta(meta);
        item.setItemMeta(meta);

        carrot_chestplate = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("carrot_chestplate"), item);
        sr.shape("NSN",
                "NRN",
                "NNN");
        sr.setIngredient('N', Material.NETHERITE_INGOT);
        sr.setIngredient('S', Material.CARROT);
        sr.setIngredient('R', Material.BLAZE_ROD);
        Bukkit.getServer().addRecipe(sr);

    }
}

