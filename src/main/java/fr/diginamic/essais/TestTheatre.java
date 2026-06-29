package fr.diginamic.essais;

import fr.diginamic.entites.Theatre;

public class TestTheatre {

    public static void main(String[] args) {

        Theatre theatre = new Theatre("Le Grand Théâtre", 100);

        theatre.inscrire(40, 12.5);
        theatre.inscrire(30, 12.5);
        theatre.inscrire(40, 12.5);

        System.out.println("Total de clients inscrits : " + theatre.getTotalClients());
        System.out.println("Recette totale : " + theatre.getRecetteTotale() + " €");
    }
}
