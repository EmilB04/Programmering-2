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

    // Return Surface gravity in m/s^2

    public double getSurfaceGravity() {
        double G = 6.67408e-11;
        double M = getMassInKilograms();
        double R = getRadiusInKilometers();
        return G * M / (R * R);
    }
}
