package main.java.pl.pwlctk.kurs04.zajecia.Library;


public class Library {
    private Movie[] movies;

    public static void main(String[] args) {
        Library library = new Library();
        library.movies = new Movie[]{
                new Movie("Titanic", 1985, "Dramat", new Director("Janek")),
                new Movie("Titanic", 1985, "Dramat", new Director("Zbyszek"))
        };

        Movie movie = null;

        System.out.println(movie);

        System.out.println(library.movies[1].getTitle());
        System.out.println(library.movies[1].getYear());
        System.out.println(library.movies[1].getGenere());
        System.out.println(library.movies[1].getDirectorName());

    }
}
