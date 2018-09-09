package com.daselius.knockout.eventlisteners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.weather.WeatherChangeEvent;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class WeatherChangeListener implements Listener {

    @EventHandler
    public void onWeatherChange( WeatherChangeEvent event ) {
        event.setCancelled( true );
    }

}
