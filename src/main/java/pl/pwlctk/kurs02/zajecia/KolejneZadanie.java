package main.java.pl.pwlctk.kurs02.zajecia;

public class KolejneZadanie {


    public static void main(String[] args) {

        int liczba = 20;
        long duzaLiczba = 100;
        char znak = 'x';
        String liczbaTekst = "500";

        int kolejnaLiczba = Integer.valueOf(liczbaTekst);
        int kolejnaLiczba2 = Integer.parseInt(liczbaTekst);

        int liczbaA = 10;
        int liczbaB = 4;

        System.out.println(kolejnaLiczba);
        System.out.println(kolejnaLiczba2);
        System.out.println((long) znak);
        System.out.println((char) liczba);

        System.out.println(String.valueOf(liczba + 5) + 0);
        System.out.println(liczbaA / (double) liczbaB);

        System.out.println("Coś" + "7");
        System.out.println("Coś" + 7);


    }
}

/*
    Wykorzystaj konwersję i rzutowanie wypróbuj zamiany różnych typów prostych między sobą.
    Szczególną uwagę zwróć na rzutowanie char na int. Jak myślisz, co w ten sposób otrzymujesz?
    Spróbuj podzielić 2 niepodzielne liczby int aby otrzymać jako wynik liczbę zmiennoprzecinkową np. 10 / 4 = 2.5
        */
