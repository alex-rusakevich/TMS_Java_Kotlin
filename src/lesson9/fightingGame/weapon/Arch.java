package lesson9.fightingGame.weapon;

import java.util.Random;

public class Arch extends Weapon {
    public Arch(int damage, Random r) {
        super(damage, r);
    }

    @Override
    public int getDamage() {
        Random r = getRandom();
        int crit = r.nextInt(0, 1);

        return super.getDamage() + crit;
    }

    public boolean canAttackFromDistance(int distance) {
        return distance >= 1;
    }
}
