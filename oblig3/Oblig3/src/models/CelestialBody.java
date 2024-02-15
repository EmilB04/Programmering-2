package models;

public class CelestialBody {
    // Feltene er protected slik at de kan aksesseres av subklassene
    protected String name;
    protected double radius;
    protected double mass;

    private static double RJUP_IN_KM = 71492e3;
    private static double MJUP_IN_KG = 1.898e27;

    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }
    // Metoder som brukes av både planeter og stjerner

    public String getName() {
        return name;
    }
    public double getRadius() {
        return radius;
    }
    public double getMass() {
        return mass;
    }

    
    public double getRadiusInKilometers() {
        return radius * RJUP_IN_KM; // 1 Rjup = 71492E3 km
    }
    public double getMassInKilograms() {
        return mass * MJUP_IN_KG; // 1 Mjup = 1.898E27 kg
    }


}
