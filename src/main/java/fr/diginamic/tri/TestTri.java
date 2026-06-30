package fr.diginamic.tri;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestTri {

    public static void main(String[] args) throws IOException {

        List<Ville> villes = chargerVilles();

        Collections.sort(villes);

        for (Ville ville : villes) {
            System.out.println(ville);
        }
    }

    public static List<Ville> chargerVilles() throws IOException {

        List<Ville> villes = new ArrayList<>();

        Path path = Paths.get("recensement.csv");
        List<String> lignes = Files.readAllLines(path, StandardCharsets.UTF_8);

        for (int i = 1; i < lignes.size(); i++) {
            String[] tokens = lignes.get(i).split(";");

            String nom = tokens[6];
            String codeDepartement = tokens[2];
            String nomRegion = tokens[1];
            int populationTotale = Integer.parseInt(tokens[9].trim().replaceAll(" ", ""));

            villes.add(new Ville(nom, codeDepartement, nomRegion, populationTotale));
        }

        return villes;
    }
}
