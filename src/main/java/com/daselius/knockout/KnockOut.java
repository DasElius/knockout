package com.daselius.knockout;

import com.daselius.knockout.eventlisteners.*;
import com.daselius.knockout.kits.Kit;
import com.daselius.knockout.map.GameMap;
import com.daselius.knockout.runnables.Scheduler;
import com.daselius.knockout.session.GameSession;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.World;
import org.bukkit.inventory.ItemStack;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class KnockOut extends JavaPlugin {

    private final GameSession session = new GameSession();
    private final Kit kit = new Kit();

    @Override
    public void onEnable() {
        final GameMap map = new GameMap();
        map.setSpawnLocation( new Location( Bukkit.getWorld( "world" ), 0.5, 89.2, 0.5 ) );
        map.setDeathHeight( 45 );

        final GameMap map2 = new GameMap();
        map2.setSpawnLocation( new Location( Bukkit.getWorld( "world" ), 122.5, 99.2, 1.5 ) );
        map2.setDeathHeight( 45 );

        session.getGameMapList().add( map );
        session.getGameMapList().add( map2 );

        session.changeMap();

        for ( World world : Bukkit.getWorlds() ) {
            world.setThundering( false );
            world.setThunderDuration( 0 );
            world.setWeatherDuration( 0 );
        }

        final Kit kit = new Kit();
        kit.setName( "Snowman" );
        kit.setKitItems( new ItemStack( Material.SNOW_BALL, 3 ) );

        final Kit kit2 = new Kit();
        kit2.setName( "Fisher" );
        kit2.setKitItems( new ItemStack( Material.FISHING_ROD ) );

        session.getKitList().add( kit );
        session.getKitList().add( kit2 );


        getServer().getPluginManager().registerEvents( new PlayerJoinListener( session ), this );
        getServer().getPluginManager().registerEvents( new PlayerQuitListener( session ), this );
        getServer().getPluginManager().registerEvents( new PlayerMoveListener( session ), this );

        getServer().getPluginManager().registerEvents( new EntityDamageListener(), this );
        getServer().getPluginManager().registerEvents( new FoodLevelChangeListener(), this );
        getServer().getPluginManager().registerEvents( new PlayerItemDropListener(), this );
        getServer().getPluginManager().registerEvents( new InventoryClickListener(), this );
        getServer().getPluginManager().registerEvents( new BlockPlaceListener(), this );
        getServer().getPluginManager().registerEvents( new BlockBreakListener(), this );
        getServer().getPluginManager().registerEvents( new WeatherChangeListener(), this );
        getServer().getPluginManager().registerEvents( new ThunderChangeListener(), this );

        getServer().getScheduler().scheduleSyncRepeatingTask( this, new Scheduler( session ), 0, 20 );


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
