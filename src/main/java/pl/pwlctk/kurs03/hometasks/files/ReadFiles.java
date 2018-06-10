package main.java.pl.pwlctk.kurs03.hometasks.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ReadFiles {
    public static void main(String[] args) {
        System.out.println("Odczyt pliku z użyciem listy oraz Files.readAllLines():");
        System.out.println(readLineByLine());

        System.out.println("\nOdczyt pliku z wykorzystaniem strumienia:");
        readFileToStream();

        System.out.println("\nOdczyt pliku z użyciem zwykłego Stringa oraz metody Files.readAllBytes:");
        System.out.println(readFileToString());
    }

    //odczyt pliku do Stringa
    private static String readFileToString() {
        String content = "";
        try {
            String path = "src\\main\\resources\\Inwokacja.txt";
            content = new String(Files.readAllBytes(Paths.get(path)));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    //odczyt z pliku i zapis do Stream
    private static void readFileToStream() {
        try {
            String path = "src\\main\\resources\\Inwokacja.txt";
            Stream stream = Files.lines(Paths.get(path));
            //nie wiem jak to dokładnie dziala, ale wypisuje na ekran :)
            stream.forEach(System.out::println);
            stream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //Odczyt z pliku linia po linii, wczytanie do listy i pozniej zapis w Stringu
    private static String readLineByLine() {
        List list = new ArrayList();
        StringBuilder content = new StringBuilder();
        String path = "src\\main\\resources\\Inwokacja.txt";
        try {
            list = Files.readAllLines(Paths.get(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Object line : list) {
            content.append(line).append("\n");
        }
        return content.toString();
    }
}