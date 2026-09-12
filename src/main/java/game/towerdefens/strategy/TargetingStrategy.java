package game.towerdefens.strategy;

import game.towerdefens.entity.Enemy;
import java.util.List;

public interface TargetingStrategy {
    List<Enemy> selectTargets(List<Enemy> enemiesInRange);
}