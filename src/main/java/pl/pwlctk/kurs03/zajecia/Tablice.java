package pl.pwlctk.kurs03.zajecia;

import java.util.Scanner;

public class Tablice {
    public static void main(String[] args) {
        var in = new Scanner(System.in);

        var names = new String[5];
        for (var i = 0; i < names.length; i++) {
            System.out.println("Podaj imię numer " + (i + 1) + ": ");
            names[i] = in.nextLine();
        }

        for (var n : names) {
            System.out.println("Witaj " + n);
        }
    }
}
