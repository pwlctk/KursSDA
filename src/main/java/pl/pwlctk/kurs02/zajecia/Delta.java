package main.java.pl.pwlctk.kurs02.zajecia;

import java.util.Scanner;

public class Delta {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Podaj a: ");
        int a = in.nextInt();
        System.out.print("Podaj b: ");
        int b = in.nextInt();
        System.out.print("Podaj c: ");
        int c = in.nextInt();

        if (a == 0) {
            System.out.println("To nie jest równanie kwadratowe: a = " + a);
        } else {
            System.out.println("Równanie ma postać: " + a + "x^2 + (" + b + ")x + " + "(" + c + ")");
            double delta = Math.pow(b, 2) - 4 * (a * c);
            System.out.println("\nDelta = " + delta);
            if (delta < 0) {
                System.out.println("Delta mniejsza od 0. \nRównanie nie ma rozwiązań.");
            } else if (delta == 0) {
                double score = (-1 * b) / (2 * a);
                System.out.println("x = " + score);

            } else if (delta > 0) {
                double score;
                score = ((-1 * b) - Math.sqrt(delta)) / (2 * a);
                System.out.println("x1 = " + score);
                score = ((-1 * b) + Math.sqrt(delta)) / (2 * a);
                System.out.println("x2 = " + score);

            }
        }
    }

}


