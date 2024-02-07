public class Planet {
    private String name;
    private double radius;
    private double mass;

    public Planet(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }
    @Override
    public String toString() {
        return "Planeten " + name + " har en radius på " + getRadiusInKilometers() + " km" + " og en masse på " + getMassInKilograms() + " kg.";
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
        double rjup = 71492e3;
        return radius * rjup; // 1 Rjup = 71492E3 km
    }
    public double getMassInKilograms() {
        double mjup = 1.898e27;
        return mass * mjup; // 1 Mjup = 1.898E27 kg
    }

    public double getSurfaceGravity() {
        double G = 6.67408e-11;
        double M = getMassInKilograms();
        double R = getRadiusInKilometers();
        G = G * M / (R * R);
        return G;
    }
}
