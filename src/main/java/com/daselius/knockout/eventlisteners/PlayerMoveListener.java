package com.daselius.knockout.eventlisteners;

import com.daselius.knockout.session.GameSession;
import com.daselius.knockout.session.player.GamePlayer;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerMoveEvent;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class PlayerMoveListener implements Listener {

    private final GameSession session;

    public PlayerMoveListener( final GameSession session ) {
        this.session = session;
    }

    @EventHandler
    public void onPlayerMove( PlayerMoveEvent event ) {
        if ( event.getTo().getY() <= session.getGameMap().getDeathHeight() ) {
            event.getPlayer().setFallDistance( 0f );
            event.setTo( session.getGameMap().getSpawnLocation() );

            final GamePlayer gamePlayer = session.getGamePlayerMap().get( event.getPlayer() );
            gamePlayer.addDeath();
            gamePlayer.updatePlayer();


        }
    }

}
