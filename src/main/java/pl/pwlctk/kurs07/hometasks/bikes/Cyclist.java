package main.java.pl.pwlctk.kurs07.hometasks.bikes;

public class Cyclist {
    private String nickName;
    private Bike bike;

    public Cyclist() {
        bike = new WigryBike("Romet");
        nickName = "jakiś rowerzysta";
    }

    public Cyclist(Bike bike, String nickName) {
        this.bike = bike;
        this.nickName = nickName;
    }

    void gearUp() {
        bike.changeGear(bike.currentGear() + 1);
    }

    void gearUp(int up) {
        bike.changeGear(bike.currentGear() + up);
    }

    void gearDown() {
        bike.changeGear(bike.currentGear() - 1);
    }

    void gearDown(int down) {
        bike.changeGear(bike.currentGear() - down);
    }

    @Override
    public String toString() {
        return "Rowerzysta o ksywie " + nickName + " śmiga rowerem " + bike;
    }
}
