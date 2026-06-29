package fr.diginamic.combat;

public abstract class Creature {

    protected String nom;
    protected int force;
    protected int pointsDeSante;

    public Creature(String nom, int force, int pointsDeSante) {
        this.nom = nom;
        this.force = force;
        this.pointsDeSante = pointsDeSante;
    }

    public abstract int getPointsScore();

    public boolean estVivante() {
        return pointsDeSante > 0;
    }

    public void subirDegats(int degats) {
        pointsDeSante -= degats;
    }

    public String getNom() {
        return nom;
    }

    public int getForce() {
        return force;
    }

    public int getPointsDeSante() {
        return pointsDeSante;
    }
}
