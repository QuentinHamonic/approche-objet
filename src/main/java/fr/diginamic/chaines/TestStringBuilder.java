package fr.diginamic.chaines;

public class TestStringBuilder {

    public static void main(String[] args) {

        // 1) Concaténation avec StringBuilder
        long debutSB = System.currentTimeMillis();

        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 100_000; i++) {
            sb.append(i);
        }

        long finSB = System.currentTimeMillis();
        System.out.println("StringBuilder - Temps écoulé en millisecondes : " + (finSB - debutSB));

        // 2) Concaténation avec String et l'opérateur +
        long debutString = System.currentTimeMillis();

        String chaine = "";
        for (int i = 1; i <= 100_000; i++) {
            chaine += i;
        }

        long finString = System.currentTimeMillis();
        System.out.println("String (opérateur +) - Temps écoulé en millisecondes : " + (finString - debutString));
    }
}
// oui, il y a une diff de 800x en vitesse, le string + est super lent