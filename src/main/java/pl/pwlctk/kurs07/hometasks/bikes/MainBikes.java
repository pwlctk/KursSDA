package main.java.pl.pwlctk.kurs07.hometasks.bikes;

public class MainBikes {
    public static void main(String[] args) {
        Bike gorski = new MountainBike(7, "Trek");
        Bike wigry = new WigryBike("składak Wigry");

        Cyclist crazyRoman = new Cyclist(gorski, "Szalony Roman");
        Cyclist bob = new Cyclist(wigry, "Stary Bob");
        Cyclist drunkAndrzej = new Cyclist();

        System.out.println("Rowery: ");
        System.out.println(gorski);
        System.out.println(wigry);
        System.out.println("\nRowerzyści: ");
        System.out.println(drunkAndrzej);
        System.out.println(bob);
        System.out.println(crazyRoman);

        System.out.println("\nPrzegląd biegów w rowerach:");
        try {
            if (gorski.changeGear(6)) {
                System.out.println("Zmiana biegu się udała.");
            } else {
                System.out.println("Zmiana biegu nie wyszła!");
            }
        } catch (UnsupportedOperationException mistake) {
            System.out.println("Ten rower nawet nie ma takiej przerzutki!");
        }
        System.out.println("\nJazda próbna: ");
        System.out.println("Jedzie: " + crazyRoman);
        try {
            crazyRoman.gearDown();
            crazyRoman.gearDown(3);
            crazyRoman.gearDown();
            crazyRoman.gearDown();
            crazyRoman.gearDown();
            crazyRoman.gearDown();
            crazyRoman.gearDown();
        } catch (UnsupportedOperationException accident) {
            System.out.println(accident.getMessage());
        }
        System.out.println("\nPo naprawie:");
        try {
            crazyRoman.gearUp();
            crazyRoman.gearUp();
            crazyRoman.gearUp();
            crazyRoman.gearUp();
            crazyRoman.gearDown();
            crazyRoman.gearUp();
            crazyRoman.gearUp();
            crazyRoman.gearUp(2);
            crazyRoman.gearUp();
            crazyRoman.gearUp();
        } catch (UnsupportedOperationException accident) {
            System.out.println(accident.getMessage());
        }
        System.out.println("\nDrugi zawodnik:");
        bob.gearDown();
        bob.gearUp();
    }
}
