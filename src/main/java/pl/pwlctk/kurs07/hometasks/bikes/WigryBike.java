package main.java.pl.pwlctk.kurs07.hometasks.bikes;

public class WigryBike implements Bike {
    private String brand;

    public WigryBike(String brand) {
        this.brand = brand;
    }

    @Override
    public boolean changeGear(int gear) {
        if (gear < numOfGears()) {
            System.out.println("W tym rowerze nie ma niższej przerzutki!");
        } else {
            System.out.println("W tym rowerze nie ma wyższej przerzutki!");
        }
        return false;
    }

    @Override
    public int numOfGears() {
        return 1;
    }

    @Override
    public int currentGear() {
        return 1;
    }

    @Override
    public String toString() {
        return brand + " bez konieczności zmieniania przerzutek!";
    }
}
