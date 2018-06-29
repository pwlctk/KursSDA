package main.java.pl.pwlctk.kurs02.zadaniaDomowe;

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

        String textNumber = String.valueOf(number);
        BigInteger BigNum = new BigInteger(textNumber);
        SilniaBigInteger program = new SilniaBigInteger();

        //liczenie metoda1
        long startTime = System.currentTimeMillis();
        //String factorial = program.factorial(number).toString();
        long endTime = System.currentTimeMillis();

        //liczenie metoda2
        long startTime1 = System.currentTimeMillis();
        String factorial1 = program.factorialNew(BigNum).toString();
        long endTime1 = System.currentTimeMillis();


        long duration1 = (endTime - startTime);
        long duration2 = (endTime1 - startTime1);
       // System.out.println("Silnia liczby " + number + " wynosi: " + factorial);
        System.out.println("Silnia liczby " + number + " wynosi: " + factorial1);
        System.out.println("Czas obliczeń tradycyjnie: " + duration1);
        System.out.println("Czas obliczeń BigInteger: " + duration2);


        //zapis do pliku
        //program.writeToFile(number, factorial);
    }

    private void writeToFile(int factorialNumber, String factorial) {
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

    private BigInteger factorial(int n) {
        BigInteger factorial = BigInteger.ONE;
        while (n > 0) {
            factorial = factorial.multiply(BigInteger.valueOf(n));
            n--;
        }
        return factorial;
    }

    public BigInteger factorialNew(BigInteger n) {
        BigInteger result = BigInteger.ONE;
        while (!n.equals(BigInteger.ZERO)) {
            result = result.multiply(n);
            n = n.subtract(BigInteger.ONE);
        }
        return result;
    }







}

//1. Czas liczenia silnii
//2. Zapis do pliku
//3. Informacje o ilości znaków