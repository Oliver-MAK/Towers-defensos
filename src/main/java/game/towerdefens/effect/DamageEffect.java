package game.towerdefens.effect;

import game.towerdefens.entity.Enemy;


public class DamageEffect implements TowerEffect {
    private final int amount;

    public DamageEffect(int amount) {
        this.amount = amount;
    }

    @Override
    public void apply(Enemy target) {
        target.takeDamage(amount);
    }
}
