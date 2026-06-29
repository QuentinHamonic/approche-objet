package fr.diginamic.chaines;

import java.util.Arrays;

import fr.diginamic.entites.Salarie;

public class ManipulationChaine {

    public static void main(String[] args) {

        String chaine = "Durand;Marcel;2 523.5";

        char premierCaractere = chaine.charAt(0);
        System.out.println("1) Premier caractère : " + premierCaractere);

        System.out.println("2) Longueur de la chaîne : " + chaine.length());

        int indexPremierPointVirgule = chaine.indexOf(';');
        System.out.println("3) Index du premier ';' : " + indexPremierPointVirgule);

        System.out.println("4) substring(0, 6) = " + chaine.substring(0, 6));

        String nomFamille = chaine.substring(0, indexPremierPointVirgule);
        System.out.println("5) Nom de famille : " + nomFamille);

        System.out.println("6) Nom en majuscules : " + nomFamille.toUpperCase());

        System.out.println("7) Nom en minuscules : " + nomFamille.toLowerCase());

        String[] morceaux = chaine.split(";");
        System.out.println("8) Tableau obtenu : " + Arrays.toString(morceaux));

        String nom = morceaux[0];
        String prenom = morceaux[1];
        String salaireTexte = morceaux[2];

        salaireTexte = salaireTexte.replace(" ", "");

        double salaire = Double.parseDouble(salaireTexte);

        Salarie salarie = new Salarie(nom, prenom, salaire);
        System.out.println("9) Salarié créé : " + salarie);
    }
}
