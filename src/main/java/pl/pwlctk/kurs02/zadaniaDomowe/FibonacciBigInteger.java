package main.java.pl.pwlctk.kurs02.zadaniaDomowe;

import java.math.BigInteger;
import java.util.Scanner;

public class FibonacciBigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj wyraz ciągu Fibonacciego: ");
        long fn = in.nextLong();

        System.out.println("Ciąg Fibonacciego o F(" + fn + ") liczbie elementów wygląda następująco: ");
        fibonacciShowAll(fn);
        System.out.println("\n" + fn + " wyraz ciągu Fibonacciego wynosi: " + fibonacci(fn));
    }

    private static void fibonacciShowAll(long fn) {
        BigInteger f1 = BigInteger.ZERO;
        BigInteger f2 = BigInteger.ONE;
        BigInteger score;
        if (fn == 0) {
            System.out.println("0");
        } else if (fn == 1) {
            System.out.println("0 1");
        } else {
            System.out.print("0 1 ");
            for (int i = 1; i < fn; i++) {
                score = f1.add(f2);
                f1 = f2;
                f2 = score;
                System.out.print(score + " ");
            }
            System.out.println();
        }
    }

    private static BigInteger fibonacci(long fn) {
        if (fn == 1) {
            return BigInteger.ONE;
        } else {
            BigInteger f1 = BigInteger.ZERO;
            BigInteger f2 = BigInteger.ONE;
            BigInteger score = BigInteger.ZERO;
            for (int i = 1; i < fn; i++) {
                score = f1.add(f2);
                f1 = f2;
                f2 = score;
            }
            return score;
        }
    }
}
