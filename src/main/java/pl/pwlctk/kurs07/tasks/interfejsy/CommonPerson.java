package main.java.pl.pwlctk.kurs07.tasks.interfejsy;

public class CommonPerson implements Person{
    private String firstName;
    private String lastName;

    private String address;

    public CommonPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String firstName() {
        return firstName;
    }

    @Override
    public String lastName() {
        return lastName;
    }
}
