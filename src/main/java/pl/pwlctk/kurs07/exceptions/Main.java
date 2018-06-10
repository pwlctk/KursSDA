package main.java.pl.pwlctk.kurs07.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        //odczyt pliku w jednej linijce :)
        System.out.println(new String(Files.readAllBytes(Paths.get("src\\main\\resources\\Inwokacja.txt"))));
    }
}
