package entites;

public class TestAdressePostale {
    public static void main(String[] args) {
        AdressePostale adresse1 = new AdressePostale();
        adresse1.numeroRue = 12;
        adresse1.libelleRue = "rue des Lilas";
        adresse1.codePostal = "34000";
        adresse1.ville = "Montpellier";

        AdressePostale adresse2 = new AdressePostale();
        adresse2.numeroRue = 5;
        adresse2.libelleRue = "avenue de la Gare";
        adresse2.codePostal = "75008";
        adresse2.ville = "Paris";
    }
}
