package main.java.pl.pwlctk.kurs03.hometasks.Employee;

public class Employee {
    private static int id = 0;
    private String name;
    private String surname;
    private int age;
    private int employeeId;
    private String workingPosition;
    private double salary;

    public Employee() {
        this.employeeId = ++id;
        this.name = "Janusz";
        this.surname = "Jawowski";
        this.age = 81;
        this.workingPosition = "Stażysta";
    }

    public Employee(String name) {
        this.employeeId = ++id;
        this.name = name;
        this.surname = "Kosmo";
        this.age = 36;
        this.workingPosition = "Podlewa kwiatki";
    }

    public Employee(String name, String surname) {
        this.employeeId = ++id;
        this.name = name;
        this.surname = surname;
        this.age = 76;
        this.workingPosition = "Pilnuje piłkarzyków";
    }

    public Employee(String name, String surname, int age) {
        this.employeeId = ++id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workingPosition = "Robi dobrą kawę";
    }

    public Employee(String name, String surname, int age, double salary) {
        this.employeeId = ++id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.workingPosition = "Robi dobrą kawę";
    }

    public Employee(String name, String surname, int age, double salary, String workingPosition) {
        this.employeeId = ++id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.salary = salary;
        this.workingPosition = workingPosition;
    }

    public Employee(String name, String surname, int age, String workingPosition) {
        this.employeeId = ++id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.workingPosition = workingPosition;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String toString() {
        return
                "Numer Pracownika: " + this.employeeId + "\n" +
                        "Imię: " + this.name + "\n" +
                        "Nazwisko: " + this.surname + "\n" +
                        "Wiek: " + this.age + "\n" +
                        "Stanowisko: " + this.workingPosition + "\n" +
                        "Zarobki: " + this.salary + "\n" +
                        "-----------------------------------------";
    }
}



/*
Employee - przechowująca takie dane jak imię, nazwisko i wiek pracownika, oraz co najmniej trzy konstruktory,
które posłużą do inicjowania obiektów z różnymi parametrami - w przypadku gdy przykładowo konstruktor przyjmuje
tylko 1 parametr, zainicjuj pozostałe pola jakimiś domyślnymi wartościami.
Company - klasa testowa, w której utworzysz kilka obiektów klasy Employee i wyświetlisz dane na ekran.

 */