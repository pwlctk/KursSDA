package main.java.pl.pwlctk.kurs03.hometasks.circle3_2;

public class Circle {
    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double area() {
        return 2 * Math.PI * radius;
    }
    public double perimeter() {
        return Math.PI * Math.pow(radius, 2);
    }

    public int getRadius() {
        return radius;
    }
    public void setRadius(int radius) {
        this.radius = radius;
    }
}