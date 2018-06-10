package pl.pwlctk.kurs02.zajecia;

import java.util.Scanner;

public class Dzielnik {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = in.nextInt();
        System.out.print("Podaj dzielnik: ");
        int divider = in.nextInt();

        for (int i = number; i >= 0; i--) {
            if (i % divider == 0) {
                System.out.print(i + " ");
            }


        }


    }
}
/*
Napisz program, który przyjmuje od użytkownika dzielnik oraz liczbę, a następnie
drukuje na ekranie wszystkie liczby mniejsze od zadanej liczby podzielne przez zadany dzielnik.

 */