package models;

import java.util.List;

public abstract class PlanetSystem implements Comparable<PlanetSystem> {
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

    @Override
    public int compareTo(PlanetSystem other) {
        return this.getName().compareTo(other.getName());
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

    // Oblig 3 - Oppgave 2.2 - Navn
    public Planet getPlanetByName(String name) {
        boolean foundPlanet = false;
        for (Planet planetX : planets) {
            if (planetX.getName().equals(name)) {
                foundPlanet = true;
                return planetX; // Returner planeten hvis navnet matcher
            }
        }
        if (foundPlanet == false) {
            System.out.println("Fant ingen planeter med navn " + "'" + name + "'");
        }
        return null;
    }



}