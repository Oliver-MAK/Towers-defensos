package game.towerdefens.core;

import java.util.List;

import static game.towerdefens.core.TileType.END;

public class Enemy {
    int maxHealth;
    int currHealth;
    int maxDamage;
    int currDamage;
    int reward;
    int speed;
    List<Tile> path;
    TileType type;
    int pathIndex;

    public boolean isAlive(){
        if (currHealth < 0){
            return false;
        }
        return true;
    }

    public boolean isAtEnd(TileType tile){
        if (tile == END){
            return true;
        }
        return false;

        //return tile == END;
    }
    public int getCurrentHealth(){
        return currHealth;
    }
    public int getMaxHealth(){
        return maxHealth;
    }

}
