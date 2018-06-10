package main.java.pl.pwlctk.kurs07.tasks.interfejsy;

public class Market {
    public static void main(String[] args) {
        EmployerPerson boss1 = new EmployerPerson("Rafał", "Kosmo", "Buty i komputery");
        EmployerPerson boss2 = new EmployerPerson("Bogdan", "Walnięty", "Loty w kosmos");

        System.out.println(boss1.getCompany());
        System.out.println();
        System.out.println(boss1);


        CommonEmployee goodEmployee = new CommonEmployee("Waldek", "Zaradny", boss2);
        System.out.println();

        System.out.println(goodEmployee.getEmployer());
        goodEmployee.setSalary(3800);
        System.out.println("Wynagrodzenie: " + goodEmployee.calcSalary());

    }
}
