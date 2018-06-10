package main.java.pl.pwlctk.kurs06.course.enumy;

public enum Grades {

    ONE("Jedynka"),
    TWO("Dwójka"),
    THREE("Trójka"),
    FOUR("Czwórka"),
    FIVE("Piątka"),
    SIX("Szóstka");

    private String grade;

    Grades(String grade) {
        this.grade = grade;
    }

    public String getGrade() {
        return grade;
    }
}


class Main {

    public static void main(String[] args) {
        Grades grade = Grades.ONE;
        if (Grades.SIX == grade) {
            System.out.println("Szóstka!");
        } else {
            System.out.println("Słabo!");
        }
        printMyGrade(grade);
    }

    public static void printMyGrade(Grades grade) {
        if (Grades.ONE == grade) {
            System.out.println(grade.getGrade());
        } else if (Grades.TWO == grade) {
            System.out.println(grade.getGrade());
        } else if (Grades.THREE == grade) {
            System.out.println(grade.getGrade());
        }
    }

}