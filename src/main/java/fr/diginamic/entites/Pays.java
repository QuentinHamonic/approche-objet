package fr.diginamic.entites;

import java.util.Objects;

public class Pays {

    private String nom;
    private int population;

    public Pays(String nom, int population) {
        this.nom = nom;
        this.population = population;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Pays autre = (Pays) obj;
        return population == autre.population && Objects.equals(nom, autre.nom); // nom.equals(...) plante si nom vaut
                                                                                 // null
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, population);
    }
}
