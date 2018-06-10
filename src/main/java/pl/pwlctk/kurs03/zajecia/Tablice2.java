package pl.pwlctk.kurs03.zajecia;

import java.util.Scanner;

public class Tablice2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę elementów: ");
        var tabLength = in.nextInt();
        var tab = new int[tabLength];

        for (var i = 0; i < tab.length; i++) {
            tab[i] = i;
        }

        for (var n : tab) {
            System.out.println(n);
        }
    }
}
