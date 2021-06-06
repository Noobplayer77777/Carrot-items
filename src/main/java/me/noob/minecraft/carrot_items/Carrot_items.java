package me.noob.minecraft.carrot_items;

import me.noob.minecraft.carrot_items.Carrotstuffs.*;
import org.bukkit.plugin.java.JavaPlugin;

public final class Carrot_items extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("==========XXXX Carrot plugin has loaded XXXX==========");
        Sword.init();
        Chestplate.init();
        Leggings.init();
        Helmate.init();
        Boots.init();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
