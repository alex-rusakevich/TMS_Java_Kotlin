package lesson9.task1;

abstract class Armor {
    private int armorRating;
    private int durability;

    Armor(int armorRating, int durability) {
        this.armorRating = armorRating;
        this.durability = durability;
    }

    public int reduceDamage(int damage) {
        if (durability <= 0) return damage;
        durability -= 1;

        return Math.max(damage - armorRating, 0);
    }
}
