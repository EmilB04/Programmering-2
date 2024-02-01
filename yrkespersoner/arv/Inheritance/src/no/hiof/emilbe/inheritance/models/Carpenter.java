package no.hiof.emilbe.inheritance.models;

public class Carpenter extends Person{
    //fornavn, etternavn, alder, antall hus bygd
    private int housesBuilt;

    public Carpenter(String firstName, String lastName, int age, int housesBuilt) {
        super(firstName, lastName, age);
        this.housesBuilt = housesBuilt;
    }
    public int getHousesBuilt(){
        return housesBuilt;
    }
}
