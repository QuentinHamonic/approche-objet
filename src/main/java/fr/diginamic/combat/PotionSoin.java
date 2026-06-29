package fr.diginamic.combat;

import java.util.Random;

public class PotionSoin extends Potion {

    public PotionSoin() {
        super("Potion de soin");
    }

    @Override
    public void consommer(Personnage personnage) {
        int soin = 5 + new Random().nextInt(10 - 5 + 1);
        personnage.soigner(soin);
        System.out.println("Vous buvez une " + nom + " : +" + soin
                + " points de santé. Santé : " + personnage.getPointsDeSante());
    }
}
