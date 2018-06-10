package main.java.pl.pwlctk.kurs03.hometasks.fibonacci3_1;

public class Fibonacci {
    private int[] elements;

    public Fibonacci(int elements) {
        this.elements = new int[elements];
    }

    public void calculateElements() {
        elements[0] = 0;
        if (elements.length > 1) {
            elements[1] = 1;
            for (int i = 2; i < elements.length; i++) {
                elements[i] = elements[i - 2] + elements[i - 1];
            }
        }
    }

    public int getElement(int element) {
        if (element < elements.length) {
            return elements[element];
        } else {
            return 0;
        }
    }

    public int[] getAllElements() {
        return elements;
    }

    public void showAllElements() {
        for (int elements : this.elements) {
            System.out.print(elements + " ");
        }
    }
}
