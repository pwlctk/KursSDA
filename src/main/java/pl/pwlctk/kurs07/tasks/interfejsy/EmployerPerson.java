package main.java.pl.pwlctk.kurs07.tasks.interfejsy;

public class EmployerPerson extends CommonPerson implements Company {
    private String companyName;

    public EmployerPerson(String firstName, String lastName, String companyName) {
        super(firstName, lastName);
        this.companyName = companyName;
    }

    @Override
    public String getCompany() {
        return "Firma: " + companyName;
    }

    @Override
    public String toString() {
        return "First Name: " + firstName() + "\n" +
                "Last Name: " + lastName() + "\n" +
                "Company: " + companyName;
    }
}
