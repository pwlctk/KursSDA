package main.java.pl.pwlctk.kurs05.hometasks.school;

import main.java.pl.pwlctk.kurs05.hometasks.school.Data.PersonList;

import java.util.Random;

public class School {
    private PersonList students;
    private PersonList teachers;
    private Janitor[] janitors;

    public School(PersonList students, PersonList teachers, Janitor[] janitors) {
        this.students = students;
        this.teachers = teachers;
        this.janitors = janitors;
    }

    private void printStudentsByCourse(String course) {
        for (int i = 0; i < students.getSize(); i++) {
            for (int j = 0; j < ((Student) students.get(i)).getNumOfCourses(); j++) {
                if (((Student) students.get(i)).getCourses()[j].equalsIgnoreCase(course)) {
                    System.out.println(students.get(i).getName());
                }
            }
        }
    }

    public void printCourse(String course) {
        for (int i = 0; i < teachers.getSize(); i++) {
            for (int j = 0; j < ((Teacher) teachers.get(i)).getNumOfCourses(); j++) {
                if (((Teacher) teachers.get(i)).getCourses()[j].equalsIgnoreCase(course)) {
                    System.out.println(course + " z " + teachers.get(i).name);
                    System.out.println("Lista uczniów: ");
                    printStudentsByCourse(course);
                }
            }
        }
    }

    public void addClassToClean(int classRoom) {
        boolean isCleaned = false;
        for (int i = 0; i < janitors.length; i++) {
            for (int j = 0; j < janitors[i].getClassRooms()[j]; j++) {
                if (janitors[i].getClassRooms()[j] == classRoom) {
                    System.out.println("Ta sala jest już na tablicy woźnego: " + janitors[i].getName());
                    isCleaned = true;
                }
            }
        }
        if (!isCleaned) {
            int index = bangingJanitorIndex();
            janitors[index].addClassRoom(classRoom);
            System.out.println("Salę numer: " + classRoom + " dodano do sprzątnięcia dla woźnego: " + janitors[index].getName());
        }
    }

    public Janitor stoke() {
        boolean isEqually = true;
        int numberClassToClean = janitors[0].getNumberClassRoomsToClean();
        for (int i = 0; i < janitors.length - 1; i++) {
            if (numberClassToClean != janitors[i + 1].getNumberClassRoomsToClean()) {
                isEqually = false;
                break;
            }
        }
        if (isEqually) {
            Random random = new Random();
            int index = random.nextInt(janitors.length);
            return janitors[index];
        } else {
            return janitors[bangingJanitorIndex()];
        }
    }

    private int bangingJanitorIndex() {
        if (janitors.length == 1) {
            return 0;
        } else {
            int index = 0;
            for (int i = 1; i < janitors.length; i++) {
                if (janitors[i].getNumberClassRoomsToClean() < janitors[i - 1].getNumberClassRoomsToClean()) {
                    index = i;
                } else {
                    return i - 1;
                }
            }
            return index;
        }
    }


    public void goJanitors() {
        System.out.println("Czyszczenie sal:");
        for (int i = 0; i < janitors.length; i++) {
            System.out.println("Woźny: " + janitors[i].getName() + " sprząta: ");
            janitors[i].clean();
        }
    }
}


/*
`void addClassToClean(int classRoom)` sprawdza, czy sala już nie znajduje się w obowiązkach któregoś woźnego (na tablicy któregoś woźnego).
 Jeśli już jest dodana do woźnego wypisuje: Ta sala już jest zajęta. Jeśli nie znajduje się na żadnej tablicy żadnego woźnego: dodaje woźnemu, który ma najmniej do posprzątania
`void goJanitors()` wszystkim woźnym wywołuje metody `clean`
 */









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


*Na szóstkę*
Wykorzystaj klasę `PersonList` z poprzednich zadań do przechowywania uczniów i nauczycieli - tablice uczniów i nauczycieli klasie `StdentList` i `TeacherList` natomiast w `School`:
`private StudentList students`
`private TeacherList teachers`
 */