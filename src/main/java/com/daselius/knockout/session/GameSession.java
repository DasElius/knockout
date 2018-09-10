package com.daselius.knockout.session;

import com.daselius.knockout.map.GameMap;
import com.daselius.knockout.session.player.GamePlayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;

import java.util.*;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class GameSession {

    private final Map<Player, GamePlayer> gamePlayerMap = new HashMap<>();
    private final List<GameMap> gameMapList = new ArrayList<>();

    private GameMap gameMap;

    public Map<Player, GamePlayer> getGamePlayerMap() {
        return gamePlayerMap;
    }

    public GameMap getGameMap() {
        return gameMap;
    }

    public void setGameMap( final GameMap gameMap ) {
        this.gameMap = gameMap;
    }

    public void changeMap() {
        final Random random = new Random();
        int index = random.nextInt( gameMapList.size() );

        Bukkit.broadcastMessage( "Map changes now!" );
        setGameMap( gameMapList.get( index ) );

        for ( Player all : Bukkit.getOnlinePlayers() ) {
            all.teleport( getGameMap().getSpawnLocation() );
        }

        Bukkit.broadcastMessage( "All Players were teleported to the new map!" );
    }

    public List<GameMap> getGameMapList() {
        return gameMapList;
    }
}
