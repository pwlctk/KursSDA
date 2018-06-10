package pl.pwlctk.kurs02.zadaniaDomowe;

import java.util.Scanner;

public class Piramida9Old {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int floors;
        do {
            System.out.println("Podaj ilość pięter piramidy (max 9): ");
            floors = in.nextInt();
        } while (floors < 1 || floors > 9);

        for (int i = 1; i <= floors; i++) {
            if (floors != i) {
                System.out.format("%" + (floors - i) + "s", " ");
            }

            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
