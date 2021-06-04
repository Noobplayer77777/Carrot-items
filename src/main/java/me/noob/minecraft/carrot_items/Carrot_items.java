package me.noob.minecraft.carrot_items;

import me.noob.minecraft.carrot_items.CarrotSword.Sword;
import me.noob.minecraft.carrot_items.Commands.CarrotCommands;
import org.bukkit.plugin.java.JavaPlugin;

public final class Carrot_items extends JavaPlugin {

    @Override
    public void onEnable() {
        System.out.println("Carrot plugin version 1 is online");
        Sword.init();

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
