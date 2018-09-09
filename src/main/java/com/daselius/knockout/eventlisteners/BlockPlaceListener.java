package com.daselius.knockout.eventlisteners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockPlaceEvent;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class BlockPlaceListener implements Listener {

    @EventHandler
    public void onBlockPlace( BlockPlaceEvent event ) {
        event.setCancelled( true );
    }

}
