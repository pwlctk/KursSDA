package main.java.pl.pwlctk.kurs03.hometasks.files;

import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;

public class WriteFiles {
    public static void main(String[] args) {
        String invocation = "Litwo! Ojczyzno moja! Ty jesteś jak zdrowie,\n" +
                "Ile cię trzeba cenić, ten tylko się dowie,\n" +
                "Kto cię stracił. Dziś piękność twą w całej ozdobie\n" +
                "Widzę i opisuję, bo tęsknię po tobie\n" +
                "Panno święta, co Jasnej bronisz Częstochowy\n" +
                "I w Ostrej świecisz Bramie! Ty, co gród zamkowy\n" +
                "Nowogródzki ochraniasz z jego wiernym ludem!\n" +
                "Jak mnie dziecko do zdrowia powróciłaś cudem,\n" +
                "(Gdy od płaczącej matki pod Twoją opiekę\n" +
                "Ofiarowany, martwą podniosłem powiekę\n" +
                "I zaraz mogłem pieszo do Twych świątyń progu\n" +
                "Iść za wrócone życie podziękować Bogu),\n" +
                "Tak nas powrócisz cudem na Ojczyzny łono.\n" +
                "Tymczasem przenoś moją duszę utęsknioną\n" +
                "Do tych pagórków leśnych, do tych łąk zielonych,\n" +
                "Szeroko nad błękitnym Niemnem rozciągnionych;\n" +
                "Do tych pól malowanych zbożem rozmaitem,\n" +
                "Wyzłacanych pszenicą, posrebrzanych żytem;\n" +
                "Gdzie bursztynowy świerzop, gryka jak śnieg biała,\n" +
                "Gdzie panieńskim rumieńcem dzięcielina pała,\n" +
                "A wszystko przepasane jakby wstęgą, miedzą\n" +
                "Zieloną, na niej z rzadka ciche grusze siedzą.";

        System.out.println("Zapis pliku przy użyciu metody Files.write().");
        writeFileUsingFilesWrite(invocation);

        System.out.println("Zapis pliku przy użyciu BufferedWriter");
        writeFileUsingBufferedWriter(invocation);
    }

    private static void writeFileUsingBufferedWriter(String invocation) {
        try {
            String path = "src\\main\\resources\\InwokacjaBufferedWriter.txt";
            BufferedWriter writer = Files.newBufferedWriter(Paths.get(path));
            writer.write(invocation);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void writeFileUsingFilesWrite(String invocation) {

        try {
            String path = "src\\main\\resources\\InwokacjaFilesWrite.txt";
            Files.write(Paths.get(path), invocation.getBytes(), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
