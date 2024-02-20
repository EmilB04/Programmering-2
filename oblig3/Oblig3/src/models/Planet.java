package models;

public class Planet extends NaturalSatellite {
    private final static double RJUP_IN_KM = 71492e3;
    private final static double MJUP_IN_KG = 1.898e27;

    public Planet(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod, Star centralCelestialBody) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
    }

    @Override
    public String toString() {
        return "Planeten " + name + " har en radius på " + getRadiusInKilometers() + " km" + " og en masse på " + getMassInKilograms() + " kg.";
    }

    
    // Spesifikk metoder for planeter
    public double getSurfaceGravity() {
        double G = 6.67408e-11;
        double M = getMassInKilograms();
        double R = getRadiusInKilometers();
        G = G * M / (R * R);
        return G;
    }

    public double getRadiusInKilometers() {
        return radius * RJUP_IN_KM; // 1 Rjup = 71492E3 km
    }
    public double getMassInKilograms() {
        return mass * MJUP_IN_KG; // 1 Mjup = 1.898E27 kg
    }
}
