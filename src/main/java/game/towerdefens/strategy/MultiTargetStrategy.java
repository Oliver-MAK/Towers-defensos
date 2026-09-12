package game.towerdefens.strategy;

import game.towerdefens.entity.Enemy;

import java.util.List;

public class MultiTargetStrategy implements TargetingStrategy {
    private final int maxTargets;

    public MultiTargetStrategy(int maxTargets){
        this.maxTargets = maxTargets;
    }

    @Override
    public List<Enemy> selectTargets(List<Enemy> enemiesInRange) {
        if (enemiesInRange.isEmpty()){
            return List.of();
        }
        return enemiesInRange.subList(0, 3);
    }
}
