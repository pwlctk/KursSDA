package pl.pwlctk.kurs02.zadaniaDomowe;

import java.io.IOException;
import java.math.BigInteger;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

public class SilniaBigInteger {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Program POLICZ SILNIE Z MILIONA!!!\n");
        int number;
        do {
            System.out.print("Podaj liczbę dodatnią: ");
            number = in.nextInt();
        } while (number < 0);

        System.out.println("Trwa obliczanie silni...");
        String factorial = factorial(number);

        System.out.println("Silnia liczby " + number + " wynosi: " + factorial);

        //zapis do pliku
        writeToFile(number, factorial);
    }

    private static void writeToFile(int factorialNumber, String factorial) {
        System.out.println("Trwa zapisywanie do pliku...");
        Path path = Paths.get("src\\main\\resources\\Silnia(" + factorialNumber + ").txt");
        try {
            Files.write(path, factorial.getBytes(), StandardOpenOption.CREATE);
            System.out.println("Zapisano!");
        } catch (IOException e) {
            System.err.println("Błąd zapisu!");
            e.printStackTrace();
        }
    }

    private static String factorial(int n) {
        if (n == 0)
            return "1";
        else {
            BigInteger factorial = BigInteger.ONE;
            while (n > 0) {
                factorial = factorial.multiply(BigInteger.valueOf(n));
                n--;
            }
            return factorial.toString();
        }
    }
}

/*
Napisz program obliczający silnię z wykorzystaniem pętli (do wyboru) oraz klasy BigInteger co pozwoli na liczenie bardzo dużych wartości. Np. 150!
 */