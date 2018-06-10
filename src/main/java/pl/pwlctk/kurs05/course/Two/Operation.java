package main.java.pl.pwlctk.kurs05.course.Two;

public class Operation {

    public short add(int a, byte b) {
        System.out.println("int + byte, zwraca short (rzutowany, więc uwaga!)");
        return (short) (a + b);
    }

    public long add(int a, short b) {
        System.out.println("int + short, zwraca long");
        return a + b;
    }

    public double add(int a, double b, long c) {
        System.out.println("int + double + long, zwraca double");
        return a + b + c;
    }

    public long add(long a, int... others) {
        System.out.println("Zwraca long, ale przyjmuje longa i inty i może mieć milion parametrów");
        for (int other : others) {
            a += other;
        }
        return a;
    }


}

/*
Napisz program składający się z dwóch klas. Pierwsza niech zawiera kilka metod o nazwie add(), ale zwracających różne typy wyników i przyjmujących
po minimum dwa parametry typów liczbowych wybranych przez Ciebie. Ich zadaniem jest zwrócenie, lub wyświetlanie sumy podanych argumentów.
W drugiej klasie testowej utwórz obiekt tej klasy i sprawdź działanie swoich metod, wyświetlając wyniki działań na ekranie.
Dodatkowo każda z metod niech wyświetla swój typ zwracany i rodzaj argumentów, abyś wiedział, która z nich zadziałała.

 */