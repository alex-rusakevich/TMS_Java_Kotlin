package lesson9.fightingGame.hero;

import lesson9.fightingGame.armor.Armor;
import lesson9.fightingGame.weapon.Weapon;

public abstract class Hero {
    private int hp;
    private Armor armor;
    private Weapon weapon;
    public String name;
    private int crits = 2;

    Hero(String name, int hp, Armor armor, Weapon weapon) {
        this.name = name;
        this.hp = hp;
        this.armor = armor;
        this.weapon = weapon;
    }

    public int attack(int diceVal) {
        if (diceVal == 1) {
            System.out.println("O-oh, boy, that gonna hurt. I've heard that the jarl of Whiterun is hiring new guardians, why don't you give it a try?");
            System.out.printf("Hero %s hit his own knee with his weapon, dealing no damage and losing 2 hp\n", name);
            hp -= 2;
            return 0;
        } else {
            int deliveredDamage = weapon.getDamage() + diceVal;

            System.out.printf("Hero %s rolled dice: %d, delivered damage: %d\n", name, diceVal, deliveredDamage);

            return deliveredDamage;
        }
    }

    public int criticalAttack() {
        if (crits >= 1) {
            crits -= 1;
            int damage = weapon.getDamage();

            System.out.println("Not bad, kiddo");
            System.out.printf("Hero %s delivered critical damage: %d\n", name, damage);

            return damage;
        } else {
            System.out.println("Nope.");
            return 0;
        }
    }

    public boolean hasCrits() {
        return (crits >= 1);
    }

    public int getCrits() {
        return crits;
    }

    public void recieveDamage(int damage, int diceVal) {
        if (diceVal == 6) {
            System.out.println("Oh, shield, here we go again.");
            System.out.printf("Hero %s avoided damage, hp remaining: %d\n", name, hp);
        } else {
            int damageDelta = armor.reduceDamage(damage);
            hp -= damageDelta;

            System.out.printf("Hero %s lost %d hp, hp remaining: %d\n", name, damageDelta, hp);
        }
    }

    public void recievePureDamage(int damage) {
        hp -= damage;
        System.out.printf("Hero %s lost %d hp when his armor was pierced, hp remaining: %d\n", name, damage, hp);
    }

    public boolean isAlive() {
        return hp > 0;
    }

    public Weapon getWeapon() {
        return weapon;
    }
}
