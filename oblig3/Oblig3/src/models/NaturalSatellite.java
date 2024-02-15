package models;

public class NaturalSatellite {
    private double semiMajorAxis;
    private double eccentricity;
    private double orbitalPeriod;
    private CelestialBody centralCelestialBody; //Hvilken planet/måne går denne rundt



    public NaturalSatellite(double semiMajorAxis, double eccentricity, double orbitalPeriod, CelestialBody centralCelestialBody) {
        this.semiMajorAxis = semiMajorAxis;
        this.eccentricity = eccentricity;
        this.orbitalPeriod = orbitalPeriod;
        this.centralCelestialBody = centralCelestialBody;
    }

    // Gettere og settere
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

    public void setSemiMajorAxis(double semiMajorAxis) {
        this.semiMajorAxis = semiMajorAxis;
    }
    public void setEccentricity(double eccentricity) {
        this.eccentricity = eccentricity;
    }
    public void setOrbitalPeriod(double orbitalPeriod) {
        this.orbitalPeriod = orbitalPeriod;
    }
    public void setCentralCelestialBody(CelestialBody centralCelestialBody) {
        this.centralCelestialBody = centralCelestialBody;
    }



}
