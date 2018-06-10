package main.java.pl.pwlctk.kurs07.hometasks.movefiles;

class DirectoryOrFileNotExist extends Exception {
    DirectoryOrFileNotExist(String message) {
        super("Błąd! Nie wszystkie foldery bądź pliki istnieją, brakuje:  " + message);
    }
}
