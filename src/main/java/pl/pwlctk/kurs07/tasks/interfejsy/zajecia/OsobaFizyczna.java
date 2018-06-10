package main.java.pl.pwlctk.kurs07.tasks.interfejsy.zajecia;

/**
 * Created by pwykowski
 */
public class OsobaFizyczna implements EmployerNew, Employer {

    private String firstName;
    private String lastName;

    public OsobaFizyczna(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void metoda() {
        System.out.println("Testujemy");
    }


    @Override
    public float getValueTax() {
        return 1000f;
    }

    @Override
    public String getCompanyName() {
        return firstName + " " + lastName;
    }
}
