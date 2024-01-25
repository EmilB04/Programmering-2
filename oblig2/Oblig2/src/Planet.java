public class Planet {
    private String name;
    private double radius;
    private double mass;

    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

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
        return radius * 71492; // 1 Rjup = 71492 km
    }
    public double getMassInKilograms() {
        return mass * 1.898e27; // 1 Mjup = 1.898E27 kg
    }


}
