package fr.diginamic.combat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Personnage {

    private int force;
    private int pointsDeSante;
    private int score;

    private List<Potion> inventaire = new ArrayList<>();

    private int bonusAttaque = 0;
    private int combatsBonusRestants = 0;

    public Personnage() {
        Random random = new Random();
        this.force = 12 + random.nextInt(18 - 12 + 1);
        this.pointsDeSante = 20 + random.nextInt(50 - 20 + 1);
        this.score = 0;

        inventaire.add(new PotionSoin());
        inventaire.add(new PotionAttaqueMineure());
        inventaire.add(new PotionAttaqueMajeure());
    }

    public boolean estVivant() {
        return pointsDeSante > 0;
    }

    public void subirDegats(int degats) {
        pointsDeSante -= degats;
    }

    public void soigner(int pointsDeVie) {
        pointsDeSante += pointsDeVie;
    }

    public void augmenterScore(int points) {
        score += points;
    }

    public void ajouterBonusAttaque(int points, int nbCombats) {
        bonusAttaque += points;
        if (nbCombats > combatsBonusRestants) {
            combatsBonusRestants = nbCombats;
        }
    }

    public int getBonusAttaque() {
        return combatsBonusRestants > 0 ? bonusAttaque : 0;
    }

    public void terminerCombat() {
        if (combatsBonusRestants > 0) {
            combatsBonusRestants--;
            if (combatsBonusRestants == 0) {
                bonusAttaque = 0;
            }
        }
    }

    public void ajouterPotion(Potion potion) {
        inventaire.add(potion);
    }

    public List<Potion> getInventaire() {
        return inventaire;
    }

    public int getForce() {
        return force;
    }

    public int getPointsDeSante() {
        return pointsDeSante;
    }

    public int getScore() {
        return score;
    }

    @Override
    public String toString() {
        return "Personnage [force=" + force + ", santé=" + pointsDeSante
                + ", score=" + score + ", potions=" + inventaire.size() + "]";
    }
}
