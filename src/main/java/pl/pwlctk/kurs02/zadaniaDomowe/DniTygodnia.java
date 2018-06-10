package pl.pwlctk.kurs02.zadaniaDomowe;

import java.util.Scanner;

public class DniTygodnia {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Podaj liczbę dnia tygodnia: ");
        int day = in.nextInt();

        dayOfTheWeek(day);
    }

    private static void dayOfTheWeek(int day) {
        String monday = "Poniedziałek";
        String tuesday = "Wtorek";
        String wednesday = "Środa";
        String thursday = "Czwartek";
        String friday = "Piątek";
        String saturday = "Sobota";
        String sunday = "Niedziela";

        if (day == 1 || day % 7 == 1) {
            System.out.println(monday);
        } else if (day == 2 || day % 7 == 2) {
            System.out.println(tuesday);
        } else if (day == 3 || day % 7 == 3) {
            System.out.println(wednesday);
        } else if (day == 4 || day % 7 == 4) {
            System.out.println(thursday);
        } else if (day == 5 || day % 7 == 5) {
            System.out.println(friday);
        } else if (day == 6 || day % 7 == 6) {
            System.out.println(saturday);
        } else if (day == 7 || day % 7 == 0) {
            System.out.println(sunday);
        }
    }
}

/*
Napisz program, który pobierze od użytkownika liczbę całkowitą od 1 do 7 wyświetli odpowiedni dzień tygodnie (1 - poniedziałek...).

P.S. jeśli liczba będzie większa od 7 wypisze kolejny dzień tygodnia:
8 - poniedziałek
9 - wtorek
...
15 - poniedziałek
*/