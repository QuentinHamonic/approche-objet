package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestListeInt {

    public static void main(String[] args) {

        List<Integer> liste = new ArrayList<>();
        liste.add(-1);
        liste.add(5);
        liste.add(7);
        liste.add(3);
        liste.add(-2);
        liste.add(4);
        liste.add(8);
        liste.add(5);

        System.out.println("Elements de la liste : " + liste);
        System.out.println("Taille de la liste : " + liste.size());
        System.out.println("Plus grand element : " + Collections.max(liste));

        liste.remove(Collections.min(liste));
        System.out.println("Apres suppression du plus petit : " + liste);

        for (int i = 0; i < liste.size(); i++) {
            if (liste.get(i) < 0) {
                liste.set(i, -liste.get(i));
            }
        }

        System.out.println("Liste resultante : " + liste);
    }
}
