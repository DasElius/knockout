package com.daselius.knockout.runnables;

import com.daselius.knockout.session.GameSession;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;


/**
 * JavaDoc this file!
 * Created: 10.09.2018
 *
 * @author DasElius
 */
public class Scheduler implements Runnable {

    private final GameSession session;

    int kitChangeTime = 20;
    int mapChangeTime = 20;

    public Scheduler( final GameSession session ) {
        this.session = session;
    }

    @Override
    public void run() {
        kitChangeTime -= 1;
        mapChangeTime -= 1;
        Bukkit.broadcastMessage( Integer.toString( kitChangeTime ) + " seconds until next kit-change!" );
        Bukkit.broadcastMessage( Integer.toString( mapChangeTime ) + " seconds until next map-change!" );

        if ( mapChangeTime == 0 ) {
            session.changeMap();
            mapChangeTime = 20;
        }

        if ( kitChangeTime == 0 ) {
            for(Player all : Bukkit.getOnlinePlayers()) {

                session.changeKit( all );

            }

            kitChangeTime = 20;
        }
    }
}
