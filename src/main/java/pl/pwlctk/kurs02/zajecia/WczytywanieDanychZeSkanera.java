package main.java.pl.pwlctk.kurs02.zajecia;

import java.util.Locale;
import java.util.Scanner;

public class WczytywanieDanychZeSkanera {
    public static void main(String[] args) {
        numericalTask();
    }

    private static void numericalTask() {
        Scanner input = new Scanner(System.in);

        //Locale aby zamiast kropki używać przecinka
        input.useLocale(new Locale("pl", "PL"));
        printIt("Podaj pierwszą liczbę: ");
        double num1 = input.nextDouble();
        printIt("Podaj drugą liczbę: ");
        double num2 = input.nextDouble();

        printItLn("\nWyniki operacji:");
        printItLn("Dodawania: " + (num1 + num2));
        printItLn("Odejmowania: " + (num1 - num2));
        printItLn("Mnożenia: " + (num1 * num2));
        printItLn("Dzielenia: " + (num1 / num2));

    }

    private static void printIt(String s) {
        System.out.print(s);
    }

    private static void printItLn(String s) {
        System.out.println(s);
    }
}
/*

Utwórz dwie zmienne typu double.
Następnie przy użyciu klasy Scanner pobierz od użytkownika dwie liczby i wykonaj na nich dodawanie,
odejmowanie, mnożenie i dzielenie, wyświetlając wyniki w kolejnych liniach na konsoli.

 */