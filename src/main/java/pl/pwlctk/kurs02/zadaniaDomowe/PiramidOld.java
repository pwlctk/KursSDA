package pl.pwlctk.kurs02.zadaniaDomowe;

import java.time.Instant;
import java.util.Scanner;

public class PiramidOld {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int floors;
        final int MAX_FLOORS = 1000;
        do {
            System.out.print("Podaj ilość pięter piramidy (max " + MAX_FLOORS + "): ");
            floors = in.nextInt();
            if (floors < 1 || floors > MAX_FLOORS) {
                System.out.println("Nieprawidłowa liczba!");
            }
        } while (floors < 1 || floors > MAX_FLOORS);

        Long startTime = Instant.now().toEpochMilli();
        if (floors < 10) {
            drawPiramidDigit(floors);
        } else {
            drawPiramidVersion3(floors);

        }
        Long endTime = Instant.now().toEpochMilli();

        System.out.println("Czas budowania piramidy: " + (endTime - startTime) + "ms");
    }


    private static void drawPiramidVersion1(int floors) {
        StringBuilder stars = new StringBuilder("*");
        for (int i = 0; i < floors; i++) {
            System.out.format("%" + (floors - i) + "s" + "%s", " ", stars);
            stars.append("**");
            System.out.println();
        }
    }

    private static void drawPiramidVersion3(int floors) {
        StringBuilder stars = new StringBuilder("*");
        for (int i = 0; i < floors; i++) {
            System.out.format("%" + (floors + i) + "s", stars);
            stars.append("**");
            System.out.println();
        }
    }

    private static void drawPiramidVersion2(int floors) {
        StringBuilder starsL = new StringBuilder("*");
        StringBuilder starsR = new StringBuilder("");
        for (int i = 0; i < floors; i++) {
            System.out.format("%" + floors + "s", starsL);
            System.out.format("%-" + (floors - 1) + "s", starsR);
            starsL.append("*");
            starsR.append("*");
            System.out.println();
        }
    }


    private static void drawPiramidDigit(int floors) {
        for (int i = 1; i <= floors; i++) {
            System.out.format("%" + (floors - i + 1) + "s", " ");
            for (int j = 0; j < (i * 2 - 1); j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
