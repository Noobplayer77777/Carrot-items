package me.noob.minecraft.carrot_items.CarrotSword;

import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.List;

public class Sword {

    public static ItemStack carrot_sword;

    public static void init() {
        createSword();

    }

    public static void createSword(){
        ItemStack item = new ItemStack(Material.GOLDEN_SWORD , 1);
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(ChatColor.GOLD + "Legendary Carrot Sword");
        List<String> lore = new ArrayList<>();
        lore.add("The Carrot Sword, made by");
        lore.add("the powerful ancient carry Gods.");
        lore.add("This sword you wield was used to kill the carrot");
        lore.add("village, such a dark past that was...");
        meta.setLore(lore);
        meta.addEnchant(Enchantment.LUCK , 1 , true);
        meta.addEnchant(Enchantment.DURABILITY, 10000 , true);
        meta.addEnchant(Enchantment.DAMAGE_ALL , 11 , true);
        meta.addEnchant(Enchantment.SWEEPING_EDGE , 5 , true);
        meta.addEnchant(Enchantment.DIG_SPEED , -1 , true);
        meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
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
