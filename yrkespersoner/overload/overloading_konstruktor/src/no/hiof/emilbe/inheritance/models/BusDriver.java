package no.hiof.emilbe.inheritance.models;

public class BusDriver extends Person{
    private String route = "Not Assigned";

    public BusDriver(String firstName, String lastName, int age) {
        super(firstName, lastName, age);
    }

    public BusDriver(String firstName, String lastName, int age, String route){
        super(firstName, lastName, age);
        this.route = route;
    }
    @Override
    public String toString() {
        return "Bus driver " + firstName + " " + lastName + " drives route " + route + "." + " He is " + age + " years old.";
    }

    public String getRoute(){
        return route;
    }
    public void setRoute(String route){
        this.route = route;
    }
}
