package fr.diginamic.maison;

import java.util.Arrays;

public class Maison {

    private Piece[] pieces = new Piece[0];

    public void ajouterPiece(Piece piece) {
        if (piece == null) {
            System.out.println("Erreur : impossible d'ajouter une pièce null.");
            return;
        }
        if (piece.getSuperficie() < 0 || piece.getEtage() < 0) {
            System.out.println("Erreur : superficie ou étage négatif, pièce ignorée.");
            return;
        }
        pieces = Arrays.copyOf(pieces, pieces.length + 1);
        pieces[pieces.length - 1] = piece;
    }

    public double getSuperficieTotale() {
        double total = 0;
        for (Piece piece : pieces) {
            total += piece.getSuperficie();
        }
        return total;
    }

    public double getSuperficieParEtage(int etage) {
        double total = 0;
        for (Piece piece : pieces) {
            if (piece.getEtage() == etage) {
                total += piece.getSuperficie();
            }
        }
        return total;
    }

    public double getSuperficieParTypePiece(Class<? extends Piece> typePiece) {
        double total = 0;
        for (Piece piece : pieces) {
            if (piece.getClass() == typePiece) {
                total += piece.getSuperficie();
            }
        }
        return total;
    }

    public int getNbPiecesParTypePiece(Class<? extends Piece> typePiece) {
        int nombre = 0;
        for (Piece piece : pieces) {
            if (piece.getClass() == typePiece) {
                nombre++;
            }
        }
        return nombre;
    }
}
