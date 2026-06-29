package fr.diginamic.essais;

import fr.diginamic.maison.Chambre;
import fr.diginamic.maison.Cuisine;
import fr.diginamic.maison.Maison;
import fr.diginamic.maison.Piece;
import fr.diginamic.maison.SalleDeBain;
import fr.diginamic.maison.Salon;
import fr.diginamic.maison.WC;

public class TestMaison {

    public static void main(String[] args) {

        Maison maison = new Maison();

        maison.ajouterPiece(new Salon(30, 0));
        maison.ajouterPiece(new Cuisine(15, 0));
        maison.ajouterPiece(new WC(2, 0));

        maison.ajouterPiece(new Chambre(14, 1));
        maison.ajouterPiece(new Chambre(12, 1));
        maison.ajouterPiece(new SalleDeBain(8, 1));

        System.out.println("Superficie totale : " + maison.getSuperficieTotale() + " m²");
        System.out.println("Superficie du RDC : " + maison.getSuperficieParEtage(0) + " m²");
        System.out.println("Superficie du 1er étage : " + maison.getSuperficieParEtage(1) + " m²");

        System.out.println("Superficie totale des chambres : "
                + maison.getSuperficieParTypePiece(Chambre.class) + " m²");
        System.out.println("Nombre de chambres : "
                + maison.getNbPiecesParTypePiece(Chambre.class));

        System.out.println("\n--- Tests des cas incohérents ---");

        maison.ajouterPiece(null);

        Piece pieceIncoherente = new Chambre(-10, 0);
        maison.ajouterPiece(pieceIncoherente);

        System.out.println("Superficie totale après tests : "
                + maison.getSuperficieTotale() + " m² (inchangée)");
    }
}
