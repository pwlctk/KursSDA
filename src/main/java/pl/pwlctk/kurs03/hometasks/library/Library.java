package main.java.pl.pwlctk.kurs03.hometasks.library;

public class Library {
    private Book[] books;

    public Library(Book[] books) {
        this.books = books;
    }

    public Book findBookByName(String name) {
        for (Book book : books) {
            if (book.getName().equalsIgnoreCase(name)) {
                return book;
            }
        }
        return null;
    }

    public Book[] findBooksByAuthor(Author author) {
        StringBuilder abooks = new StringBuilder();
        for (int i = 0; i < books.length; i++) {
            if (books[i].getAuthor().getName().equalsIgnoreCase(author.getName()))
                abooks.append(i).append(":");
        }
        String[] index = abooks.toString().split(":");
        Book[] authorBooks = new Book[index.length];
        for (int i = 0; i < index.length; i++) {
            authorBooks[i] = books[Integer.parseInt(index[i])];
        }
        return authorBooks;
    }





/*    public PersonList<Book> findBooksByAuthor(Author author) {
        PersonList<Book> authorBooks = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().getName().equalsIgnoreCase(author.getName())) {
                authorBooks.add(book);
            }
        }
        return authorBooks;
    }*/

    public void listNotAvailableBooks() {
        System.out.println("Lista książek, których chwilowo nie ma na stanie:");
        int counter = 0;
        for (Book book : books) {
            if (book.getQuantity() == 0) {
                System.out.println(++counter + ". " + book);
            }
        }
    }
}