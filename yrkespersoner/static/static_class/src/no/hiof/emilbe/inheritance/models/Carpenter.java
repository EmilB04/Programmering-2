package no.hiof.emilbe.inheritance.models;

public class Carpenter extends Person{
    
    private static int numCarpenters = 0;
    protected int housesBuilt = 0;

    public Carpenter(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
        numCarpenters++;
    }

    public Carpenter(String firstName, String lastName, int age, int housesBuilt) {
        super(firstName, lastName, age);
        this.housesBuilt = housesBuilt;
        numCarpenters++;
    }
    public static int getNumCarpenters() {
        return numCarpenters;
    }
    
    public int getHousesBuilt(){
        return housesBuilt;
    }
    public void setHousesBuilt(int housesBuilt){
        this.housesBuilt = housesBuilt;
    }
    @Override
    public String toString() {
        return "Carpenter " + firstName + " " + lastName + " has built " + housesBuilt + " houses." + " He/She is " + age + " years old.";
    }
}
