package main.java.pl.pwlctk.kurs08.lambda;

import java.util.List;

public class MagicLambda {
    public static void main(String[] args) {
        List<String> myList = List.of("ala", "samochód", "kot", "aleksandra", "pies", "azor");

        myList.stream()
                .filter(w -> w.startsWith("a"))
                .map(w -> w.substring(0, 1).toUpperCase() + w.substring(1))
                .forEach(System.out::println);
    }
}


/*
Na podstawie listy słów, wypisz w konsoli wszystkie wyrazy zaczynają się literą „a”, wartości powinny posiadać dużą,
pierwszą literę List<String> txt = Arrays.asList(„ala", „samochód", „kot”, „aleksandra", „pies", „azor" );
*/