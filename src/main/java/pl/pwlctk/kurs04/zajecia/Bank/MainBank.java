package main.java.pl.pwlctk.kurs04.zajecia.Bank;

public class MainBank {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Rafał", "Kosmo");
        Customer customer2 = new Customer("Zbigniew", "Bąk");

        Account acc1 = new Account(10000);
        Account acc2 = new Account(5000);

        acc1.transfer(10000, acc2);

        System.out.println("Konto1: " + acc1.getBalance());
        System.out.println("Konto2: " + acc2.getBalance());
    }
}
