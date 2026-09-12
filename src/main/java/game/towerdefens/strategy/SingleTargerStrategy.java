package game.towerdefens.strategy;

import game.towerdefens.entity.Enemy;
import java.util.List;

public class SingleTargerStrategy implements TargetingStrategy{

    @Override
    public List<Enemy> selectTargets(List<Enemy> enemiesInRange){
        if (enemiesInRange.isEmpty()){
            return List.of();
        }
        return List.of(enemiesInRange.get(0));
    }

}
