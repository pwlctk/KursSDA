package main.java.pl.pwlctk.kurs07.hometasks.movefiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

class FolderMover {
    private String folderPath;
    private String filePath;
    private Request request;

    FolderMover(String folderPath, String filePath, Request request) {
        this.folderPath = folderPath;
        this.filePath = filePath;
        this.request = request;
    }

    void moveToFolders() throws DirectoryOrFileNotExist, FileNotFoundException {
        Map<String, String> data = readData();
        List badFolders = validateDirectories(data);
        List badFiles = validateFiles(data);
        boolean isFoldersOk = badFolders.isEmpty();
        boolean isFilesOk = badFiles.isEmpty();
        if (isFoldersOk && isFilesOk) {
            request.handleRequest(data, folderPath);
        } else if (!isFoldersOk && !isFilesOk) {
            throw new DirectoryOrFileNotExist("\nFoldery: " + badFolders.toString() + "\nPliki: " + badFiles.toString());
        } else if (!isFoldersOk) {
            throw new DirectoryOrFileNotExist("\nFoldery: " + badFolders.toString());
        } else {
            throw new DirectoryOrFileNotExist("\nPliki: " + badFiles.toString());
        }
    }

    private Map<String, String> readData() throws FileNotFoundException {
        File file = new File(filePath);
        Scanner scanner = new Scanner(file);
        Map<String, String> data = new HashMap<>();
        String[] values;
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            values = line.split(";");
            data.put(values[0], values[1]);
        }
        scanner.close();
        return data;
    }

    private List validateDirectories(Map<String, String> data) {
        List<String> foldersList = new LinkedList<>();
        for (String folder : data.values()) {
            Path path = Paths.get(folder);
            if (!Files.exists(path)) {
                foldersList.add(folder);
            }
        }
        return foldersList;
    }

    private List validateFiles(Map<String, String> data) {
        List<String> filesList = new LinkedList<>();
        for (String file : data.keySet()) {
            Path path = Paths.get(folderPath + file);
            if (!Files.exists(path)) {
                filesList.add(path.toString());
            }
        }
        return filesList;
    }
}
