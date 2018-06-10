package pl.pwlctk.kurs03.zajecia;

public class Tablice3 {
    public static void main(String[] args) {
        int intTab[] = {1, 3, 5, 10};

        System.out.println("Po kolei bez pętli:");
        System.out.println(intTab[0]);
        System.out.println(intTab[1]);
        System.out.println(intTab[2]);
        System.out.println(intTab[3]);

        System.out.println("Po kolei w pętli:");
        for (int n : intTab) {
            System.out.print(n + " ");
        }
        System.out.println("\nParzysty indeks: ");
        for (int i = 0; i < 4; i += 2) {
            System.out.print(intTab[i] + " ");
        }
        System.out.println("\nParzyste liczby:");
        for (int anIntTab : intTab) {
            if (anIntTab % 2 == 0)
                System.out.print(anIntTab + " ");
        }
        System.out.println("\nOdwrócona kolejność:");
        for (int i = intTab.length - 1; i >= 0; i--) {
            System.out.print(intTab[i] + " ");

        }
    }
}

/*
Zadania do samodzielnego wykonania
1. Utwórz tablicę liczb {1,3,5,10}
2. Wypisz wszystkie elementy po kolei
3. Wypisz elementy w pętli
4. Wypisz tylko liczby o parzystym indeksie
5. Wypisz tylko liczby parzyste
6. Wypisz elementy w odwróconej kolejności

 */
