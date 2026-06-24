package fr.diginamic.banque;

import fr.diginamic.banque.entites.Compte;

public class TestBanque {
    public static void main(String[] args) {
        Compte compte = new Compte("FR7612345", 1500.0);
        System.out.println(compte);
    }
}
// le sout print une forme d'adresse de l'intance avec un hash d'identification
// a la fin mais meme en rechargeant la cmd, cet ID ne change pas donc je vois
// pas trop ce que s'est