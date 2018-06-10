package main.java.pl.pwlctk.kurs07.hometasks.bikes;

public class MountainBike implements Bike {
    private int gearsCount;
    private int currentGear;
    private String brand;

    public MountainBike(int gearsCount, String brand) {
        this.gearsCount = gearsCount;
        this.brand = brand;
        currentGear = gearsCount - 1; //zakładam, że startujemy z prawie najwyższej/najlżejszej przerzutki (łatwiej ruszyć)
    }

    @Override
    public boolean changeGear(int gear) {
        if (gear <= gearsCount && gear > 0) {
            if (Math.abs(currentGear - gear) == 1) {
                if (currentGear < gear) {
                    currentGear++;
                    System.out.println("Bieg w górę na: " + currentGear);
                    return true;
                } else if (currentGear > gear) {
                    currentGear--;
                    System.out.println("Bieg w dół na: " + currentGear);
                    return true;
                }
            } else if (currentGear == gear) {
                System.out.println("Nie można zmienić biegu na ten sam bieg: >" + currentGear + "<");
                return false;
            }
            System.out.println("Zmiana biegu o więcej niż 1 w tym rowerku nie jest dozwolona!");
            return false;
        } else {
            if (currentGear < 2) { // nie wiem dlaczego musi być 2 (wydaje się, że powinno być: currentGear < 1)
                throw new UnsupportedOperationException("Spadł łańcuch!");
            } else {
                throw new UnsupportedOperationException("Po jeździe! Łańcuch wplątał się w szprychy!");
            }
        }
    }

    @Override
    public int numOfGears() {
        return gearsCount;
    }

    @Override
    public int currentGear() {
        return currentGear;
    }

    @Override
    public String toString() {
        return brand + " z " + gearsCount + " przerzutkami.";
    }
}


/*

`boolean changeGear(int gear)` zmienia przerzutkę, zwraca `true` gdy udało się zmienić i `false` jeśli nie. Możliwa jest zmiana tylko o 1 bieg w górę lub w dół,
 gdy zmiana będzie większa niż 1 zwracamy `false`.
 Gdy chcemy zmienić na bieg wyższy niż ilość przerzutek lub na mniej niż 1 to rzucamy wyjątek `UnsuportedOperationException` (jest w jdk - nie tworzymy własnego)

 */