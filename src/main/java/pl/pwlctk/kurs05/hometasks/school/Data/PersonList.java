package main.java.pl.pwlctk.kurs05.hometasks.school.Data;

import main.java.pl.pwlctk.kurs05.hometasks.school.Person;

public class PersonList {
    int capacity;
    protected int size;
    private Person[] people;

    public PersonList(int capacity) {
        this.capacity = capacity;
        this.size = 0;
        this.people = new Person[capacity];
    }

    public int getSize() {
        return size;
    }


    public void add(Person person) {
        if (size < capacity) {
            people[size] = person;
            size++;
        } else {
            System.out.println("Lista jest pełna!");
        }
    }

    public Person get(int index) {
        if (index < size && index > -1) {
            return people[index];
        } else if (index >= size && index < capacity) {
            System.out.print("Nie ma takiego indeksu ");
            return null;
        } else {
            System.out.print("Indeks poza zasięgiem ");
            return null;
        }
    }
}
