package main.java.pl.pwlctk.pozakursem;

public class Point {
    public int x = 0;
    public int y = 0;
    //constructor
    public Point(int a, int b) {
        x = a;
        y = b;
    }


    public static void main(String[] args) {
        int height = new Rectangle().height;

        System.out.println(height);
    }
}