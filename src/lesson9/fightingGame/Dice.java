package lesson9.fightingGame;

import java.util.Random;

public class Dice {
    private final Random r;

    Dice (Random r) {
        this.r = r;
    }

    public int roll() {
        return r.nextInt(1, 7);
    }
}
