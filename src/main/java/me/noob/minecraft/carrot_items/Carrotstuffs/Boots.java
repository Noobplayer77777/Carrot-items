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


public class Boots {

    public static ItemStack carrot_boots;

    public static void init() {
        createBoots();
    }
    public static void createBoots(){
        ItemStack item = new ItemStack(Material.NETHERITE_BOOTS , 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Legendary Carrot Boots");
        List<String> lore = new ArrayList<>();
        lore.add("The Carrot Boots, made by");
        lore.add("the powerful ancient Carrot Gods.");
        lore.add("This sword you wield was used to kill the carrot");
        lore.add("village, such a dark past that was...");
        meta.setLore(lore);

        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.armorToughness", 4,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR_TOUGHNESS, speed);
        AttributeModifier heal = new AttributeModifier(UUID.randomUUID(), "generic.armor", 4,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.FEET);
        meta.addAttributeModifier(Attribute.GENERIC_ARMOR, heal);
        item.setItemMeta(meta);
        item.setItemMeta(meta);

        carrot_boots = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("carrot_boots"), item);
        sr.shape("   ",
                "NRN",
                "NSN");
        sr.setIngredient('N', Material.NETHERITE_INGOT);
        sr.setIngredient('S', Material.CARROT);
        sr.setIngredient('R', Material.BLAZE_ROD);
        Bukkit.getServer().addRecipe(sr);

    }
}