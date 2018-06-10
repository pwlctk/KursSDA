package main.java.pl.pwlctk.kurs07.tasks.interfejsy.additionaltask;

public class Main {
    public static void main(String[] args) throws Exception {
        String word = "Informatyka";
        Backward task = new Backward(word);

        System.out.println(word);
        System.out.println(task.charAt(0));
        System.out.println(task.subSequence(3, 7));
        System.out.println(task);

    }
}
