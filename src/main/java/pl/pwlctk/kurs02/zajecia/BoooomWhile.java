package pl.pwlctk.kurs02.zajecia;

import java.util.Scanner;

public class BoooomWhile {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("!!!PROGRAM AUTODESTRUKCJI!!!\n");
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = in.nextInt();

        System.out.println("Bomba wybuchnie za:");
        while (number > 0) {
            Thread.sleep(500);
            System.out.print(number + "... ");

            if (number == 1) {
                Thread.sleep(1000);
                System.err.println("\rBOOOOOM!!!!");
            }

            number--;
        }

    }
}





/*
Napisz program, który pobierze od użytkownika całkowitą liczbę dodatnią.
Następnie przy użyciu wyświetl na ekranie Odliczanie z tekstem "Bomba wybuchnie za ... "
gdzie w miejsce dwukropka mają się pojawić liczby od podanej przez użytkownika do 0. Napisz program przy użyciu pętli for.

 */