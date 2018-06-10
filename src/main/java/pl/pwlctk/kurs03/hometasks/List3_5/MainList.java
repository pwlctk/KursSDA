package main.java.pl.pwlctk.kurs03.hometasks.List3_5;

public class MainList {
    public static void main(String[] args) {

//
//        for (int i = 1; i < 101; i++) {
//            list.add(i);
//        }
//        list.print();
//        System.out.println("Pojemność listy: " + list.getCapacity());
//        System.out.println("Liczba elementów: " + list.getSize());
//
//        System.out.println("\nDodajemy kolejny element: 101");
//        list.add(101);
//        list.print();
//        System.out.println("Pojemność listy: " + list.getCapacity());
//        System.out.println("Liczba elementów: " + list.getSize());
//
//
//        System.out.println();
//        System.out.println("FirstList");
//        List firstList = new FirstList(5);
//        firstList.add(1);
//        firstList.add(2);
//        firstList.add(3);
//        firstList.add(4);
//        firstList.add(5);
//        firstList.print();
//        System.out.println(firstList.getCapacity());
//        firstList.add(6);
//        firstList.print();
//        System.out.println(firstList.getCapacity());
//        System.out.println();
//
//
//
//        System.out.println("LottoList");
//        List lottoList = new LottoList(5);
//
//        lottoList.add(50);
//        lottoList.add(35);
//        lottoList.add(49);
//        lottoList.add(-1);
//        lottoList.print();


        List list = new List(10);

        try {
            System.out.println(list.get(4));
        } catch (BestException be) {
            System.out.println(be.getMessage());
        }
    }
}
