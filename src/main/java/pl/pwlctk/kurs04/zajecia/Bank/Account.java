package main.java.pl.pwlctk.kurs04.zajecia.Bank;

public class Account {
    Customer customer;
    float balance;

    public Account(float balance) {
        this.balance = balance;
    }

    public Account(Customer customer, float balance) {
        this.customer = customer;
        this.balance = balance;
    }

    public float getBalance() {
        return balance;
    }

    private void addMoney(float money) {
        balance += money;
    }

    void transfer(float money, Account account) {
        if (balance >= money) {
            balance -= money;
            account.addMoney(money);
        } else {
            System.out.println("Brak środków!");
        }
    }
}


/*
*Zadanie Bank*
Napisz klasę `Account`, która będzie reprezentowała konto bankowe.
Pola:
`float balance`
Konstruktor
`Account (Customer customer, float balance)`
Metody
`float getBalance()` - zwraca ilość pieniędzy na koncie
`void transfer(float money, Account account)` - wykonuje przelew: jeśli hajs się zgadza (jest wystarczająca ilość: `money <= balance`)
 wykonuje transfer (odejmuje od `balance` i dodaje do `balance` argumentu `account`, jeśli `money > balance` wypisuje: Brak środków (edited)


 */