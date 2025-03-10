package lesson9.fightingGame.armor;

import java.util.Random;

public class LightArmor extends Armor {
    Random r = new Random();

    public LightArmor(int armorRating, int durability) {
        super(armorRating, durability);
    }

    @Override
    public int reduceDamage(int damage){
        return (int) Math.floor(super.reduceDamage(damage) * 0.8);
    }
}
