package fr.diginamic.essais;

import fr.diginamic.operations.CalculMoyenne;

public class TestMoyenne {

    public static void main(String[] args) {

        CalculMoyenne calcul1 = new CalculMoyenne();
        calcul1.ajout(10);
        calcul1.ajout(20);
        calcul1.ajout(30);
        System.out.println("Test 1 - moyenne de (10, 20, 30) = " + calcul1.calcul());

        CalculMoyenne calcul2 = new CalculMoyenne();
        calcul2.ajout(5);
        calcul2.ajout(5);
        calcul2.ajout(10);
        calcul2.ajout(0);
        System.out.println("Test 2 - moyenne de (5, 5, 10, 0) = " + calcul2.calcul());
    }
}
