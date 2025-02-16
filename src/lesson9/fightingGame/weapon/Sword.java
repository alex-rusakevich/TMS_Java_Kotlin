package lesson9.fightingGame.weapon;

import java.util.Random;

public class Sword extends Weapon {
    public Sword(int damage, Random r) {
        super(damage, r);
    }

    public boolean canAttackFromDistance(int distance) {
        return distance <= 1;
    }
}
