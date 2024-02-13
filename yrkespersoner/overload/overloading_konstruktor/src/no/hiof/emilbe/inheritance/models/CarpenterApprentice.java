package no.hiof.emilbe.inheritance.models;

public class CarpenterApprentice extends Carpenter{
    private String trainingPeriod;

    public CarpenterApprentice(String firstName, String lastName, int age, int housesBuilt, String trainingPeriod) {
        super(firstName, lastName, age, housesBuilt);
        this.trainingPeriod = trainingPeriod;
    }
    @Override
    public String toString() {
        return "Carpenter apprentice " + firstName + " " + lastName + " has built " + housesBuilt + " houses." + " He is " + age + " years old." + " He is in training period " + trainingPeriod;
    }

    public String getTrainingPeriod(){
        return trainingPeriod;
    }
    

}
