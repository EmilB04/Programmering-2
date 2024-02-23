package models;

public class Planet extends NaturalSatellite {
    private final static double RJUP_IN_KM = 71492e3;
    private final static double MJUP_IN_KG = 1.898e27;
    private static final double AU_TO_KM = 149597871.0; // konsant

    public Planet(String name, double radius, double mass, double semiMajorAxis, double eccentricity, double orbitalPeriod, Star centralCelestialBody) {
        super(name, radius, mass, semiMajorAxis, eccentricity, orbitalPeriod, centralCelestialBody);
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

    // Abstrakte metoder fra CelestialBody
    public double getRadiusInKilometers() {
        return radius * RJUP_IN_KM; // 1 Rjup = 71492E3 km
    }
    public double getMassInKilograms() {
        return mass * MJUP_IN_KG; // 1 Mjup = 1.898E27 kg
    }
    // Metode for å regne ut avstand til sentrallegemet
    public double getDistanceToCentralBody(double degrees) {
        // Konverterer fra grader til radianer, ettersom Math.cos() tar inn radianer
        double theta = Math.toRadians(degrees);

        //---------------------------
        // Øvre del av formel
        double oneMinusEccentricitySquared = 1 - Math.pow(getEccentricity(), 2);
        // Nedre del av formel
        double onePlusEccentricityCosTheta = 1 + getEccentricity() * Math.cos(theta);
        // Selve formel
        double r = getSemiMajorAxis() * (oneMinusEccentricitySquared) / (onePlusEccentricityCosTheta);
        //---------------------------


        // konverterer fra AU til km og returnerer
        double distanceInKm = r * AU_TO_KM;
        return distanceInKm;
    }

    // Metode for å finne hastighet til en naturlig satellitt
    public double getOrbitingVelocity(double distance) {
        double r = distance * 1000; // Convert distance from km to meters
        double G = 6.67408e-11;
        double M = getCentralCelestialBody().getMassInKilograms();

        // selve formel
        double velocity = Math.sqrt(G * M / r);

        // Omgjør fra m/s til km/s
        velocity /= 1000;

        return velocity;
    }
}
