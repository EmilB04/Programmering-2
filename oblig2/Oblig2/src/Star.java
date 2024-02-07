public class Star {
    private String name;
    private double radius;
    private double mass;
    private double effectiveTemp;

    public Star(String name, double radius, double mass, double effectiveTemp) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
        this.effectiveTemp = effectiveTemp;
    }
    @Override
    public String toString() {
        return "Stjernen " + name + " har en radius på " + getRadiusInKilometers() + " km." + ", en masse på " + getMassInKilograms() + " kg." + 
        " og en effektiv temperatur på " + effectiveTemp + " K.";
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
    public double getEffectiveTemp() {
        return effectiveTemp;
    }

    public double getRadiusInKilometers() {
        double rsun = 695700;
        return radius * rsun; // 1 Rsun = 695700 km
    }
    public double getMassInKilograms() {
        double msun = 1.98892e30;
        return mass * msun; // 1 Msun = 1.98892E30 kg
    }
}
