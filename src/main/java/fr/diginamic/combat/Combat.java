package fr.diginamic.combat;

import java.util.Random;

public class Combat {

    private Random random = new Random();

    private double tauxRecompense = 0.5;

    public Creature creerCreatureAleatoire() {
        int tirage = random.nextInt(3);
        switch (tirage) {
            case 0:
                return new Loup();
            case 1:
                return new Gobelin();
            default:
                return new Troll();
        }
    }

    private int calculerAttaque(int force) {
        return force + (1 + random.nextInt(10));
    }

    public boolean combattre(Personnage personnage, Creature creature) {

        System.out.println("\nUn " + creature.getNom() + " apparaît ! "
                + "(force=" + creature.getForce()
                + ", santé=" + creature.getPointsDeSante() + ")");

        if (personnage.getBonusAttaque() > 0) {
            System.out.println("Bonus d'attaque actif : +" + personnage.getBonusAttaque());
        }

        while (personnage.estVivant() && creature.estVivante()) {

            int attaquePersonnage = calculerAttaque(personnage.getForce() + personnage.getBonusAttaque());
            int attaqueCreature = calculerAttaque(creature.getForce());

            if (attaquePersonnage > attaqueCreature) {

                int degats = attaquePersonnage - attaqueCreature;
                creature.subirDegats(degats);
                System.out.println("Vous infligez " + degats + " dégâts. "
                        + "Santé du " + creature.getNom() + " : "
                        + creature.getPointsDeSante());
            } else if (attaqueCreature > attaquePersonnage) {

                int degats = attaqueCreature - attaquePersonnage;
                personnage.subirDegats(degats);
                System.out.println("Le " + creature.getNom() + " vous inflige "
                        + degats + " dégâts. Votre santé : "
                        + personnage.getPointsDeSante());
            } else {

                System.out.println("Égalité, personne n'est touché.");
            }
        }

        personnage.terminerCombat();

        if (personnage.estVivant()) {
            personnage.augmenterScore(creature.getPointsScore());
            System.out.println("Vous avez vaincu le " + creature.getNom()
                    + " ! Score : " + personnage.getScore());
            attribuerRecompense(personnage);
            return true;
        } else {
            System.out.println("Votre personnage est décédé. Il a obtenu le score de "
                    + personnage.getScore() + " points. Veuillez créer un nouveau personnage.");
            return false;
        }
    }

    private void attribuerRecompense(Personnage personnage) {
        if (random.nextDouble() < tauxRecompense) {
            int type = random.nextInt(4);
            switch (type) {
                case 0:
                    personnage.ajouterPotion(new PotionSoin());
                    System.out.println("Récompense : une Potion de soin rejoint votre inventaire !");
                    break;
                case 1:
                    personnage.ajouterPotion(new PotionAttaqueMineure());
                    System.out.println("Récompense : une Potion d'attaque mineure rejoint votre inventaire !");
                    break;
                case 2:
                    personnage.ajouterPotion(new PotionAttaqueMajeure());
                    System.out.println("Récompense : une Potion d'attaque majeure rejoint votre inventaire !");
                    break;
                default:
                    personnage.augmenterScore(5);
                    System.out.println("Récompense : +5 au score ! Score : " + personnage.getScore());
            }
        }
    }
}
