package main.java.pl.pwlctk.kurs05.course.Shape;

public class Circle extends Shape {
    protected int radius;

    public Circle(int radius) {
        super.greeting = "Koło";
        this.radius = radius;
    }

    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }
}
