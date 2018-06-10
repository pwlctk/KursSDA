package pl.pwlctk.kurs03.zajecia;

public class Vehicle {
    private int numOfWheels;
    private String color;
    private int velocity;

    public Vehicle(int numOfWheels, String color) {
        this.numOfWheels = numOfWheels;
        this.color = color;
        this.velocity = 100;
    }

    public Vehicle(int numOfWheels, String color, int velocity) {
        this.numOfWheels = numOfWheels;
        this.color = color;
        this.velocity = velocity;
    }

    public void print() {
        System.out.println("Pojazd ma " + numOfWheels + " koła, jest " + color + " i może jechać " + velocity + "km/h.");
    }
}
