package main.java.pl.pwlctk.kurs07.hometasks.movefiles;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        String folderPath = "src\\main\\resources\\files\\";
        String filePath = "src\\main\\resources\\dane.txt";
        Request request = new MoveRequest();
        FolderMover mover = new FolderMover(folderPath, filePath, request);
        try {
            mover.moveToFolders();
        } catch (DirectoryOrFileNotExist pathError) {
            System.out.println(pathError.getMessage());
        } catch (FileNotFoundException configError) {
            System.out.println("Nie udało się wczytać pliku z danymi: " + configError.getMessage());
        }
    }
}
