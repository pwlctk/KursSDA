package main.java.pl.pwlctk.kurs03.hometasks.fibonacci3_1;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Writer {
    private String content;
    private String path;
    private String filename;

    public Writer(String content) {
        this.content = content;
        this.filename = "file.txt";
        this.path = "src\\main\\resources\\";
    }

    public Writer(String content, String filename) {
        this.content = content;
        this.filename = filename;
        this.path = "src\\main\\resources\\";
    }

    public Writer(String content, String filename, String path) {
        this.content = content;
        this.filename = filename;
        this.path = path;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    public void writeToDisk() {
        try {
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(path + filename));
            writer.write(content);
            writer.close();
            System.out.println("Pomyślnie zapisano w pliku: " + path + filename);
        } catch (IOException e) {
            System.out.println("Nie udało się zapisać pliku!");
            e.printStackTrace();
        }
    }
}
