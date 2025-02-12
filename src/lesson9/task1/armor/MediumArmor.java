package lesson9.task1.armor;

import java.util.Random;

public class MediumArmor extends Armor {
    Random r = new Random();

    public MediumArmor(int armorRating, int durability) {
        super(armorRating, durability);
    }

    @Override
    public int reduceDamage(int damage){
        return (int) Math.floor(super.reduceDamage(damage) * 0.6);
    }
}
