package pl.pwlctk.kurs02.zadaniaDomowe;

import java.util.Scanner;

public class NajwiekszyWspolnyDzielnik {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Podaj liczbę a: ");
        int a = in.nextInt();
        System.out.print("Podaj liczbę b: ");
        int b = in.nextInt();

        int nwd = getNwd(a, b);
        System.out.println("Największy wspólny dzielnik liczb: " + a + " oraz " + b + " wynosi: " + nwd);
    }

    private static int getNwd(int a, int b) {
        int nwd = 0;
        for (int i = 1; i <= a; i++) {
            if (a % i == 0 && b % i == 0) {
                nwd = i;
            }
        }
        return nwd;
    }
}
