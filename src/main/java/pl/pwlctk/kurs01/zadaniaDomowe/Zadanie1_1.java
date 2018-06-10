package pl.pwlctk.kurs01.zadaniaDomowe;

public class Zadanie1_1 {

    private static void formattedText() {
        String formattedText = String.format(
                "%1$4c%2$5c%3$4c%3$6c%2$3c%n" +
                        "%1$4c%2$4c%2$2c%3$4c%3$4c%2$3c%2$2c%n" +
                        "%1$c%1$3c%2$3c%2$c%2$c%2$c%2$c%3$4c%3$2c%2$3c%2$c%2$c%2$c%2$c%n" +
                        "%1$2c%1$c%2$3c%2$6c%3$4c%2$3c%2$6c"
                , 'J', 'a', 'v');
        System.out.println(formattedText);
    }
    public static void main(String[] args) {
        formattedText();

    }
}
