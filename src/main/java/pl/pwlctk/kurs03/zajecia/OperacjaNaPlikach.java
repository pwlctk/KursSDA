package pl.pwlctk.kurs03.zajecia;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class OperacjaNaPlikach {

    public static void main(String[] args) throws IOException {
        File file = new File("c:\\!Moje\\Bzdurki\\Inwokacja.txt");
        Scanner scanner = new Scanner(file, "UTF-8");

        System.out.println("\nInwokacja:");
        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }
        Path path = Paths.get("c:\\!Moje\\Bzdurki\\Plik.txt");
        Files.readAllLines(path);


    }

}
