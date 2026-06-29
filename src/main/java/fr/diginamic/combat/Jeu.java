package fr.diginamic.combat;

import java.util.List;
import java.util.Scanner;

public class Jeu {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Combat combat = new Combat();

        Personnage personnage = null;

        boolean continuer = true;
        while (continuer) {

            System.out.println("\n===== MENU =====");
            System.out.println("1. Créer le personnage");
            System.out.println("2. Combattre une créature");
            System.out.println("3. Prendre une potion");
            System.out.println("4. Afficher le score");
            System.out.println("5. Sortir");
            System.out.print("Votre choix : ");

            String choix = scanner.nextLine();

            switch (choix) {
                case "1":
                    personnage = new Personnage();
                    System.out.println("Personnage créé : " + personnage);
                    break;

                case "2":
                    if (personnage == null) {
                        System.out.println("Veuillez d'abord créer un personnage (option 1).");
                    } else if (!personnage.estVivant()) {

                        System.out.println("Votre personnage est décédé. Il a obtenu le score de "
                                + personnage.getScore()
                                + " points. Veuillez créer un nouveau personnage.");
                    } else {
                        Creature creature = combat.creerCreatureAleatoire();
                        combat.combattre(personnage, creature);
                    }
                    break;

                case "3":

                    prendrePotion(personnage, scanner);
                    break;

                case "4":
                    if (personnage == null) {
                        System.out.println("Aucun personnage. Score : 0");
                    } else {
                        System.out.println("Score actuel : " + personnage.getScore());
                    }
                    break;

                case "5":
                    continuer = false;
                    System.out.println("Au revoir !");
                    break;

                default:
                    System.out.println("Choix invalide, veuillez réessayer.");
            }
        }

        scanner.close();
    }

    private static void prendrePotion(Personnage personnage, Scanner scanner) {
        if (personnage == null) {
            System.out.println("Veuillez d'abord créer un personnage (option 1).");
            return;
        }

        List<Potion> inventaire = personnage.getInventaire();
        if (inventaire.isEmpty()) {
            System.out.println("Votre inventaire est vide.");
            return;
        }

        System.out.println("Vos potions :");
        for (int i = 0; i < inventaire.size(); i++) {
            System.out.println((i + 1) + ". " + inventaire.get(i).getNom());
        }
        System.out.print("Quelle potion consommer (0 pour annuler) ? ");

        String saisie = scanner.nextLine();
        int index;
        try {
            index = Integer.parseInt(saisie);
        } catch (NumberFormatException e) {
            index = -1;
        }

        if (index == 0) {
            return;
        }
        if (index >= 1 && index <= inventaire.size()) {

            Potion potion = inventaire.remove(index - 1);
            potion.consommer(personnage);
        } else {
            System.out.println("Choix invalide.");
        }
    }
}
