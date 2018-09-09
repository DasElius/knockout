package com.daselius.knockout.eventlisteners;

import com.daselius.knockout.session.GameSession;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerQuitEvent;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class PlayerQuitListener implements Listener {

    private final GameSession session;

    public PlayerQuitListener( final GameSession session ) {
        this.session = session;
    }

    @EventHandler
    public void onPlayerQuit( PlayerQuitEvent event ) {
        event.setQuitMessage( null );
        session.getGamePlayerMap().remove( event.getPlayer() );
    }

}
