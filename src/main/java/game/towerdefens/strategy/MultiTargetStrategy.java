package game.towerdefens.strategy;

import game.towerdefens.entity.Enemy;

import java.util.List;

public class MultiTargetStrategy implements TargetingStrategy {
    @Override
    public List<Enemy> selectTargets(List<Enemy> enemiesInRange) {
        return List.of();
    }
}
