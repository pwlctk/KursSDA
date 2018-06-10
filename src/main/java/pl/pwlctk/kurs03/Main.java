package pl.pwlctk.kurs03;

import pl.pwlctk.kurs03.zajecia.Vehicle;

public class Main {
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle(4, "czerwony", 220);
        vehicle.print();

        Vehicle vehicle1 = new Vehicle(4,"niebieski");
        vehicle1.print();
    }
}
