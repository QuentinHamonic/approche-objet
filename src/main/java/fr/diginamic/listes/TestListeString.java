package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestListeString {

    public static void main(String[] args) {

        List<String> villes = new ArrayList<>();
        villes.add("Nice");
        villes.add("Carcassonne");
        villes.add("Narbonne");
        villes.add("Lyon");
        villes.add("Foix");
        villes.add("Pau");
        villes.add("Marseille");
        villes.add("Tarbes");

        String plusLongue = villes.get(0);
        for (String ville : villes) {
            if (ville.length() > plusLongue.length()) {
                plusLongue = ville;
            }
        }
        System.out.println("Ville avec le plus de lettres : " + plusLongue);

        for (int i = 0; i < villes.size(); i++) {
            villes.set(i, villes.get(i).toUpperCase());
        }

        for (int i = villes.size() - 1; i >= 0; i--) {
            if (villes.get(i).startsWith("N")) {
                villes.remove(i);
            }
        }

        System.out.println("Liste resultante : " + villes);
    }
}
