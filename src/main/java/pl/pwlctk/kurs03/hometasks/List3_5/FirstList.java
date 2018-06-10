package main.java.pl.pwlctk.kurs03.hometasks.List3_5;

public class FirstList extends List {
    public FirstList(int capacity) {
        super(capacity);
    }

    public void add(int number) {
        if (size == capacity) {
            enlarge();
        }

        for (int i = size; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = number;
        size++;
    }
}
