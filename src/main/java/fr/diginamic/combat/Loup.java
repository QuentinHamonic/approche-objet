package fr.diginamic.combat;

import java.util.Random;

public class Loup extends Creature {

    public Loup() {

        super("Loup",
              3 + new Random().nextInt(8 - 3 + 1),
              5 + new Random().nextInt(10 - 5 + 1));
    }

    @Override
    public int getPointsScore() {
        return 1;
    }
}
