package models;

public class Star extends CelestialBody{
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
}
