package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;
import fr.diginamic.banque.entites.CompteTaux;

public class TestBanque {
    public static void main(String[] args) {
        Compte[] comptes = new Compte[2];
        comptes[0] = new Compte("FR7612345", 1500.0);
        comptes[1] = new CompteTaux("FR7698765", 3000.0, 2.5);

        for (Compte compte : comptes) {
            System.out.println(compte);
        }
    }
}
