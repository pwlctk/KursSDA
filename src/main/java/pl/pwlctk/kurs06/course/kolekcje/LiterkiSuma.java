package main.java.pl.pwlctk.kurs06.course.kolekcje;

import java.util.Map;
import java.util.TreeMap;

public class LiterkiSuma {
    public static void main(String[] args) {
        System.out.println("Liczenie liter!\n");
        String word = "Ala ma kota, a kot to idiota";
        Map<Character, Integer> mapka = new TreeMap<>();
        Map<Character, Integer> mapka1 = new TreeMap<>();

        //usuwamy ze Stringa przecinki i spacje i zmieniamy na małe literki
        word = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

        System.out.println("Zdanie bez spacji i znaków: " + word);

        System.out.println("Sposób pierwszy:");
        int count;
        for (int i = 0; i < word.length(); i++) {
            if (mapka.containsKey(word.charAt(i))) {
                count = mapka.get(word.charAt(i));
                mapka.put(word.charAt(i), ++count);
            } else {
                mapka.put(word.charAt(i), 1);
            }
        }
        System.out.println(mapka);

        //lepsiejszy sposób
        System.out.println("\nSposób drugi: ");
        for (int i = 0; i < word.length(); i++) {
            char litera = word.charAt(i);
            int counter = mapka1.getOrDefault(litera, 0);
            mapka1.put(litera, ++counter);
        }
        System.out.println(mapka1);

    }


}
