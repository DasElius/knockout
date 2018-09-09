package com.daselius.knockout.session;

import com.daselius.knockout.map.GameMap;
import com.daselius.knockout.session.player.GamePlayer;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.Map;

/**
 * JavaDoc this file!
 * Created: 09.09.2018
 *
 * @author DasElius
 */
public class GameSession {

    private final Map<Player, GamePlayer> gamePlayerMap = new HashMap<>();

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

}
