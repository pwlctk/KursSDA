package main.java.pl.pwlctk.kurs05.hometasks.school;

public class Student extends Person {
    private final int MAX_COURSES = 10;
    private int numOfCourses;
    private int[] grades;
    private String[] courses;

    public Student(String name, String address) {
        super(name, address);
        grades = new int[MAX_COURSES];
        courses = new String[MAX_COURSES];
    }

    public void addCourseGrade(String course, int grade) {
        courses[numOfCourses] = course;
        grades[numOfCourses] = grade;
        numOfCourses++;
    }

    public void printGrades() {
        for (int i = 0; i < numOfCourses; i++) {
            System.out.println("Kurs: " + courses[i] + ", ocena: " + grades[i]);
        }
    }

    public String[] getCourses() {
        return courses;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public String toString() {
        return "Student: " + name + ", mieszka: " + address;
    }
}

