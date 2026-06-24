package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale();
        adresse1.numeroRue = 12;
        adresse1.libelleRue = "rue des Lilas";
        adresse1.codePostal = "34000";
        adresse1.ville = "Montpellier";

        Personne personne1 = new Personne();
        personne1.nom = "Dupont";
        personne1.prenom = "Jean";
        personne1.adressePostale = adresse1;

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroRue = 5;
        adresse2.libelleRue = "avenue de la Gare";
        adresse2.codePostal = "75008";
        adresse2.ville = "Paris";

        Personne personne2 = new Personne();
        personne2.nom = "Martin";
        personne2.prenom = "Sophie";
        personne2.adressePostale = adresse2;
    }
}
