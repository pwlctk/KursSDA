package main.java.pl.pwlctk.kurs02.zajecia;

public class Warunki {

    public static void main(String[] args) {
        System.out.println("a. 2 > 3\n" +
                "b. 4 < 5\n" +
                "c. (2 -2) == 0\n" +
                "d. true\n" +
                "e. 9%2 == 0\n" +
                "f. 9%3 == 0\n");

        boolean a = 2 > 3;
        boolean b = 4 < 5;
        boolean c = (2 - 2) == 0;
        boolean d = true;
        boolean e = 9 % 2 == 0;
        boolean f = 9 % 3 == 0;


        boolean isAlaMaKota = 3 > 3 && 3 < 3;
        if (isAlaMaKota)
            System.out.println("haha");

        if (a) {
            System.out.println("a. Ok");
        } else {
            System.out.println("a. Błąd");
        }

        if (b) {
            System.out.println("b. Ok");
        } else {
            System.out.println("b. Błąd");
        }

        if (c) {
            System.out.println("c. Ok");
        } else {
            System.out.println("c. Błąd");
        }

        if (d) {
            System.out.println("d. Ok");
        } else {
            System.out.println("d. Błąd");
        }

        if (e) {
            System.out.println("e. Ok");
        } else {
            System.out.println("e. Błąd");
        }

        if (f) {
            System.out.println("f. Ok");
        } else {
            System.out.println("f. Błąd");
        }

        System.out.println();

        choice();


    }

    private static void choice() {
        int switchChoice = 1;
        switch (switchChoice) {
            case 1:
                System.out.println("Wybór 1");
                break;

            case 2:
                System.out.println("Wybór 2");
                System.out.println("Lalalala");
                break;

            default:
                System.out.println("Przypadek nietypowy");
                break;


        }
    }
}

