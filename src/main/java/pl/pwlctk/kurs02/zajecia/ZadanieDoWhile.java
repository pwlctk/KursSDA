package main.java.pl.pwlctk.kurs02.zajecia;

import java.util.Scanner;

public class ZadanieDoWhile {
    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);

        int number;
        do {
            System.out.println("Podaj liczbę: ");
            number = in.nextInt();

        } while (number < 0);

        for (int i = 0; i < number; i++) {
            //Thread.sleep(10);
            if (i % 5 == 0)
                System.out.println();
            System.out.print("Hello World ");

        }
    }
}
