package main.java.pl.pwlctk.kurs07.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

class ReadFile {
    String readFileToString() throws IOException {
        return new String(Files.readAllBytes(Paths.get("src\\main\\resources\\Inwokacja11.txt")));
    }
}