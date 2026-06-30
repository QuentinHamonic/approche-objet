package fr.diginamic.maps;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import fr.diginamic.tri.TestTri;
import fr.diginamic.tri.Ville;

public class MapVilles {

    public static void main(String[] args) throws IOException {

        Map<String, Ville> mapVilles = new HashMap<>();
        for (Ville ville : TestTri.chargerVilles()) {
            mapVilles.put(ville.getNom(), ville);
        }

        Ville moinsPeuplee = null;
        for (Ville ville : mapVilles.values()) {
            if (moinsPeuplee == null || ville.getPopulationTotale() < moinsPeuplee.getPopulationTotale()) {
                moinsPeuplee = ville;
            }
        }

        mapVilles.remove(moinsPeuplee.getNom());
        System.out.println("Ville supprimee (la moins peuplee) : " + moinsPeuplee);

        for (Ville ville : mapVilles.values()) {
            System.out.println(ville);
        }
    }
}
