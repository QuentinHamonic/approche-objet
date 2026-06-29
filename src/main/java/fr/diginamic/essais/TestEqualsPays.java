package fr.diginamic.essais;

import fr.diginamic.entites.Pays;

public class TestEqualsPays {

    public static void main(String[] args) {

        Pays france = new Pays("France", 67000000);
        Pays memeFrance = new Pays("France", 67000000);
        Pays autreFrance = new Pays("France", 70000000);

        System.out.println("equals - memes attributs    : " + france.equals(memeFrance));
        System.out.println("equals - un attribut change : " + france.equals(autreFrance));

        System.out.println("== - memes attributs        : " + (france == memeFrance));
        System.out.println("== - attributs differents   : " + (france == autreFrance));
    }
}
