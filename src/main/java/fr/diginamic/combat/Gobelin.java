package fr.diginamic.combat;

import java.util.Random;

public class Gobelin extends Creature {

    public Gobelin() {
        super("Gobelin",
              5 + new Random().nextInt(10 - 5 + 1),
              10 + new Random().nextInt(15 - 10 + 1));
    }

    @Override
    public int getPointsScore() {
        return 2;
    }
}
