package models;

public class Planet extends CelestialBody{

    // Arver fra CelestialBody
    public Planet(String name, double radius, double mass) {
        super(name, radius, mass);
    }

    @Override
    public String toString() {
        return "Planeten " + name + " har en radius på " + getRadiusInKilometers() + " km" + " og en masse på " + getMassInKilograms() + " kg.";
    }

    
    // Spesifikk metode for planeter

    public double getSurfaceGravity() {
        double G = 6.67408e-11;
        double M = getMassInKilograms();
        double R = getRadiusInKilometers();
        G = G * M / (R * R);
        return G;
    }
}
