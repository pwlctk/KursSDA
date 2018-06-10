package main.java.pl.pwlctk.kurs07.hometasks.movefiles;

import java.util.Map;

public interface Request {

    void handleRequest(Map data, String folderPath);
}
