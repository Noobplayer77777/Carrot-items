package me.noob.minecraft.carrot_items.Carrotstuffs;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
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

public class Sword {

    public static ItemStack carrot_sword;

    public static void init() {
        createSword();

    }

    public static void createSword(){
        ItemStack item = new ItemStack(Material.NETHERITE_SWORD , 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "" + ChatColor.BOLD + "Legendary Carrot Sword");
        List<String> lore = new ArrayList<>();
        lore.add("The Carrot Sword, made by");
        lore.add("the powerful ancient Carrot Gods.");
        lore.add("This sword you wield was used to kill the carrot");
        lore.add("village, such a dark past that was...");
        meta.setLore(lore);
        AttributeModifier attack = new AttributeModifier(UUID.randomUUID(), "generic.attackDamage", 10, AttributeModifier.Operation.ADD_NUMBER , EquipmentSlot.HAND);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_DAMAGE, attack);
        AttributeModifier speed = new AttributeModifier(UUID.randomUUID(), "generic.attackSpeed", 1.7,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        meta.addAttributeModifier(Attribute.GENERIC_ATTACK_SPEED, speed);
        AttributeModifier heal = new AttributeModifier(UUID.randomUUID(), "generic.maxHealth", 8,AttributeModifier.Operation.ADD_NUMBER, EquipmentSlot.HAND);
        meta.addAttributeModifier(Attribute.GENERIC_MAX_HEALTH, heal);
        item.setItemMeta(meta);


        carrot_sword = item;

        ShapedRecipe sr = new ShapedRecipe(NamespacedKey.minecraft("carrot_sword"), item);
        sr.shape("NSN",
                "NRN",
                "NRN");
        sr.setIngredient('N', Material.NETHERITE_INGOT);
        sr.setIngredient('S', Material.CARROT);
        sr.setIngredient('R', Material.BLAZE_ROD);
        Bukkit.getServer().addRecipe(sr);

    }
}
