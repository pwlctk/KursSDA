package main.java.pl.pwlctk.kurs05.course.Shape;

public class Rectangle extends Shape {
    protected int a;
    protected int b;

    public Rectangle(int a, int b) {
        super.greeting = "Prostokąt";
        this.a = a;
        this.b = b;
    }

    public double area() {
        return a * b;
    }
}
