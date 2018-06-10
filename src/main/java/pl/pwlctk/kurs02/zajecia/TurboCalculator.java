package main.java.pl.pwlctk.kurs02.zajecia;

public class TurboCalculator {
    static private double calculatorAddMultiply() {
        double a = 1;
        double b = 2;
        double c = 3;

        return (a + b) * c;
    }

    static private double calculatorSubtractionDivision() {
        double a = 4;
        double b = 2;
        double c = 3;

        return a - b / c;
    }

    public static void main(String[] args) {

        System.out.println(calculatorAddMultiply());
        System.out.println(calculatorSubtractionDivision());

        double z = 3 / 5.;

        System.out.println(z);

    }
}
