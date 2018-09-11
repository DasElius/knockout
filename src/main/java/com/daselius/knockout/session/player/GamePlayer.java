package com.daselius.knockout.session.player;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class GamePlayer {

    private final Player player;
    private int deaths = 0;

    public GamePlayer( final Player player) {
        this.player = player;
    }

    public int getDeaths() {
        return deaths;
    }

    public void addDeath() {
        deaths += 1;
        player.sendMessage( "You died " + getDeaths() + " times in your current session!" );

    }
}
