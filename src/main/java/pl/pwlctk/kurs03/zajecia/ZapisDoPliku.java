package pl.pwlctk.kurs03.zajecia;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class ZapisDoPliku {
    public static void main(String[] args) throws IOException {

        PrintWriter writer = new PrintWriter(new FileWriter("c:\\!Moje\\Bzdurki\\Plik.txt", true));
        writer.write("Hello world!");
        writer.println(); //nowa linia
        writer.flush();
    }




}
