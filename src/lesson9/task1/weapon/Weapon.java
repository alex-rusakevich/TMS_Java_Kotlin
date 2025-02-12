package lesson9.task1.weapon;

import java.util.Random;

public abstract class Weapon {
    private int damage;
    private Random r;

    Weapon(int damage, Random r) {
        this.damage = damage;
        this.r = r;
    }

    public int getDamage() {
        return r.nextInt(0, damage);
    }

    public Random getRandom() {
        return r;
    }
}
