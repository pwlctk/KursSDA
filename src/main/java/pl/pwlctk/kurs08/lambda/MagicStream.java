package main.java.pl.pwlctk.kurs08.lambda;

import main.java.pl.pwlctk.kurs03.hometasks.Employee.Employee;

import java.util.Arrays;
import java.util.List;

public class MagicStream {
    public static void main(String[] args) {

        List<Employee> employee = Arrays.asList(
                new Employee("Zbigniew", "Kowalski", 34, 5100.0, "Konserwator ekspresu do kawy"),
                new Employee("Jerzy", "Bąk", 27, 3100.0, "Sprzątacz brudów"),
                new Employee("Zofia", "Taka", 24, 4400.0, "Podlewa kwiatki"),
                new Employee("Bogdan", "Bub", 27, 4100.0, "Przegląda YouTube"),
                new Employee("Rafał", "Kosmo", 53, 3600.0, "Specjalista ds Wszystkiego"),
                new Employee("Alojzy", "Lojzy", 41, 15050.0, "Starszy Prezes"),
                new Employee("Jan", "Szybki", 33, 3700.0, "Leń"),
                new Employee("Artur", "Leń", 41, 3600.0, "Nie robi nic"));

        // pierwszy sposób
//        double sum = employee.stream()
//                .filter(emp -> emp.getSalary() < 4000)
//                .filter(emp -> emp.getAge() > 30)
//                .map(Employee::getSalary)
//                .reduce(0.0, Double::sum);


        //drugi sposób
        double sum = employee.stream()
                .filter(emp -> emp.getSalary() < 4000)
                .filter(emp -> emp.getAge() > 30)
                .mapToDouble(Employee::getSalary)
                .sum();

        System.out.println(sum);

//        double average = employee.stream()
//                .filter(emp -> emp.getSalary() < 4000)
//                .filter(emp -> emp.getAge() > 30)
//                .mapToDouble(Employee::getSalary)
//                .average()
//                .getAsDouble();


//        System.out.println(average);
    }
}


//    Na podstawie listy pracowników, wypisz w konsoli imiona i nazwiska wszystkich, którzy mają powyżej 30 lat i zarabiają mniej niż 4000.
//        List<Employee> employee= Arrays.asList(
//        new Employee("Kowal", "Jan", 34, 3400.0),new Employee("As", "Ala", 27, 4100.0),
//        new Employee("Kot", "Zofia", 33, 3700.0),new Employee("Puchacz", "Jan", 41 , 3600.0));
