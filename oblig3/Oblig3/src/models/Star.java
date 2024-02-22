package models;

public class Star extends CelestialBody{
    private final static double RSUN_IN_KM = 695700;
    private final static double MSUN_IN_KG = 1.989e30;
    private double effectiveTemp;

    // Arver fra CelestialBody
    public Star(String name, double radius, double mass, double effectiveTemp) {
        super(name, radius, mass);   
        this.effectiveTemp = effectiveTemp;
    }


    @Override
    public String toString() {
        return "Stjernen " + name + " har en radius på " + getRadiusInKilometers() + " km." + ", en masse på " + getMassInKilograms() + " kg." + 
        " og en effektiv temperatur på " + effectiveTemp + " K.";
    }
    
    // Spesifikk metode for stjerner
    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    // Abstrakte metoder fra CelestialBody
    public double getRadiusInKilometers() {
        return radius * RSUN_IN_KM; 
    }
    public double getMassInKilograms() {
        return mass * MSUN_IN_KG; 
    }
}