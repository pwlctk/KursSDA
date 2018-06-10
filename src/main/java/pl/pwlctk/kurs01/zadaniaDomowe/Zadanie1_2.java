package pl.pwlctk.kurs01.zadaniaDomowe;

public class Zadanie1_2 {

    private static void binaryAdd() {
        String binary0 = "10";
        String binary1 = "11";
        int number0 = Integer.parseInt(binary0, 2);
        int number1 = Integer.parseInt(binary1, 2);
        int sum = number0 + number1;
        System.out.println(Integer.toBinaryString(sum));
    }

    public static void main(String[] args) {
        binaryAdd();
    }
}
