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
        return radius * 695700; // 1 Rsun = 695700 km
    }
    public double getMassInKilograms() {
        return mass * 1.98892e30; // 1 Msun = 1.98892E30 kg
    }
}
