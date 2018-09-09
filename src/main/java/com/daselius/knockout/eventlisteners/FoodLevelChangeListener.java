package com.daselius.knockout.eventlisteners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.FoodLevelChangeEvent;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class FoodLevelChangeListener implements Listener {

    @EventHandler
    public void onFoodLevelChange( FoodLevelChangeEvent event ) {
        event.setCancelled( true );
    }

}
