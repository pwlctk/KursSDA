package main.java.pl.pwlctk.kurs05.hometasks.queue4_1;

public class FIFOQueue extends Queue {
    private int nextIndex;
    private int endIndex;

    public FIFOQueue(int capacity) {
        super(capacity);
        this.nextIndex = capacity - 1;
        this.endIndex = capacity - 1;
    }

    @Override
    public void push(int number) {
        if (size == capacity) {
            System.out.println("Kolejka jest pełna!");
        } else {
            if (nextIndex >= 0) {
                numbers[nextIndex] = number;
                nextIndex--;
            }
            if (nextIndex < 0) {
                nextIndex = capacity - 1;
            }
            size++;
        }
    }

    @Override
    public int pop() {
        if (size > 0) {
            size--;
            if (endIndex < 0) {
                endIndex = capacity - 1;
            }
            return numbers[endIndex--];
        } else {
            System.out.println("Kolejka jest pusta!");
            return -1;
        }
    }

    @Override
    public String toString() {
        StringBuilder list = new StringBuilder();
        int counter = 0;
        int index = nextIndex + 1;
        while (counter != size) {
            if (index == capacity) {
                index = 0;
            }
            list.append(numbers[index++]).append(" ");
            counter++;
        }
        return list.toString();
    }
}