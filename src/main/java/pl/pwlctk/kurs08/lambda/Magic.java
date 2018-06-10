package main.java.pl.pwlctk.kurs08.lambda;

import java.util.List;

public class Magic {

    public static void main(String[] args) {
        List<Integer> myList = List.of(1, 3, 4, 10, 9, 13, 6);

        System.out.println("Tradycyjnie: ");
        for (Integer aMyList : myList) {
            if (aMyList % 2 != 0)
                System.out.println(aMyList * 100);

        }
        System.out.println("\nStream: ");
        myList.stream()
                .filter(num -> num % 2 != 0)
                .map(num -> num * 100)
                .forEach(System.out::println);
    }
}

/*

Mając listę liczb, wypisz w konsoli liczby nieparzyste pomnożone przez 100 List<Integer> num= Arrays.asList(1, 3, 4, 10, 9, 13, 6);

 */