package lesson9.fightingGame.armor;

import java.util.Random;

public class HeavyArmor extends Armor {
    Random r = new Random();

    public HeavyArmor(int armorRating, int durability) {
        super(armorRating, durability);
    }

    @Override
    public int reduceDamage(int damage){
        return (int) Math.floor(super.reduceDamage(damage) * 0.4);
    }
}
