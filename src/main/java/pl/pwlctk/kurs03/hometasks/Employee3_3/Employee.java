package main.java.pl.pwlctk.kurs03.hometasks.Employee3_3;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private int seniority;

    public Employee(String name, int age, int salary, int seniority) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.seniority = seniority;
    }

    public float paySalary() {
        float bonus = 1;
        if (seniority > 5 && seniority < 10) {
            bonus += 0.05;
        } else if (seniority > 10 && seniority < 15) {
            bonus += 0.1;
        } else if (seniority > 15) {
            bonus += 0.15;
        }

        if (age > 50 && age < 60) {
            bonus += 0.05;
        } else if (age > 60 && age < 70) {
            bonus += 0.1;
        } else if (age > 70) {
            bonus = 0;
        }

        return salary * bonus;
    }

    public String toString() {
        return "Imię: " + name + ", " + "lat: " + age + ", " + "podstawa: " + salary + ", " + "staż: " + seniority;
    }

}


/*
Zadanie 3.3

Napisz klasę Employee, która będzie miała cztery pola (zmienne)
- String name
- int age
- int salary (podstawa wynagrodzenia)
- int seniority (staż pracy w latach)

Klasa powinna mieć jedną metodę:
float paySalary()
Metoda powinna wyliczać wynagrodzenie pracownika wg wymagań:

1. Jeśli pracownik pracuje więcej niż 5 lat, dostaje dodatkowo 5% premii
2. Jeśli pracownik pracuje więcej 10 lat, dostaje 10% premii
3. Jeśli pracownik pracuje więcej niż 15 lat, dostaje 15%
4. Jeśli pracownik ma ponad 50 lat dostaje dodatkowo 5%
5. Jeśli pracownik ma ponad 60 lat, dostaje 10% premii
6. Jeśli pracownik ma ponad 70 lat idzie na emeryturę
Wszystkie premie się sumują, jeśli pracownik nie kwalifikuje się do premii, metoda powinna zwrócić podstawę:

30 lat, 6 lat doświadczenia, 4000 podstawy -> 4200
61 lat, 11 lat doświadczenia, podstawa 5000 -> 6000
 */
