package com.daselius.knockout;

import com.daselius.knockout.eventlisteners.*;
import com.daselius.knockout.map.GameMap;
import com.daselius.knockout.session.GameSession;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class KnockOut extends JavaPlugin {

    private final GameSession session = new GameSession();

    @Override
    public void onEnable() {
        final GameMap map = new GameMap();
        map.setSpawnLocation( new Location( Bukkit.getWorld( "world" ), 0.5, 89.2, 0.5 ) );
        map.setDeathHeight( 45 );

        session.setGameMap( map );

        getServer().getPluginManager().registerEvents( new PlayerJoinListener( session ), this );
        getServer().getPluginManager().registerEvents( new PlayerQuitListener( session ), this );
        getServer().getPluginManager().registerEvents( new PlayerMoveListener( session ), this );

        getServer().getPluginManager().registerEvents( new EntityDamageListener(), this );
        getServer().getPluginManager().registerEvents( new FoodLevelChangeListener(), this );
    }

    @Override
    public void onDisable() {
        super.onDisable();
    }

    @Override
    public void onLoad() {
        super.onLoad();
    }
}
