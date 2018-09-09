package com.daselius.knockout.eventlisteners;

import com.daselius.knockout.session.GameSession;
import com.daselius.knockout.session.player.GamePlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.spigotmc.event.player.PlayerSpawnLocationEvent;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class PlayerJoinListener implements Listener {

    private final GameSession session;

    public PlayerJoinListener( final GameSession session ) {
        this.session = session;
    }

    @EventHandler
    public void onPlayerJoin( PlayerJoinEvent event ) {
        event.setJoinMessage( null );

        final GamePlayer gamePlayer;
        session.getGamePlayerMap().put( event.getPlayer(), gamePlayer = new GamePlayer( event.getPlayer() ) );

        gamePlayer.updatePlayer();
    }

    @EventHandler
    public void onPlayerSpawnLoc( PlayerSpawnLocationEvent event ) {
        event.setSpawnLocation( session.getGameMap().getSpawnLocation() );
    }

}
