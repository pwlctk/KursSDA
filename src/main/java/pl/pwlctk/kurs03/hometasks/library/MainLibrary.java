package main.java.pl.pwlctk.kurs03.hometasks.library;

public class MainLibrary {
    public static void main(String[] args) {
        final int MAX_BOOKS = 6;
        System.out.println("===BIBLIOTEKA===");

        //Utworzenie przykładowych autorów
        Author rafal = new Author("Rafał", "rafal@buziaczek.pl", 'm');
        Author paulina = new Author("Paulina", "paulinka@buziaczek.pl", 'f');
        Author wiaczeslaw = new Author("Wiaczesław", "szalonywiesiek@oaza.pl", 'm');
        Author wieslawa = new Author("Wiesława", "wieska.kloc@wakacje.eu", 'f');
        Author stanislaw = new Author("Stanisław", "stanislaw.bak@wp.pl", 'm');

        //Utworzenie przykładowych książek
        Book[] books = new Book[MAX_BOOKS];
        books[0] = new Book("W puszczy i w pustyni", stanislaw, 59.99f, 0);
        books[1] = new Book("Java dla ekspertów", rafal, 159.99f, 3);
        books[2] = new Book("Pan Mickiewicz", wiaczeslaw, 39.99f, 25);
        books[3] = new Book("Java dla topornych, wydanie specjalne", wieslawa, 19.99f, 0);
        books[4] = new Book("Kubuś Puchatek", paulina, 49.99f, 1);
        books[5] = new Book("Woda w jeziorze", paulina, 19.99f, 36);

        //Utworzenie biblioteki i ustawienie książek (celowo nie w konstruktorze tylko setterem)
        Library library = new Library(books);

        //Wyświetlanie przykłądowych danych z biblioteki
        String bookTitle = "Java dla Ekspertów";
        System.out.println("Wyszukiwanie książki po nazwie: " + bookTitle);

        if (library.findBookByName(bookTitle) != null) {
            System.out.println("Książka znajduje się w bibliotece: " + library.findBookByName(bookTitle));
        } else {
            System.out.println("Nie znaleziono takiej książki!");
        }
        System.out.println();

        //Wyświetlanie książek danego autora
        System.out.println("Wyszukiwanie książki po autorze: " + paulina);
        int counter = 0;
        for (Book book : library.findBooksByAuthor(paulina)) {
                System.out.println(++counter + ". " + book);
        }


/*        if (library.findBooksByAuthor(paulina).isEmpty()) {
            System.out.println("Nie znaleziono książek danego autora!");
        } else {
            System.out.println("Książki " + (paulina.getGender() == 'm' ? "autora:" : "autorki:"));
            int counter = 0;
            for (Book lista : library.findBooksByAuthor(paulina)) {
                System.out.println(++counter + ". " + lista);
            }
        }*/
        System.out.println();
        library.listNotAvailableBooks();
    }
}
