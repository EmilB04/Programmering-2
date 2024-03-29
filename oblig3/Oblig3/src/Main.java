//import models.CelestialBody;
import models.Planet;
import models.PlanetSystem;
import models.Star;
import java.util.ArrayList;

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
        // Oppgave 2.3 - ToString()

        // --------------------------------------- //
        // Skriv ut informasjon om solsystemet her //

        System.out.println("Info om solsystem:---------");
        System.out.println(solarSystem);
        System.out.println("---------------------------");

        // --------------------------------------- //
        // Skriv ut informasjon om planetene her //
        System.out.println();
        System.out.println("Info om planeter:---------");
        System.out.println(mercury);
        System.out.println(venus);
        System.out.println(earth);
        System.out.println(mars);
        System.out.println(jupiter);
        System.out.println(saturn);
        System.out.println(uranus);
        System.out.println(neptune);
        System.out.println("---------------------------");

        // --------------------------------------- //
        // Skriv ut informasjon om sola her //
        System.out.println();
        System.out.println("Info om stjerne:-----------");
        System.out.println(sun);
        System.out.println("---------------------------");


        // Oppgave 2.4 - Astronomiske begreper til matematiske uttrykk
        // Se <Planet.java>

        // ----------------------------------------- //
        // Skriv ut informasjon om vekt og masse her //
        System.out.println();
        System.out.println("Info om radius:------------");
        System.out.println("Venus radius: " + venus.getRadiusInKilometers() + " km");
        System.out.println("Venus mass: " + venus.getMassInKilograms() + " kg");
        System.out.println("---------------------------");

        // Oppgave 2.5 - Beregning av overflategravitasjon
        // Se <Planet.java>

        // ----------------------------------------- //
        // Skriv ut informasjon om gravitasjon her //
        System.out.println();
        System.out.println("Info om gravitasjon:-------");
        System.out.println("Saturn surface gravity: " + saturn.getSurfaceGravity() + " m/s^2");
        System.out.println("---------------------------");

        //------------------------------------------//
        // ---------  Oblig 3 starter her --------- //
        //------------------------------------------//

        // Oblig 3 - Oppgave 2.2 - Hent en planet med navn
        // Se <PlanetSystem.java>
        System.out.println();
        System.out.println("Henter planet med navn:----");
        System.out.println(solarSystem.getPlanetByName("Venus"));

        // Oblig 3 - Oppgave 2.6 - Avstand
        // Se <Planet.java>
        System.out.println();
        int[] distanceAngles = {0, 90, 180, 270, 360 };
        for (double angle : distanceAngles) {
            double distance = earth.getDistanceToCentralBody(angle);
            System.out.println("Distance between Earth and Sun at " + (int)angle + " degrees: " + (int)distance + " km.");
        }

        // Oblig 3 - Oppgave 2.7 - Hastighet
        // Se <Planet.java>
        System.out.println();
        int[] speedAngles = {0, 45, 90, 135, 180};
        for (double angle : speedAngles) {
            double distance = earth.getDistanceToCentralBody(angle);
            double velocity = earth.getOrbitingVelocity(distance);
            // begrens til 2 desimaler
            velocity = Math.round(velocity * 100.0) / 100.0;
            System.out.println("Velocity of Earth at " + (int)angle + " degrees: " + velocity + " km/s.");


            
        }
    }

    }   
