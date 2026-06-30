package fr.diginamic.tri;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class GenererFichierTri {

    public static void main(String[] args) throws IOException {

        List<Ville> villes = TestTri.chargerVilles();

        List<Ville> grandesVilles = new ArrayList<>();
        for (Ville ville : villes) {
            if (ville.getPopulationTotale() > 25000) {
                grandesVilles.add(ville);
            }
        }

        Collections.sort(grandesVilles);
        Collections.reverse(grandesVilles);

        List<String> lignesSortie = new ArrayList<>();
        lignesSortie.add("Nom;Code departement;Nom de la region;Population totale");
        for (Ville ville : grandesVilles) {
            lignesSortie.add(ville.getNom() + ";" + ville.getCodeDepartement() + ";"
                    + ville.getNomRegion() + ";" + ville.getPopulationTotale());
        }

        Path destination = Paths.get("villes_plus_25000_triees.csv");
        Files.write(destination, lignesSortie, StandardCharsets.UTF_8);

        System.out.println((lignesSortie.size() - 1)
                + " villes de plus de 25000 habitants triees par population decroissante dans " + destination);
    }
}
