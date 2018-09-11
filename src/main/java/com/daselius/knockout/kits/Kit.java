package com.daselius.knockout.kits;

import org.bukkit.inventory.ItemStack;

/**
 * JavaDoc this file!
 * Created: 10.09.2018
 *
 * @author DasElius
 */
public class Kit {

    private String name;
    private ItemStack kitItems;

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public ItemStack getKitItems() {
        return kitItems;
    }

    public void setKitItems( ItemStack kitItems ) {
        this.kitItems = kitItems;
    }
}
