package main.java.pl.pwlctk.kurs05.hometasks.school;

import main.java.pl.pwlctk.kurs05.hometasks.school.Data.PersonList;

public class MainSchool {
    public static void main(String[] args) {
        PersonList students = new PersonList(5);
        PersonList teachers = new PersonList(5);
        Janitor[] janitors = {new Janitor("Wiesław", "Uboga 10"), new Janitor("Zbigniew", "Czysta 8")};

        students.add(new Student("Janek Paczy", "Wejcherowo 15"));
        students.add(new Student("Zbigniew Bąk", "Bąki 4"));
        students.add(new Student("Rafał Kosmo", "Długa 1324"));
        students.add(new Student("Aneta Bystra", "Aleja Drzew 15"));
        students.add(new Student("Brajan Cage", "Niezwykła 1"));

        //troszke tutaj nie rozumiem. Metoda get pobiera nam danego studenta, ale dlaczego metoda addCourseGrade zapisuje kurs w pobieranym studencie?
        //Przecież ja tego nigdzie nie zapisuje...
        ((Student) students.get(0)).addCourseGrade("Rolnictwo od podstaw", 4);
        ((Student) students.get(0)).addCourseGrade("Biznes od 0", 5);
        ((Student) students.get(0)).addCourseGrade("Nauka szybkiego uczenia", 2);
        ((Student) students.get(0)).addCourseGrade("Matematyka", 1);
        ((Student) students.get(0)).addCourseGrade("Historia krajobrazu", 6);

        ((Student) students.get(1)).addCourseGrade("Informatyka", 2);
        ((Student) students.get(1)).addCourseGrade("Religia", 3);
        ((Student) students.get(1)).addCourseGrade("Astronautyka", 3);
        ((Student) students.get(1)).addCourseGrade("Kosmonautyka", 3);
        ((Student) students.get(1)).addCourseGrade("Jak żyć", 3);

        ((Student) students.get(2)).addCourseGrade("Religia", 1);
        ((Student) students.get(2)).addCourseGrade("Astronautyka", 2);
        ((Student) students.get(2)).addCourseGrade("Kosmonautyka", 2);
        ((Student) students.get(2)).addCourseGrade("Jak żyć", 2);

        ((Student) students.get(3)).addCourseGrade("Religia", 1);
        ((Student) students.get(3)).addCourseGrade("Astronautyka", 2);
        ((Student) students.get(3)).addCourseGrade("Kosmonautyka", 2);
        ((Student) students.get(3)).addCourseGrade("Jak żyć", 2);

        ((Student) students.get(4)).addCourseGrade("Religia", 1);
        ((Student) students.get(4)).addCourseGrade("Astronautyka", 2);
        ((Student) students.get(4)).addCourseGrade("Kosmonautyka", 2);
        ((Student) students.get(4)).addCourseGrade("Jak żyć", 2);

        System.out.println(students.get(0));
        ((Student) students.get(0)).printGrades();
        System.out.println();
        System.out.println(students.get(1));
        ((Student) students.get(1)).printGrades();

        teachers.add(new Teacher("Mistrz Zen", "Zawadzka 6"));
        teachers.add(new Teacher("Profesor Benc", "Wystrzałowa 10"));

        ((Teacher) teachers.get(0)).addCourse("Matematyka");
        ((Teacher) teachers.get(0)).addCourse("Informatyka");
        ((Teacher) teachers.get(0)).addCourse("Astronautyka");
        ((Teacher) teachers.get(0)).addCourse("Kosmonautyka");
        ((Teacher) teachers.get(0)).addCourse("Nauka szybkiego uczenia");
        ((Teacher) teachers.get(0)).addCourse("Biznes od 0");

        ((Teacher) teachers.get(1)).addCourse("Religia");
        ((Teacher) teachers.get(1)).addCourse("Jak żyć");
        ((Teacher) teachers.get(1)).addCourse("Rolnictwo od podstaw");
        ((Teacher) teachers.get(1)).addCourse("Historia krajobrazu");

        janitors[0].addClassRoom(10);
        janitors[0].addClassRoom(11);
        janitors[0].addClassRoom(12);
        janitors[0].addClassRoom(13);
        janitors[0].addClassRoom(14);

        janitors[1].addClassRoom(20);
        janitors[1].addClassRoom(21);
        janitors[1].addClassRoom(22);
        janitors[1].addClassRoom(23);
        School school = new School(students, teachers, janitors);
        System.out.println();
        school.printCourse("Religia");

        System.out.println();
        System.out.println("WOŻNY!");
        school.addClassToClean(30);
        System.out.println("W piecu ma zaszczyt dziś rozpalić: " + school.stoke());

        school.goJanitors();
    }
}

