package fr.diginamic.maison;

public abstract class Piece {

    protected double superficie;
    protected int etage;

    public Piece(double superficie, int etage) {
        this.superficie = superficie;
        this.etage = etage;
    }

    public double getSuperficie() {
        return superficie;
    }

    public int getEtage() {
        return etage;
    }
}
