package com.daselius.knockout.session;

import com.daselius.knockout.kits.Kit;
import com.daselius.knockout.map.GameMap;
import com.daselius.knockout.session.player.GamePlayer;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;

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

    private final List<Kit> kitList = new ArrayList<>();

    private GameMap gameMap;
    private Kit kit;

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

    public void setKit( Kit kit ) {
        this.kit = kit;
    }

    public void changeKit( final Player player ) {
        final Random random = new Random();
        int index = random.nextInt( kitList.size() );

        Bukkit.broadcastMessage( "Kits change now!" );
        setKit( kitList.get( index ) );

        player.getInventory().clear();

        final ItemStack knockBackStick = new ItemStack( Material.STICK );
        knockBackStick.addUnsafeEnchantment( Enchantment.KNOCKBACK, 1 );

        player.getInventory().setItem( 0, knockBackStick );
        player.getInventory().setItem( 1, kit.getKitItems() );

        Bukkit.broadcastMessage( "All Player got their new kits!" );
    }

    public List<Kit> getKitList() {
        return kitList;
    }
}
