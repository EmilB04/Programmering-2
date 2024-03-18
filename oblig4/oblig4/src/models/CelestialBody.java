package models;

/*
CelestialBody
│
├── Star
│
└── NaturalSatellite
    │
    └── Planet
 */

public abstract class CelestialBody implements Comparable<CelestialBody> {
    protected final String name;
    protected final double radius;
    protected final double mass;

    public CelestialBody(String name, double radius, double mass) {
        this.name = name;
        this.radius = radius;
        this.mass = mass;
    }

    @Override
    public int compareTo(CelestialBody other) {
        return Double.compare(this.radius, other.radius);
    }



    // Metoder som brukes av både planeter og stjerner

    public String getName() {
        return name;
    }

    // Abstrakte metoder som må implementeres av subklasser
    public abstract double getMassInKilograms();
    public abstract double getRadiusInKilometers();


}
