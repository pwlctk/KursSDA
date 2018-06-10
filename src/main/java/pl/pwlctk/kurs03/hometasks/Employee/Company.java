package main.java.pl.pwlctk.kurs03.hometasks.Employee;

import main.java.pl.pwlctk.kurs03.hometasks.Employee.Employee;

public class Company {
    public static void main(String[] args) {
        int hiredEmployes = 3;

        Employee[] employes = new Employee[5];
        String[] dataNames = {"Rafał", "Grażyna", "Brajan"};
        String[] dataSurnames = {"Dexter", "Disney", "Kosmo"};
        int[] dataAges = {18, 72, 33};
        String[] dataJobs = {"Specjalista", "Podlewa kwiatki", "Pomaga przy kawie"};

        for (int i = 0; i < hiredEmployes; i++) {
            employes[i] = new Employee(dataNames[i], dataSurnames[i], dataAges[i], dataJobs[i]);
        }

        employes[3] = new Employee("Dżesika");
        employes[4] = new Employee();

        for (Employee emp : employes) {
            System.out.println(emp);
        }
    }
}
