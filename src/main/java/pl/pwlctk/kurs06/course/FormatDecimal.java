package main.java.pl.pwlctk.kurs06.course;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.ParseException;
import java.util.Locale;

public class FormatDecimal {
    public static void main(String[] args) {
        DecimalFormat decimalFormat = new DecimalFormat();

        DecimalFormatSymbols instance = DecimalFormatSymbols.
                getInstance(new Locale("pl","PL"));
        decimalFormat.setDecimalFormatSymbols(instance);

        long bigNumber = 423232342342L;
        double number = 1_000.95;
//        System.out.println(decimalFormat.format(number));
//        System.out.println(decimalFormat.format(bigNumber));


        try {
            System.out.println(decimalFormat.parse("98678,757"));
        } catch (ParseException e) {
            e.printStackTrace();
        }

    }

}
