package main.java.pl.pwlctk.kurs04.zajecia.Time;

public class MainTime {
    public static void main(String[] args) {
        Time time = new Time("01:30");
        Time time2 = new Time(22, 29);
        Time time3 = new Time("10:32");


        System.out.println("\nWynik dodawania: " + time2 + " oraz " + time3);
        Time time4 = time2.add(time3);
        System.out.println(time4);

        System.out.println("\n" + time2 + " oraz " + time3);


        int multipler = 3;
        System.out.println("\nWynik mnożenia: " + time + " przez " + multipler);
        time.multiply(multipler);
        System.out.println(time);
    }
}
