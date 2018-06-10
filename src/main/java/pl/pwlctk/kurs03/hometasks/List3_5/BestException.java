package main.java.pl.pwlctk.kurs03.hometasks.List3_5;

public class BestException extends Exception {

    public BestException(String message) {
        super("Tajna wiadomość z najlepszego wyjątku: " + message);
    }


}
