package main.java.pl.pwlctk.kurs07.tasks.interfejsy.zajecia;

/**
 * Created by pwykowski
 */
public class SklepOsiedlowy extends Company implements Employer {
    public SklepOsiedlowy(String companyName) {
        super(companyName);
    }

    @Override
    public String getCompanyName() {
        return companyName;
    }
}
