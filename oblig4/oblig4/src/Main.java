//import models.CelestialBody;
import models.Planet;
import models.PlanetSystem;
import models.Star;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Star sun = new Star("Sun", 1.0, 1.0, 5778);

        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88 , sun);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225 , sun);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1.0, 0.017, 365, sun);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687 , sun);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049, 4380 , sun);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585 , sun);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 19.2184, 0.046, 30660 , sun);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225, sun);

        ArrayList<Planet> planets = new ArrayList<>(); // Create an empty list for celestial bodies

        // Add celestial bodies to the list
        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);

        PlanetSystem solarSystem = new PlanetSystem("The Milkyway", sun, planets);


        // Sortering av planeter basert på radius - CelesialBody implementerer Comparable
        // Oppgave 2.1

        System.out.println("Planetenes radius før sortering:");
        for (Planet PlanetX : solarSystem.getPlanets()) {
            System.out.println(PlanetX.getRadiusInKilometers());
        }

        // Metoden som sorterer planetene
        Collections.sort(planets);
        System.out.println("");

        System.out.println("Planetenes radius etter sortering:");
        for (Planet PlanetX : solarSystem.getPlanets()) {
            System.out.println(PlanetX.getRadiusInKilometers());
        }

        // Sortering av planeter basert på 
    }

    }   
