package main.java.pl.pwlctk.kurs03.hometasks.List3_5;

public class List {
    protected int[] numbers;
    protected int capacity;
    protected int size;

    public List(int capacity) {
        this.numbers = new int[capacity];
        this.capacity = capacity;
        this.size = 0;
    }

    protected void enlarge() {
        capacity += (int) (capacity * 0.25);
        int[] temp = numbers;
        numbers = new int[capacity];
        System.arraycopy(temp, 0, numbers, 0, size);
    }

    public void add(int number) {
        if (size == capacity) {
            enlarge();
        }
        numbers[size] = number;
        size++;

    }

    public int get(int index) throws BestException {
        if (index < size && index > -1) {
            return numbers[index];
        } else if (index >= size && index < capacity) {
            throw new BestException("Nie ma takiego indeksu na liście!");
        } else {
            throw new BestException("Indeks poza zasięgiem!");
        }
    }


    public void remove() {
        numbers[size - 1] = 0;
        size--;
    }

    public void print() {
        if (size != 0) {
            for (int i = 0; i < size; i++) {
                System.out.print(numbers[i] + " ");
            }
            System.out.println();
        }
    }

    public int getCapacity() {
        return numbers.length;
    }

    public int getSize() {
        return size;
    }
}









/*

Napisz klasę PersonList (lista), która przechowywać będzie liczby całkowite. Klasa powinna mieć 3 pola prywatne:

`int[] numbers` przechowuje liczby
`int capacity` maksymalny rozmiar
`int size` aktualny rozmiar (domyślnie 0)Oraz metody:
`void add(int number)` która będzie dodawać kolejną liczbę na tablicy `numbers`
`int get(int index)` która zwróci liczbę pod indeksem
`void print()` która wypisze wszystkie elementy (tylko dodane przez add)Klasa powinna mieć jeden konstruktor ustawiający wartość pola `capacity` oraz inicjalizujaca tablicę `numbers` zadanym rozmiarem:

`PersonList(int capacity)`Wymagania:
- jeśli użytkownik chce dodać do pełnej tablicy (metoda `add`)  (`size == capacity` powinien dostać informacje: Lista pełna
- jeśli użytkownik poda indeks większy niż `capacity` w metodzie `get` powinien dostać informację: Poza zasięgiem lub jeśli większe od `size`: Nie ma takiego indeksu. W obu przypadkach powinna zwrócić -1
- metoda `print` powinna pisać tylko do wartości `size`*Przykład*



```PersonList list = new PersonList(5);
list.print(); // nic nie wypisze
list.add(10);
list.add(5);
list.print(); // wypisze 10 5
System.out.println(list.get(0)); // 10
System.out.println(list.get(1)); // 5
System.out.println(list.get(3)); // Nie ma takiego indeksu -1```

 */
