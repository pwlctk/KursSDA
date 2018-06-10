package main.java.pl.pwlctk.kurs03.hometasks.circle3_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj promień koła: ");
        int radius = scanner.nextInt();

        Circle circle = new Circle(radius);
        System.out.println("Pole koła o promieniu: " + radius + " wynosi: " + circle.area());
        System.out.println("Obwód koła o promieniu: " + radius + " wynosi: " + circle.perimeter());
    }
}
