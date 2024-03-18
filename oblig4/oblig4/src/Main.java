//import models.CelestialBody;
import models.Planet;
import models.Star;
import tools.StarCSVFileHandler;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Star sun = new Star("Sun", 1.0, 1.0, 5778);
        Star alphaCentauri = new Star("Alpha Centauri", 1.227, 1.1, 5790);
        Star sirius = new Star("Sirius", 1.711, 2.02, 9940);

        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4, 0.387, 0.206, 88 , sun);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859, 0.723, 0.007, 225 , sun);
        Planet earth = new Planet("Earth", 0.08911486599899289, 0.003146469968387777, 1.0, 0.017, 365, sun);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4, 1.524, 0.093, 687 , sun);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0, 5.20440, 0.049, 4380 , sun);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275, 9.5826, 0.057, 10585 , sun);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773, 19.2184, 0.046, 30660 , sun);
        Planet neptune = new Planet("Neptune", 0.34440217087226543, 0.05395152792413066, 30.11, 0.010, 60225, sun);

        //PlanetSystem solarSystem = new PlanetSystem("The Milkyway", sun, planets);
        ArrayList<Planet> planets = new ArrayList<>(); // Create an empty list for celestial bodies

        planets.add(mercury);
        planets.add(venus);
        planets.add(earth);
        planets.add(mars);
        planets.add(jupiter);
        planets.add(saturn);
        planets.add(uranus);
        planets.add(neptune);

        ArrayList<Star> stars = new ArrayList<>();
        stars.add(sun);
        stars.add(alphaCentauri);
        stars.add(sirius);



        // Sorter planetene basert på massen ved hjelp av Collections.sort() og compareTo-metoden
        Collections.sort(planets);
        // Skriv ut de sorterte planetene
        System.out.println("Sorted planets based on mass:");
        for (Planet planet : planets) {
            System.out.println(planet.getName() + " - Mass: " + planet.getMassInKilograms());
        }

        // Sorter stjernene basert på radius ved hjelp av Collections.sort() og compareTo-metoden
        Collections.sort(stars);
        // Skriv ut de sorterte stjernene
        System.out.println("\nSorted stars based on radius:");
        for (Star star : stars) {
            System.out.println(star.getName() + " - Radius: " + star.getRadiusInKilometers());
        }


        //----------------------------------
        // ---------- Oppgave 2.2 ----------
        //----------------------------------

        // Skriv stjernene til en CSV-fil
        StarCSVFileHandler starCSVFileHandler = new StarCSVFileHandler();
        starCSVFileHandler.writeObjectsToFile("stars.csv", stars);

        // Les stjernene fra CSV-fil
        ArrayList<Star> starsFromFile = (ArrayList<Star>) starCSVFileHandler.readObjectsFromFile("stars.csv");
        System.out.println("\nStars from file:");
        for (Star starX : starsFromFile) {
            System.out.println(starX.getName() + " - Radius: " + starX.getRadiusInKilometers());
        }
    }
}   
