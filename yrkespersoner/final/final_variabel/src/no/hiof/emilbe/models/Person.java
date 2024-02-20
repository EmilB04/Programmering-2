package no.hiof.emilbe.models;

public class Person {
    //private final String birthNumber = "12345678910";
    private final String birthNumber;

    public Person(String birthNumber) {
        this.birthNumber = birthNumber;
    }

    /*public Person() {
        this.birthNumber = "12345678910";
    }*/

    public String getBirthNumber() {
        return birthNumber;
    }

    //Går ikke å endre på birthNumber
    /*public void setBirthNumber(String birthNumber) {
        this.birthNumber = birthNumber;
    }*/

}