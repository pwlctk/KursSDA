package pl.pwlctk.kurs02.zadaniaDomowe;

import java.util.Scanner;

public class ThePiramid {
    public static void main(String[] args) {
        final int MAX_FLOORS = 1000;
        Scanner in = new Scanner(System.in);
        int floors;
        do {
            System.out.print("Podaj ilość pięter: (max " + MAX_FLOORS + "): ");
            floors = in.nextInt();
            if (floors < 1 || floors > MAX_FLOORS) {
                System.out.println("Podano nieprawidłową liczbę!");
            }
        } while (floors < 1 || floors > MAX_FLOORS);
        drawPiramid(floors);
    }

    private static void drawPiramid(int floors) {
        StringBuilder stars = new StringBuilder("*");
        for (int i = 0; i < floors; i++) {
            System.out.format("%" + (floors + i) + "s", stars);
            stars.append("**");
            System.out.println();
        }
    }
}
