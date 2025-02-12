package lesson9.task1;

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
