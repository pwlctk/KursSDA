package main.java.pl.pwlctk.kurs03.hometasks.fibonacci3_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę wyrazów ciągu Fibonacciego: ");
        int fn = scanner.nextInt();
        Fibonacci fib = new Fibonacci(fn);
        fib.calculateElements();
        System.out.println("\nCiąg Fibonacciego o " + fn + " wyrazach wygląda następująco:");
        fib.showAllElements();

        //Zapis do pliku
        System.out.println("\n\nCzy zapisać do pliku? (T - Tak)");
        String choice = scanner.next();
        if (choice.equalsIgnoreCase("T")) {
            StringBuilder content = new StringBuilder();
            for (int element : fib.getAllElements()) {
                content.append(element).append("\n");
            }
            Writer writer = new Writer(content.toString(), "Fibonacci(" + fn + ").txt" );
            writer.writeToDisk();
        }
    }
}
