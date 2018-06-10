package pl.pwlctk.kurs02.zadaniaDomowe;

import java.util.Scanner;

public class PiNumber {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program do liczenia liczby Pi");
        System.out.print("Podaj liczbę (im większa liczba tym większa dokładność): ");
        long number = in.nextLong();

        System.out.println("Liczba Pi w przyblizeniu to: " + getPi(number));
    }

    private static double getPi(long number) {
        boolean minus = false;
        double pi = 0;
        //zamiast sprawdzać czy -1 czy 1 to mozna pomnozyc przez -1

        for (int i = 1; i < number; i += 2) {
            if (minus) {
                pi -= (1.0 / i);
            } else {
                pi += (1.0 / i);
            }
            minus = !minus;
        }
        pi *= 4;
        return pi;
    }
}
