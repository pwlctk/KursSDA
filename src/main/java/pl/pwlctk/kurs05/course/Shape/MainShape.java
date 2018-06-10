package main.java.pl.pwlctk.kurs05.course.Shape;

public class MainShape {
    public static void main(String[] args) {

        Circle circle = new Circle(1);

        Shape rectangle = new Rectangle(5, 10); //Polimorfizm

        Shape[] shapes = new Shape[]{circle, new Square(5), rectangle, new Triangle(10,5)};

        for (int i = 0; i < shapes.length; i++) {
            shapes[i].print();
            System.out.println(shapes[i].area());
        }
    }


}
