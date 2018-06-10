package pl.pwlctk.kurs02.zadaniaDomowe;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Fizz buzz!");
        System.out.println("Jak liczba jest podzielna przez 3 to FIZZ!");
        System.out.println("Jak liczba jest podzielna przez 5 to BUZZ");
        System.out.println("COMBO: jeśli liczba jest podzielna przez 3 i 5 mamy FIZZ BUZZ!");
        System.out.print("\nPodaj liczbę: ");
        int fizzBuzzNumber = in.nextInt();
        byte fuzzBuzz = 0;

        if (fizzBuzz(fizzBuzzNumber).contains("(Fizz)")) {
            fuzzBuzz = 1;
        } else if (fizzBuzz(fizzBuzzNumber).contains("(Buzz)")) {
            fuzzBuzz = 2;
        } else if (fizzBuzz(fizzBuzzNumber).contains("(FizzBuzz!)")) {
            fuzzBuzz = 3;
        }
        System.out.println("Tak wyglądają wszystkie poprzednie liczby:");
        for (int i = 1; i <= fizzBuzzNumber; i++) {
            System.out.print(fizzBuzz(i) + " ");
        }

        System.out.println("\n");

        //Wyświetlenie wyników (po to te if'y i switch :)
        switch (fuzzBuzz) {
            case 1:
                System.out.println("Twoja liczba to " + fizzBuzzNumber + " i jest to FIZZ!");
                break;
            case 2:
                System.out.println("Twoja liczba to " + fizzBuzzNumber + " i jest to BUZZ!");
                break;
            case 3:
                System.out.println("Twoja liczba to " + fizzBuzzNumber + " i jest to FIZZ BUZZ!!!");
                break;
            default:
                System.out.println("Twoja liczba to " + fizzBuzzNumber + " i jest to tylko zwykła liczba :(");
                break;
        }
    }

    private static String fizzBuzz(int fizzBuzzNumber) {
        if (fizzBuzzNumber % 3 == 0 && fizzBuzzNumber % 5 != 0)
            return fizzBuzzNumber + "(Fizz)";
        else if (fizzBuzzNumber % 5 == 0 && fizzBuzzNumber % 3 != 0)
            return fizzBuzzNumber + "(Buzz)";
        else if (fizzBuzzNumber % 15 == 0)
            return fizzBuzzNumber + "(FizzBuzz!)";
        else {
            return String.valueOf(fizzBuzzNumber);
        }
    }
}


/*
fizz - 3
buzz - 5
fizz buzz 3 i 5
*/