package main.java.pl.pwlctk.kurs03.hometasks.Arrange3_4;

public class MainArrange {
    public static void main(String[] args) {
        int[] order = {0, 1, 4, 3, 2, 6, 5};
        Arrange arrange = new Arrange("Egzamin");
        System.out.println(arrange.order(order));
    }
}
