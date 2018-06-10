package main.java.pl.pwlctk.kurs06.course.kolekcje;

import java.util.HashMap;
import java.util.Map;

public class MapkaSuma {
    public static void main(String[] args) {
        Map<String, Integer> grades = new HashMap<>();
        grades.put("Matematyka", 5);
        grades.put("Informatyka", 5);
        grades.put("Historia", 5);
        grades.put("Biologia", 5);
        grades.put("Fizyka", 4);

        double sumOfGrades = 0.0;

        for (Integer grade : grades.values()) {
            sumOfGrades += grade;
        }

        System.out.println(sumOfGrades / grades.size());
    }
}
