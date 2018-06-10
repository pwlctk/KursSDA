package main.java.pl.pwlctk.kurs06.course.kolekcje;

import java.util.HashSet;
import java.util.Set;

public class Secik {

    public static void main(String[] args) {
        Set<Integer> secik = new HashSet<>();

        secik.add(1);
        secik.add(2);
        secik.add(3);
        secik.add(4);
        int number = 5;
        int number2 = 4;

        if (secik.add(number)) {
            System.out.println("Dodano obiekt: " + number);
        } else {
            System.out.println("Set już zawiera obiekt: " + number);
        }

        String status = secik.add(number2) ? "Obiekt dodano" : "Obiekt już istnieje";
        System.out.println(status);

        System.out.println("Set: ");
        for (Object o: secik){
            System.out.print(o +" ");
        }

    }
}
