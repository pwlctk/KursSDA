package main.java.pl.pwlctk.kurs05.course.Shape;

public abstract class Shape {
    protected String greeting;


    public abstract double area();

    public void print(){
        System.out.println(greeting);

    }

}
