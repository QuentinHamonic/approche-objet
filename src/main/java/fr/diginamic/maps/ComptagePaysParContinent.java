package fr.diginamic.maps;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ComptagePaysParContinent {

    public static void main(String[] args) {

        List<Pays> pays = new ArrayList<>();
        pays.add(new Pays("France", 65000000L, "Europe"));
        pays.add(new Pays("Allemagne", 80000000L, "Europe"));
        pays.add(new Pays("Belgique", 10000000L, "Europe"));
        pays.add(new Pays("Russie", 150000000L, "Asie"));
        pays.add(new Pays("Chine", 1400000000L, "Asie"));
        pays.add(new Pays("Indonesie", 220000000L, "Oceanie"));
        pays.add(new Pays("Australie", 20000000L, "Oceanie"));

        Map<String, Integer> comptage = new HashMap<>();
        for (Pays p : pays) {
            String continent = p.getContinent();
            if (comptage.containsKey(continent)) {
                comptage.put(continent, comptage.get(continent) + 1);
            } else {
                comptage.put(continent, 1);
            }
        }

        for (Map.Entry<String, Integer> entree : comptage.entrySet()) {
            System.out.println(entree.getKey() + " : " + entree.getValue() + " pays");
        }
    }
}
