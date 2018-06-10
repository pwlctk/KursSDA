package main.java.pl.pwlctk.kurs07.tasks.interfejsy.additionaltask;

public class Backward implements CharSequence {
    private String word;

    public Backward(String word) {
        this.word = word;
    }

    @Override
    public int length() {
        return word.length();
    }

    @Override
    public char charAt(int index) {

        return word.charAt(word.length() - index - 1);
    }

    @Override
    public CharSequence subSequence(int start, int end) {
        StringBuilder newWord = new StringBuilder();
        for (int i = end; i >= start; i--) {
            newWord.append(word.charAt(i));
        }
        return newWord;
    }

    @Override
    public String toString() {
        return subSequence(0, word.length() - 1).toString();
    }
}
