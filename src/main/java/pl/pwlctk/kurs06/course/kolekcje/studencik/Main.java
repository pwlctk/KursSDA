package main.java.pl.pwlctk.kurs06.course.kolekcje.studencik;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();
        List<Student> list = new ArrayList<>();

        list.add(new Student("Rafał"));
        list.add(new Student("Bobek"));
        list.add(new Student("Waldek"));
        list.add(new Student("Wincenty"));
        list.add(new Student("Alojzy"));

        String searchName = "Alojzy";

        if (main.findStudent(list, searchName) != null) {
            System.out.println("Znaleziono studenta: " + searchName);
        } else {
            System.out.println("Nie ma takiego studenta: " + searchName);
        }
    }

    public Student findStudent(List<Student> list, String name) {
        for (Student aList : list) {
            if ((aList).getName().equals(name)) {
                return aList;
            }
        }
        return null;
    }
}
