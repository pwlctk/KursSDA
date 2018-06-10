package main.java.pl.pwlctk.kurs07.tasks.interfejsy;

public class CommonEmployee extends CommonPerson implements Employee {
    private double salary;
    private double bonusSalary;
    private EmployerPerson boss;


    public CommonEmployee(String firstName, String lastName, EmployerPerson boss) {
        super(firstName, lastName);
        this.boss = boss;
        this.bonusSalary = 0.1;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String getEmployer() {
        return "Szef: " + "\n" +
                boss.toString();
    }

    @Override
    public double calcSalary() {
        return salary += salary * bonusSalary;
    }
}
