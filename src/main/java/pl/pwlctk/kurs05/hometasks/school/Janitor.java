package main.java.pl.pwlctk.kurs05.hometasks.school;

public class Janitor extends Person {
    private int[] classRooms;
    private int numberClassRoomsToClean;

    public Janitor(String name, String address) {
        super(name, address);
        classRooms = new int[10];
    }

    public void addClassRoom(int classRoom) {
        classRooms[numberClassRoomsToClean] = classRoom;
        numberClassRoomsToClean++;
    }

    public void clean() {
        for (int i = 0; i < numberClassRoomsToClean; i++) {
            System.out.println("Sala: " + classRooms[i] + " posprzątana.");
            classRooms[i] = 0;
        }
        numberClassRoomsToClean = 0;
    }

    public int[] getClassRooms() {
        return classRooms;
    }

    public int getNumberClassRoomsToClean() {
        return numberClassRoomsToClean;
    }

    public String toString() {
        return name;
    }

}










/*
Stwórz klasę `Janitor` (woźny) rozszerzającą `CommonPerson` - konstruktor jak dla `Student` oraz pola prywatne:
`int[] classRooms` opisuje numery sal, które muszą zostać posprzątane
`int numberClassRoomsToClean` ilość klas zapisanych na tablicy (por. klasa `PersonList`) - określa indeks w tablicy do dodania nowej sali

Metody publiczne:
`void addClassroom(int classRoom)` dodaje salę do posprzątania
`void clean()` w pętli leci po wszystkich salach i wypisuje: Sala {numer} posprzątana (bez nawiasów) oraz zdejmuje ją z tablicy
`int[] getClassRooms()` getter do polaKlasa `School` ma dodatkowe pole:
`private Janitor[]` możemy mieć kilku woźnychOraz dodatkowe metody:
`void addClassToClean(int classRoom)` sprawdza, czy sala już nie znajduje się w obowiązkach któregoś woźnego (na tablicy któregoś woźnego). Jeśli już jest dodana do woźnego wypisuje: Ta sala już jest zajęta. Jeśli nie znajduje się na żadnej tablicy żadnego woźnego: dodaje woźnemu, który ma najmniej do posprzątania
`void goJanitors()` wszystkim woźnym wywołuje metody `clean`*Dodatkowe*

Woźny musi też napalić w piecu (zakładamy, że jest zima). Piec jest tylko jeden, wiec zadanie rozpalenia dostaje woźny, który ma najmniej sal do sprzątania: jeśli wszyscy mają tyle samo to bierzemy losowego: klasa `Random` oraz w szczególności metoda `nextInt()`Rozpalenie powinna obsługiwać metoda:
`Janitor stoke()` zwraca woźnego, który dostąpił zaszczytu rozpalenia w piecu :



 */