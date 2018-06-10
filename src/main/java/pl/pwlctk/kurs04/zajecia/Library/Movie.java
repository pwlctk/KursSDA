package main.java.pl.pwlctk.kurs04.zajecia.Library;

public class Movie {
    private String title;
    private int year;
    private String genere;
    private Director director;


    public Movie(String title, int year, String genere, Director director) {
        this.title = title;
        this.year = year;
        this.genere = genere;
        this.director = director;
    }

    public void setDirector(Director director) {
        this.director = director;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenere() {
        return genere;
    }

    public void setGenere(String genere) {
        this.genere = genere;
    }

    public String getDirectorName() {
        return director.getName();
    }
}
