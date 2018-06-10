package main.java.pl.pwlctk.kurs05.hometasks.queue4_1;

public class LIFOQueue extends Queue {
    public LIFOQueue(int capacity) {
        super(capacity);
    }

    @Override
    public void push(int number) {
        if (size == capacity) {
            System.out.println("Stos jest pełny!");
        } else {
            numbers[size] = number;
            size++;
        }
    }

    @Override
    public int pop() {
        if (size > 0) {
            return numbers[--size];
        } else {
            System.out.println("Stos jest pusty!");
            return -1;
        }
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        int counter = 0;
        while (counter != size) {
            list.append(numbers[counter++]).append(" ");
        }
        return list.toString();
    }
}