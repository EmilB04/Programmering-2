package models;

import java.util.List;

public class PlanetSystem {
    private String name;
    private Star centerStar;      //Henter stjerne fra Star.java
    private List<Planet> planets; //forventer en list med planeter 

    public PlanetSystem(String name, Star centerStar, List<Planet> planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }
    @Override
    public String toString() {
        return ("Solsystemet " + name + " har " + planets.size() + " planeter og en stjerne som heter " + centerStar.getName() + ".");
    }

    public String getName() {
        return name;
    }

    public Star getCenterStar() {
        return centerStar;
    }

    public List<Planet> getPlanets() {
        return planets;
    }
}