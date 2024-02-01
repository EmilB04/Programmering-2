package no.hiof.emilbe.inheritance.models;

public class BusDriver extends Person{
    private String route;

    public BusDriver(String firstName, String lastName, int age, String route){
        super(firstName, lastName, age);
        this.route = route;
    }

    public String getRoute(){
        return route;
    }
    public void setRoute(String route){
        this.route = route;
    }
}
