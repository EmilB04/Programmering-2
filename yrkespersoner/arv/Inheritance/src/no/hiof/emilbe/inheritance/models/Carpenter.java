package no.hiof.emilbe.inheritance.models;

public class Carpenter extends Person{
    protected int housesBuilt;

    public Carpenter(String firstName, String lastName, int age, int housesBuilt) {
        super(firstName, lastName, age);
        this.housesBuilt = housesBuilt;
    }
    
    public int getHousesBuilt(){
        return housesBuilt;
    }
    public void setHousesBuilt(int housesBuilt){
        this.housesBuilt = housesBuilt;
    }
    @Override
    public String toString() {
        return "Carpenter " + firstName + " " + lastName + " has built " + housesBuilt + " houses." + " He is " + age + " years old.";
    }
}
