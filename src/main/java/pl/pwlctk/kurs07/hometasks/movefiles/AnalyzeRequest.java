package main.java.pl.pwlctk.kurs07.hometasks.movefiles;

import java.util.Map;

public class AnalyzeRequest implements Request {

    @Override
    public void handleRequest(Map data, String folderPath) {
        for (var file : data.keySet()) { //Zamiast Object dałem var z Javy 10, podobno na lokalnych zmiennych można.
            System.out.println("Plik: " + folderPath + file + " zostanie przeniesiony do: " + data.get(file));
        }
    }
}

/*
Napisz implementację interfejsu `AnalyzeRequest` w której metoda `handleRequest` będzie iterowała
po całej mapie i wypisywała na ekran: Plik {klucz} zostanie przeniesiony do {wartość}
 */