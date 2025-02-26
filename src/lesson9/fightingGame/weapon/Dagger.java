package lesson9.fightingGame.weapon;

import java.util.Random;

public class Dagger extends Weapon {
    public Dagger(int damage, Random r) {
        super(damage, r);
    }

    public boolean canAttackFromDistance(int distance) {
        return distance == 0;
    }
}
