package main.java.pl.pwlctk.kurs05.course.PointD;

public class Point3D extends Point2D {
    protected int z;

    public Point3D(int z) {
        this.z = z;
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public String toString() {
        return "x = " + x + ", y = " + y + ", z = " + z;
    }
}



/*

Stwórz klasę Point2D, która przechowuje informacje na temat punktu na przestrzeni dwuwymiarowej (współrzędne x oraz y).
Zawierająca dwa konstruktory: bezparametrowy ustawiający pola na wartość 0, oraz przyjmujący dwa argumenty i ustawiający pola obiektu zgodnie z podanymi parametrami.
Napisz klasę Point3D dziedziczącą po Point2D, reprezentującą punkt w trójwymiarze (dodatkowe pole z).
W klasie testowej utwórz obiekty obu klas i przetestuj działanie.

 */