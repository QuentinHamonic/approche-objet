package fr.diginamic.banque;

import fr.diginamic.banque.entites.Credit;
import fr.diginamic.banque.entites.Debit;
import fr.diginamic.banque.entites.Operation;

public class TestOperation {
    public static void main(String[] args) {
        Operation[] operations = new Operation[4];
        operations[0] = new Credit("01/01/2026", 500.0);
        operations[1] = new Debit("02/01/2026", 200.0);
        operations[2] = new Credit("03/01/2026", 1000.0);
        operations[3] = new Debit("04/01/2026", 150.0);

        double montantGlobal = 0;
        for (Operation operation : operations) {
            System.out.println(operation.getDate() + " " + operation.getMontant() + " " + operation.getType());
            if (operation.getType().equals("DEBIT")) {
                montantGlobal -= operation.getMontant();
            } else {
                montantGlobal += operation.getMontant();
            }
        }
        System.out.println(montantGlobal);
    }
}
