package entites;

import entites2.Personne;

public class TestPersonne {
    public static void main(String[] args) {
        Personne personne1 = new Personne("Dupont", "Jean");

        AdressePostale adresse2 = new AdressePostale(5, "avenue de la Gare", "75008", "Paris");
        Personne personne2 = new Personne("Martin", "Sophie");
        personne2.setAdressePostale(adresse2);
    }
}
// c'est beaucoup plus simple d'instancier
