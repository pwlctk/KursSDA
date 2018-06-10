package main.java.pl.pwlctk.kurs03.hometasks.library;

public class Book {
    private String name;
    private Author author;
    private float price;
    private int quantity;

    public Book(String name, Author author, float price, int quantity) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    public String toString() {
        return name + ", " + author.formatByGender() + author.getName() + ", cena: " + price + "zł";
    }
}


