package fr.diginamic.tri;

import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class TestComparator {

    public static void main(String[] args) throws IOException {

        List<Ville> villes = TestTri.chargerVilles();

        System.out.println("=== Tri par nom (ComparatorNom) ===");
        Collections.sort(villes, new ComparatorNom());
        for (Ville ville : villes) {
            System.out.println(ville);
        }

        System.out.println("=== Tri par habitants (ComparatorHabitant) ===");
        Collections.sort(villes, new ComparatorHabitant());
        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }
}
