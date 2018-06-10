package pl.pwlctk.kurs02.zadaniaDomowe;

import java.math.BigInteger;
import java.util.Random;
import java.util.Scanner;

public class PrimeNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę (większą od 1): ");

        long number;
        do {
            number = in.nextLong();
            if (number < 2) {
                System.out.print("Niepoprawna liczba!\n" +
                        "Podaj liczbę (większą od 1): ");
            }
        } while (number < 2);

        System.out.println("Metoda standardowa:");
        if (isPrimeNumber(number)) {
            System.out.println("Podana liczba: " + number + " jest liczbą pierwszą!");
        } else {
            System.out.println("Podana liczba: " + number + " nie jest liczbą pierwszą!");
        }

        System.out.println();
        System.out.println("Metoda z BigInteger:");
        if (isPrimeNumberBigInteger((int) number)) {
            System.out.println("Podana liczba: " + number + " jest liczbą pierwszą!");
        } else {
            System.out.println("Podana liczba: " + number + " nie jest liczbą pierwszą!");
        }

        Random rnd = new Random(1000);
        BigInteger prime = new BigInteger(50, 100, rnd);
        System.out.println(prime);

    }

    private static boolean isPrimeNumber(long number) {
        boolean isPrimeNumber = true;
        for (int i = 2; i < (number / 2) + 1; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
            }
        }
        return isPrimeNumber;
    }
//certainty - dokładność!
    private static boolean isPrimeNumberBigInteger(int certainty) {
        BigInteger prime = new BigInteger(("423423"));
        prime.isProbablePrime(100);
        return true;
    }
}
