package main.java.pl.pwlctk.kurs05.hometasks.school;

public class Teacher extends Person {
    private int numOfCourses;
    String[] courses;

    public Teacher(String name, String address) {
        super(name, address);
        courses = new String[10];
    }

    void addCourse(String course) {
        boolean hasCourse = false;
        for (int i = 0; i < numOfCourses; i++) {
            if (courses[i].equalsIgnoreCase(course)) {
                System.out.println("Nauczyciel już prowadzi taki kurs!");
                hasCourse = true;
                break;
            }
        }
        if (!hasCourse) {
            courses[numOfCourses] = course;
            numOfCourses++;
        }
    }

    public String[] getCourses() {
        return courses;
    }

    public int getNumOfCourses() {
        return numOfCourses;
    }

    public String toString() {
        return "Nauczyciel " + name + ", mieszka: " + address;
    }
}


/*
Stwórz klasę `Teacher` rozszerzającą `CommonPerson` Posiadającą następujące pola prywatne:

`int numOfCourses`
`String[] courses`posiadającą jeden publiczny konstruktor:
`public Teacher(String name, String address)` podobnie jak dla `Student` powinien inicjalizowac tablicę `courses`Oraz metody publiczne:
`void addCourse(String course)` przypisujący przedmiot prowadzony przez danego nauczyciela do tablicy `courses` - jeden nauczyciel może być przypisany do tego samego przedmiotu tylko raz
`String toString()` tak jak dla studenta*Dodatkowe*
Klasa `School` reprezentującą uczniów i nauczycieli posiadająca pola prywatne:
`Student[] students`
`Teacher[] teachers`Oraz konstruktor publiczny
`public School(Student[] students, Teacher[] teachers)`Oraz metody publiczne:
`void printCourse(String course)` wypisującą wszystkich uczniów uczęszczających na dany przedmiot oraz nauczyciela prowadzącego np:


```Matematyka z Jan Kowalski
Lista uczniów:
Miłosz Raczek
Anna Nieznana
Tymoteusz Gbur
Mirosław Hojny```
 */