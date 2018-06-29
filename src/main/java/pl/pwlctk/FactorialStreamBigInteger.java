package main.java.pl.pwlctk;

import java.math.BigInteger;
import java.util.stream.Stream;

public class FactorialStreamBigInteger {
    static class Pair {
        final BigInteger num;
        final BigInteger value;

        Pair(BigInteger num, BigInteger value) {
            this.num = num;
            this.value = value;
        }
    }

    BigInteger factorial(BigInteger num) {
        Stream<Pair> allFactorials = Stream.iterate(new Pair(BigInteger.ONE, BigInteger.ONE),
                x -> new Pair(x.num.add(BigInteger.ONE), x.value.multiply(x.num.add(BigInteger.ONE))));
        return allFactorials.filter((x) -> x.num.equals(num)).findAny().get().value;
    }

    public static void main(String[] args) {
        FactorialStreamBigInteger program = new FactorialStreamBigInteger();
        long startTime = System.currentTimeMillis();
        BigInteger factorial = program.factorial(new BigInteger("500000"));
        long endTime = System.currentTimeMillis();
        long duration = (endTime - startTime);
        System.out.println("Silnia: " + factorial.toString());
        System.out.println("Czas: " + duration);
    }
}