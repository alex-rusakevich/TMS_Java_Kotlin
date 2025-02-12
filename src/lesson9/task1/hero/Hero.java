package lesson9.task1.hero;

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
        int deliveredDamage = weapon.getDamage() + diceVal;

        System.out.printf("Hero %s rolled dice: %d, delivered damage: %d\n", name, diceVal, deliveredDamage);

        return deliveredDamage;
    }

    public void recieveDamage(int damage) {
        int damageDelta = armor.reduceDamage(damage);
        hp -= damageDelta;

        System.out.printf("Hero %s lost %d hp, hp remaining: %d\n", name, damageDelta, hp);
    }

    public boolean isAlive() {
        return hp > 0;
    }
}
