package main.java.pl.pwlctk.kurs08.generic;

import java.util.*;

public class GenericCollection {

    public static void main(String[] args) {
        List<String> subtitles = new ArrayList<>();
        subtitles.add("Abc");
        subtitles.add("Xyz");
        subtitles.add("Uio");
        subtitles.add("Abc");

        Map<String, Integer> map = new HashMap<>();

        for (String word : subtitles) {
            int counter = map.getOrDefault(word, 0); //zwróci to co jest pod danym kluczem, a jak nie ma takiego klucza to będzie default czyli 0
            map.put(word, ++counter); //wrzuci do mapy slowo, zwiekszy o 1 counter. Jeżeli bedzie już takie słowo, to counter będzie mieć 1 i po zwiększeniu bedzie 2 itd...
        }

        //slabe wydajnościowo, mapa jest przeszukiwana dwa razy
        System.out.println("Iteracja zwykła: ");
        for (String key : map.keySet()) {
            System.out.println(key + ", " + map.get(key));
        }

        //lepsze od tego wyżej bo tylko raz jest przeszukiwana mapa
        //Map.Entry pobiera nam zbiór całej mapy (jeden element zbioru to klucz + wartość)
        System.out.println("\nIteracja Map.Entry: ");

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
        //Java 8 i programowanie funkcyjne
        System.out.println("\nIteracja Lambda: ");
        map.forEach((key, value) -> System.out.println(key + ", " + value));


        //zamieniamy klucze z wartościami
        Map<Integer, String> map2 = new HashMap<>();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String newKey = entry.getKey();
            if (map2.containsKey(entry.getValue())) {
                newKey = newKey + ", " + map2.get(entry.getValue());
                map2.put(entry.getValue(), newKey);
            } else {
                map2.put(entry.getValue(), entry.getKey());
            }
        }

        System.out.println("\nMapa odwrócona: ");
        for (Map.Entry<Integer, String> entry : map2.entrySet()) {
            System.out.println(entry.getKey() + ", " + entry.getValue());
        }
    }
}


/*
    List
    "Abc",
    "Xyz",
    "Uio",
    "Abc"

    Map
    "Abc", 2
    "Xyz", 1
    "Uio", 1
 */