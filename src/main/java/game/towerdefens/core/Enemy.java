package game.towerdefens.core;

import java.util.ArrayList;
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

    public Enemy (int maxHealth, int currHealth, int dmgToPlayer, int reward, int speed, List<Tile> path,  TileType type, int pathIndex) {
        this.maxHealth = maxHealth;
        this.currHealth = maxHealth;
        this.dmgToPlayer = dmgToPlayer;
        this.reward = reward;
        this.speed = speed;
        this.path = path;
        this.type = type;
        this.pathIndex = pathIndex;
    }

    public boolean isAlive(){
        return currHealth > 0;
    }

    public boolean isAtEnd(){
        return pathIndex >= path.size()-1;
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

    public void takeDamage(int amount){
        currHealth -= amount;
        if(currHealth <= 0){
            currHealth = 0;
        }
    }

    public void move(){
        if(isAlive() && !isAtEnd()){
            pathIndex++;
        }
    }

}
