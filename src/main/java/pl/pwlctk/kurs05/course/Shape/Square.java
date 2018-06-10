package main.java.pl.pwlctk.kurs05.course.Shape;

public class Square extends Shape{
    protected int a;

    public Square(int a) {
        super.greeting = "Kwadrat";
        this.a = a;
    }

    public double area() {

        return a * a;
    }
}
