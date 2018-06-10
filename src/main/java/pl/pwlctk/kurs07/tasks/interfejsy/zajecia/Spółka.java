package main.java.pl.pwlctk.kurs07.tasks.interfejsy.zajecia;

/**
 * Created by pwykowski
 */
public class Spółka extends Company implements Employer {
	public Spółka(String companyName) {
		super(companyName);
	}

	@Override
	public String getCompanyName() {
		return null;
	}
}
