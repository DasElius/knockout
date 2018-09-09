package com.daselius.knockout.eventlisteners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class BlockBreakListener implements Listener {

    @EventHandler
    public void onBlockBreak( BlockBreakEvent event) {
        event.setCancelled( true );
    }

}
