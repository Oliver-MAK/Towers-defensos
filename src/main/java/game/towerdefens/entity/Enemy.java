package game.towerdefens.entity;

import game.towerdefens.core.Tile;

import java.util.List;


public class Enemy {
    private final int maxHealth;
    private int currHealth;
    private final int dmgToPlayer;
    private final int reward;
    private final int speed;
    final List<Tile> path;
    private int pathIndex;
    private int slowTicksRemaining;

    public Enemy (int maxHealth, int dmgToPlayer, int reward, int speed, List<Tile> path) {
        this.maxHealth = maxHealth;
        this.currHealth = maxHealth;
        this.dmgToPlayer = dmgToPlayer;
        this.reward = reward;
        this.speed = speed;
        this.path = path;
        this.pathIndex = 0;
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

    public int getCurrentSpeed(){
        if (slowTicksRemaining > 0){
            return speed/2;
        }
        return speed;
    }

    public void applySlow(int durationTicks){
        slowTicksRemaining = durationTicks;
    }

}
