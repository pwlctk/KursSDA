package main.java.pl.pwlctk.kurs03.hometasks.library;

public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }


    public String formatByGender() {
        if (gender == 'f') {
            return "Autorka: ";
        } else {
            return "Autor: ";
        }
    }

    public String toString() {
        return name + ", " + email;
    }
}


