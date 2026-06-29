package fr.diginamic.fichier;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CreerFichier {

    public static void main(String[] args) throws IOException {

        Path source = Paths.get("recensement.csv");
        List<String> lignes = Files.readAllLines(source, StandardCharsets.UTF_8);

        List<String> centPremieres = new ArrayList<>();
        for (int i = 0; i < 100 && i < lignes.size(); i++) {
            centPremieres.add(lignes.get(i));
        }

        Path destination = Paths.get("recensement_100.csv");
        Files.write(destination, centPremieres, StandardCharsets.UTF_8);

        System.out.println(centPremieres.size() + " lignes ecrites dans " + destination);
    }
}
