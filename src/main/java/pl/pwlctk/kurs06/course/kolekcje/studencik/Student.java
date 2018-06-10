package main.java.pl.pwlctk.kurs06.course.kolekcje.studencik;

public class Student {
    private String name;

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Student: " + name;
    }


}
