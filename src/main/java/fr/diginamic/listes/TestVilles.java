package fr.diginamic.listes;

import java.util.ArrayList;
import java.util.List;

public class TestVilles {

    public static void main(String[] args) {

        List<Ville> villes = new ArrayList<>();
        villes.add(new Ville("Nice", 343000));
        villes.add(new Ville("Carcassonne", 47800));
        villes.add(new Ville("Narbonne", 53400));
        villes.add(new Ville("Lyon", 484000));
        villes.add(new Ville("Foix", 9700));
        villes.add(new Ville("Pau", 77200));
        villes.add(new Ville("Marseille", 850700));
        villes.add(new Ville("Tarbes", 40600));

        Ville plusPeuplee = villes.get(0);
        Ville moinsPeuplee = villes.get(0);
        for (Ville ville : villes) {
            if (ville.getNbHabitants() > plusPeuplee.getNbHabitants()) {
                plusPeuplee = ville;
            }
            if (ville.getNbHabitants() < moinsPeuplee.getNbHabitants()) {
                moinsPeuplee = ville;
            }
        }

        System.out.println("Ville la plus peuplee : " + plusPeuplee);

        villes.remove(moinsPeuplee);

        for (Ville ville : villes) {
            if (ville.getNbHabitants() > 100000) {
                ville.setNom(ville.getNom().toUpperCase());
            }
        }

        System.out.println("Liste resultante : " + villes);
    }
}
