package game.towerdefens.core;

import java.util.List;


public class Enemy {
    private int maxHealth;
    private int currHealth;
    private int dmgToPlayer;
    private int reward;
    private int speed;
    private List<Tile> path;
    private TileType type;
    private int pathIndex;

    public boolean isAlive(){
        return currHealth >= 0;
    }

    public boolean isAtEnd(TileType tile){
        return pathIndex == path.size()-1;
    }
    public int getCurrHealth(){
        return currHealth;
    }
    public int getMaxHealth(){
        return maxHealth;
    }
    public int getDmgToPlayer (){
        return dmgToPlayer;
    }
}
