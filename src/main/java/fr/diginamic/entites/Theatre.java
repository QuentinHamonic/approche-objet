package fr.diginamic.entites;

public class Theatre {

    private String nom;
    private int capaciteMax;
    private int totalClients;
    private double recetteTotale;

    public Theatre(String nom, int capaciteMax) {
        this.nom = nom;
        this.capaciteMax = capaciteMax;
        this.totalClients = 0;
        this.recetteTotale = 0;
    }

    public void inscrire(int nombreClients, double prixPlace) {

        if (totalClients + nombreClients <= capaciteMax) {
            totalClients += nombreClients;
            recetteTotale += nombreClients * prixPlace;
        } else {
            System.out.println("Erreur : capacité maximale atteinte pour le théâtre "
                    + nom + " (" + capaciteMax + " places).");
        }
    }

    public String getNom() {
        return nom;
    }

    public int getCapaciteMax() {
        return capaciteMax;
    }

    public int getTotalClients() {
        return totalClients;
    }

    public double getRecetteTotale() {
        return recetteTotale;
    }
}
