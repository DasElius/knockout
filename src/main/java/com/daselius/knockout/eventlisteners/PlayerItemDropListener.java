package com.daselius.knockout.eventlisteners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerDropItemEvent;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class PlayerItemDropListener implements Listener {

    @EventHandler
    public void onItemDrop( PlayerDropItemEvent event ) {
        event.setCancelled(true);
    }

}
