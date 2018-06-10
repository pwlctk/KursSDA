package pl.pwlctk.kurs02.zadaniaDomowe;

import java.util.Scanner;

public class FibonacciLong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj wyraz ciągu Fibonacciego: ");
        int fn = in.nextInt();

        System.out.println("Ciąg Fibonacciego o F(" + fn + ") liczbie elementów wygląda następująco: ");
        fibonacciShowAll(fn);
        System.out.println();
        System.out.println(fn + " wyraz ciągu Fibonacciego liczony iteracyjnie wynosi: " + fibonacci(fn));
        System.out.println(fn + " wyraz ciągu Fibonacciego liczony rekurencyjnie wynosi: " + fibonacciRecursion(fn));
        System.out.println(fn + " wyraz ciągu Fibonacciego liczony iteracyjnie przy użyciu tylko dwóch zmiennych wynosi: " + fibonacciTwoVariables(fn));
    }

    private static void fibonacciShowAll(int fn) {
        long f1 = 0;
        long f2 = 1;
        long score = 0;
        if (fn == 0) {
            System.out.println("0");
        } else if (fn == 1) {
            System.out.println("0 1");
        } else {
            System.out.print("0 1 ");
            for (int i = 1; i < fn; i++) {
                score = f1 + f2;
                f1 = f2;
                f2 = score;
                System.out.print(score + " ");
            }
            System.out.println();
        }
    }

    private static long fibonacci(int fn) {
        if (fn < 2)
            return fn;
         else {
            long f1 = 0;
            long f2 = 1;
            long score = 0;
            for (int i = 1; i < fn; i++) {
                score = f1 + f2;
                f1 = f2;
                f2 = score;
            }
            return score;
        }
    }

    private static long fibonacciRecursion(int fn) {
        if (fn < 2)
            return fn;
        else {
            return fibonacciRecursion(fn - 1) + fibonacciRecursion(fn - 2);
        }
    }

    private static long fibonacciTwoVariables(int fn) {
        if (fn < 2)
            return fn;
        else {
            long f1 = 0;
            long f2 = 1;
            for (int i = 2; i < fn; i++) {
                f2 = f2 + f1;
                f1 = f2 - f1;
            }
            return f2 + f1;
        }

    }
}
