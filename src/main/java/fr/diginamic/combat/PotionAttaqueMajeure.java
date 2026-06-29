package fr.diginamic.combat;

public class PotionAttaqueMajeure extends Potion {

    public PotionAttaqueMajeure() {
        super("Potion d'attaque majeure");
    }

    @Override
    public void consommer(Personnage personnage) {
        personnage.ajouterBonusAttaque(5, 2);
        System.out.println("Vous buvez une " + nom
                + " : +5 en attaque pour les 2 prochains combats.");
    }
}
