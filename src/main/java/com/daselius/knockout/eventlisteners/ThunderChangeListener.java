package com.daselius.knockout.eventlisteners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.ThunderChangeEvent;

/**
 * JavaDoc this file!
 * Created: 10.09.2018
 *
 * @author DasElius
 */
public class ThunderChangeListener implements Listener {

    @EventHandler
    public void onThunderChange( ThunderChangeEvent event ) {
        event.setCancelled( true );
    }

}
