package main.java.pl.pwlctk.kurs05.hometasks.queue4_1.Main;

import main.java.pl.pwlctk.kurs05.hometasks.queue4_1.FIFOQueue;
import main.java.pl.pwlctk.kurs05.hometasks.queue4_1.LIFOQueue;
import main.java.pl.pwlctk.kurs05.hometasks.queue4_1.Queue;

public class MainQueue {
    public static void main(String[] args) {
        System.out.println("Stos (LIFO): ");
        Queue lifo = new LIFOQueue(20);
        lifo.pop();
        lifo.push(1);
        lifo.push(2);
        lifo.push(3);
        lifo.push(4);
        lifo.push(5);
        System.out.println(lifo);
        lifo.push(6);
        System.out.println("Pobrano element ze stosu: " + lifo.pop());
        lifo.push(7);
        System.out.println(lifo);

        System.out.println("\nKolejka (FIFO): ");
        Queue fifo = new FIFOQueue(10);
        fifo.pop();
        fifo.push(1);
        System.out.println("Pobrano element z kolejki: " + fifo.pop());
        fifo.push(2);
        fifo.push(3);
        fifo.push(4);
        System.out.println(fifo);
        fifo.push(5);

        System.out.println("Pobrano element z kolejki: " + fifo.pop());
        fifo.push(6);
        fifo.push(7);
        fifo.push(8);
        fifo.push(9);
        System.out.println(fifo);
        System.out.println("Pobrano element z kolejki: " + fifo.pop());
        System.out.println("Pobrano element z kolejki: " + fifo.pop());
        System.out.println("Pobrano element z kolejki: " + fifo.pop());
        fifo.push(10);
        fifo.push(11);
        fifo.push(12);
        System.out.println(fifo);
    }
}