package main.java.pl.pwlctk.kurs05.course.Point;

public class Point {
    private int x;
    private int y;

    public Point() {
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void addX() {
        x++;
    }

    public void addX(int value) {
        x += value;
    }

    public void addY() {
        y++;
    }

    public void addY(int value) {
        y += value;
    }

    public void add() {
        x++;
        y++;
    }

    public void add(int valueX) {
        x += valueX;
    }

    public void add(int valueX, int valueY) {
        x += valueX;
        y += valueY;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void show() {
        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}



/*

Utwórz klasę Point, która przechowuje dwie wartości typu int - współrzędne punktu na powierzchni.
Napisz w niej także metody które: zwiększają wybraną współrzędną o 1, zmieniają wybraną zmienną o dowolną wartość,
zwracają wartość współrzędnych (oddzielne metody), wyświetla wartość współrzędnych.
Napisz także klasę, w której przetestujesz działanie metod wyświetlając działanie metod na ekranie.



 */
