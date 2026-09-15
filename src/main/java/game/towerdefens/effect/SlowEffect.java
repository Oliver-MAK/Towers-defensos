package game.towerdefens.effect;

import game.towerdefens.entity.Enemy;

public class SlowEffect implements TowerEffect {
    private final int durationTicks;

    public SlowEffect(int durationTicks) {
        this.durationTicks = durationTicks;
    }

    @Override
    public void apply(Enemy target) {

    }
}
