package main.java.pl.pwlctk.kurs07.tasks.interfejsy.zajecia;

/**
 * Created by pwykowski
 */
public class Corp extends Company implements Employer {

	public Corp(String companyName) {
		super(companyName);
	}

	@Override
	public String getCompanyName() {
		return companyName;
	}
}
