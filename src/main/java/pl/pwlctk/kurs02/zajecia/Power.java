package pl.pwlctk.kurs02.zajecia;

import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        long number = in.nextInt();
        System.out.print("Podaj potegę: ");
        int power = in.nextInt();

        System.out.println(number + " do potęgi " + power + " = " + power(number, power));

    }


    private static long power(long n, int m) {
        long score = 1;
        for (int i = 0; i < m; i++)
            score *= n;

        return score;
    }
}
