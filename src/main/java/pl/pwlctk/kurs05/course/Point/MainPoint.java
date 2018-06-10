package main.java.pl.pwlctk.kurs05.course.Point;

public class MainPoint {
    public static void main(String[] args) {
        Point point = new Point();
        Point point2 = new Point(100, 100);

        point2.show();
        System.out.println();

        point.show();
        System.out.println();

        point.addX();
        point.show();
        System.out.println();

        point.addY(10);
        point.show();

        point.addX(5);

        System.out.println();
        System.out.println("x = " + point.getX());
        System.out.println("y = " + point.getY());

        point.add();
        System.out.println();
        point.show();

        System.out.println();
        point.add(15);
        point.add(5, 10);
        point.show();

        System.out.println(point.getClass());

    }
}
