package main.java.pl.pwlctk.kurs03.hometasks.Arrange3_4;

public class Arrange {
    private String text;

    public Arrange(String text) {
        this.text = text;
    }

    public String order(int[] order) {
        StringBuilder newText = new StringBuilder();
        for (int anOrder : order) {
            newText.append(text.charAt(anOrder));
        }
        return newText.toString();
    }
}


/*
Napisz klasę Arrange, która będzie przechowywała napisz : String text podawany w konstruktorze oraz będzie miała metodę:
public String order(int[] order)Metoda powinna zwrócić String ułożony wg kolejności przekazanych w parametrze np:
String text = „Egzamin”;
int[] order = {0, 1, 4, 3, 2, 6, 5}
Jako wynik metoda powinna zwrócić Egmazni (edited)
 */