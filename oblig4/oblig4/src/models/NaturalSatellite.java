package models;

public abstract class NaturalSatellite extends CelestialBody {
    private final double semiMajorAxis; // Avstand
    private final double eccentricity; // Et desimal mellom 0 og 1
    private final double orbitalPeriod; // Dager
    private final CelestialBody centralCelestialBody; // Hvilken planet/måne går denne rundt

    public NaturalSatellite(String name, double radius, double mass, double semiMajorAxis, double eccentricity,
        double orbitalPeriod, CelestialBody centralCelestialBody) {
        super(name, radius, mass);
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }

    // Getters
    public double getSemiMajorAxis() {
        return semiMajorAxis;
    }

    public double getEccentricity() {
        return eccentricity;
    }

    public double getOrbitalPeriod() {
        return orbitalPeriod;
    }

    public CelestialBody getCentralCelestialBody() {
        return centralCelestialBody;
    }

}
