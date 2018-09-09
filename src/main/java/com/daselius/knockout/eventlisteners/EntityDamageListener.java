package com.daselius.knockout.eventlisteners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDamageEvent;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class EntityDamageListener implements Listener {

    @EventHandler
    public void onEntityDamage( EntityDamageEvent event ) {
        if(event.getCause() == EntityDamageEvent.DamageCause.FALL) {
            event.setCancelled( true );
        }
    }

}
