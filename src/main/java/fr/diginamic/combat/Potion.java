package fr.diginamic.combat;

public abstract class Potion {

    protected String nom;

    public Potion(String nom) {
        this.nom = nom;
    }

    public abstract void consommer(Personnage personnage);

    public String getNom() {
        return nom;
    }
}
