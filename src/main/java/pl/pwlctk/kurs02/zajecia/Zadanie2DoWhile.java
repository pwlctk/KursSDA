package pl.pwlctk.kurs02.zajecia;

import java.util.Scanner;

public class Zadanie2DoWhile {
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);

        int number;
        do {
            System.out.println("Podaj liczbę: ");
            number = in.nextInt();

        } while (number < 0);
        System.out.println("Pierwiastek z liczby " + number + " = " + Math.sqrt(number));


    }
}

