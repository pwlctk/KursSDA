package main.java.pl.pwlctk.kurs07.hometasks.movefiles;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.util.Map;

public class MoveRequest implements Request {
    @Override
    public void handleRequest(Map data, String folderPath) {
        for (var file : data.keySet()) { //Zamiast Object dałem var z Javy 10, podobno na lokalnych zmiennych można.
            Path moveFrom = FileSystems.getDefault().getPath(folderPath + file);
            Path target = FileSystems.getDefault().getPath(data.get(file).toString() + file);
            try {
                Files.move(moveFrom, target, StandardCopyOption.REPLACE_EXISTING);
            } catch (IOException e) {
                System.out.println("Nie udało się przenieść plików: " + e.getMessage());
            }
        }
    }
}
