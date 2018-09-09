package com.daselius.knockout.eventlisteners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class InventoryClickListener implements Listener {

    @EventHandler
    public void onInventoryClick( InventoryClickEvent event ) {
        event.setCancelled(true);
    }

}
