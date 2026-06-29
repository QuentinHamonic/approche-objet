package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LectureFichier {

    public static void main(String[] args) throws IOException {

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

        for (String ligne : lignes) {
            System.out.println(ligne);
        }

        System.out.println("Nombre de villes chargees : " + villes.size());
        System.out.println("Premiere ville : " + villes.get(0));
        System.out.println("Derniere ville : " + villes.get(villes.size() - 1));

        List<String> lignesSortie = new ArrayList<>();
        lignesSortie.add("Nom;Code departement;Nom de la region;Population totale");
        for (Ville ville : villes) {
            if (ville.getPopulationTotale() > 25000) {
                lignesSortie.add(ville.getNom() + ";" + ville.getCodeDepartement() + ";"
                        + ville.getNomRegion() + ";" + ville.getPopulationTotale());
            }
        }

        Path destination = Paths.get("villes_plus_25000.csv");
        Files.write(destination, lignesSortie, StandardCharsets.UTF_8);

        System.out
                .println((lignesSortie.size() - 1) + " villes de plus de 25000 habitants ecrites dans " + destination);
    }
}
