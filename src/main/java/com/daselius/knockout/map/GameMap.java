package com.daselius.knockout.map;

import org.bukkit.Location;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class GameMap {

    private Location spawnLocation;
    private double deathHeight;

    public Location getSpawnLocation() {
        return spawnLocation;
    }

    public void setSpawnLocation( final Location spawnLocation ) {
        this.spawnLocation = spawnLocation;
    }

    public double getDeathHeight() {
        return deathHeight;
    }

    public void setDeathHeight( final double deathHeight ) {
        this.deathHeight = deathHeight;
    }
}
