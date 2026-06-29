package fr.diginamic.essais;

import fr.diginamic.salaire.Intervenant;
import fr.diginamic.salaire.Pigiste;
import fr.diginamic.salaire.Salarie;

public class TestIntervenant {

    public static void main(String[] args) {

        Salarie salarie = new Salarie("Durand", "Marcel", 2500);
        Pigiste pigiste = new Pigiste("Martin", "Sophie", 10, 120);

        System.out.println("Salaire du salarié : " + salarie.getSalaire());
        System.out.println("Salaire du pigiste : " + pigiste.getSalaire());

        System.out.println("\n--- Affichage complet des intervenants ---");
        Intervenant[] intervenants = { salarie, pigiste };
        for (Intervenant intervenant : intervenants) {
            intervenant.afficherDonnees();
        }
    }
}
