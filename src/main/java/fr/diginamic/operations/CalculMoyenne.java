package fr.diginamic.operations;

import java.util.Arrays;

public class CalculMoyenne {

    private double[] valeurs = new double[0];

    public void ajout(double valeur) {
        valeurs = Arrays.copyOf(valeurs, valeurs.length + 1);
        valeurs[valeurs.length - 1] = valeur;
    }

    public double calcul() {
        if (valeurs.length == 0) {
            return 0;
        }
        double somme = 0;

        for (double valeur : valeurs) {
            somme += valeur;
        }
        return somme / valeurs.length;
    }
}
