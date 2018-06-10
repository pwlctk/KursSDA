package main.java.pl.pwlctk.kurs03.hometasks.List3_5;

public class LottoList extends List {
    public LottoList(int capacity) {
        super(capacity);
    }

    public void add(int number) {
        if (number > 0 && number < 50) {
            super.add(number);
        } else {
            System.out.println("Liczby: " + number + " nie dodano do listy.");
        }
    }
}
