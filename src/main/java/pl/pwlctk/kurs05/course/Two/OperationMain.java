package main.java.pl.pwlctk.kurs05.course.Two;

public class OperationMain {
    public static void main(String[] args) {
        Operation operation = new Operation();

        long sum = operation.add(1000, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20);
        System.out.println(sum);
        System.out.println();

        double sum2 = operation.add(100, 10.57777, 100000);
        System.out.println(sum2);
        System.out.println();

        short miniSum = operation.add(100000000, (byte) 10);
        System.out.println(miniSum);

        System.out.println(operation.getClass());

    }


}


