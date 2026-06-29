package fr.diginamic.combat;

public class PotionAttaqueMineure extends Potion {

    public PotionAttaqueMineure() {
        super("Potion d'attaque mineure");
    }

    @Override
    public void consommer(Personnage personnage) {
        personnage.ajouterBonusAttaque(3, 1);
        System.out.println("Vous buvez une " + nom
                + " : +3 en attaque pour le prochain combat.");
    }
}
