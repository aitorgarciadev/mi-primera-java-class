package main.java.dev.aitor;

public class Person {

    private String firstName;
    private String lastName;
    private String idNumber;
    private int birthYear;
    private String birthCountry;
    private char gender;

    public Person(String firstName, String lastName, String idNumber, int birthYear, String birthCountry, char gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = idNumber;
        this.birthYear = birthYear;
        this.birthCountry = birthCountry;
        this.gender = gender;
    

    }

    public void printAttributes() {
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("ID Number: " + idNumber);
        System.out.println("Birth Year: " + birthYear);
        System.out.println("Birth Country: " + birthCountry);
        System.out.println("Gender: " + gender);
        
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getIdNumber() {
        return idNumber;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public String getBirthCountry() {
        return birthCountry;
    }

    public char getGender() {
        return gender;
    }

    
}