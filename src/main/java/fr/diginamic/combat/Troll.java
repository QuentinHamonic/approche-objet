package fr.diginamic.combat;

import java.util.Random;

public class Troll extends Creature {

    public Troll() {
        super("Troll",
              10 + new Random().nextInt(15 - 10 + 1),
              20 + new Random().nextInt(30 - 20 + 1));
    }

    @Override
    public int getPointsScore() {
        return 5;
    }
}
