package main.java.pl.pwlctk.kurs05.course.Shape;

public class Triangle extends Shape {

    private int a;
    private int h;

    public Triangle(int a, int h) {
        super.greeting = "Trójkąt";
        this.a = a;
        this.h = h;
    }

    @Override
    public double area() {
        return 1 / 2.0 * a * h;
    }
}
