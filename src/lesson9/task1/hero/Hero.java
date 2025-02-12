package lesson9.task1;

import lesson9.task1.armor.Armor;
import lesson9.task1.weapon.Weapon;

public abstract class Hero {
    private int hp;
    private Armor armor;
    private Weapon weapon;
    public String name;

    Hero(String name, int hp, Armor armor, Weapon weapon) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.weapon = weapon;
    }

    public int attack(int diceVal) {
        return weapon.getDamage() + diceVal;
    }

    public void recieveDamage(int damage) {
        hp -= armor.reduceDamage(damage);
    }

    public boolean isAlive() {
        return hp > 0;
    }
}
