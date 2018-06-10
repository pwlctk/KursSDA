package main.java.pl.pwlctk.kurs05.hometasks.queue4_1;

public abstract class Queue {
    int[] numbers;
    int size;
    int capacity;

    Queue(int capacity) {
        this.capacity = capacity;
        this.numbers = new int[capacity];
    }

    public abstract void push(int number);

    public abstract int pop();

    public abstract String toString();
}
