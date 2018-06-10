package main.java.pl.pwlctk.kurs07.tasks.interfejsy.zajecia;

/**
 * Created by pwykowski
 */
public class Spolka extends Company implements Employer {
    public Spolka(String companyName) {
        super(companyName);
    }

    @Override
    public String getCompanyName() {
        return null;
    }
}
