package main.java.pl.pwlctk.kurs03.hometasks.Employee3_3;

public class MainEmployee {
    public static void main(String[] args) {
        System.out.println("Premie dla pracowników");
        Employee employee0 = new Employee("Tadeusz", 30, 4000, 6);
        Employee employee1 = new Employee("Zbigniew", 61, 5000, 11);
        Employee employee2 = new Employee("Rafał", 25, 1000, 2);
        System.out.println("Pracownik 1: " + employee0);
        System.out.println("Zarobki pracownika po dodaniu premii: " + employee0.paySalary());
        System.out.println();
        System.out.println("Pracownik 2: " + employee1);
        System.out.println("Zarobki pracownika po dodaniu premii: " + employee1.paySalary());
        System.out.println();
        System.out.println("Pracownik 3: " + employee2);
        System.out.println("Zarobki pracownika po dodaniu premii: " + employee2.paySalary());
    }
}
