import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Planet mercury = new Planet("Mercury", 0.03412549655905556, 1.7297154899894627E-4);
        Planet venus = new Planet("Venus", 0.08465003077267387, 0.002564278187565859);
        Planet earth = new Planet("Earth", 0.08911486599899289, 5.972e24);
        Planet mars = new Planet("Mars", 0.04741089912158004, 3.3667017913593256E-4);
        Planet jupiter = new Planet("Jupiter", 1.0, 1.0);
        Planet saturn = new Planet("Saturn", 0.8145247020645666, 0.2994204425711275);
        Planet uranus = new Planet("Uranus", 0.35475297935433336, 0.04573761854583773);
        Planet neptune = new Planet("0.34440217087226543", 24622, 0.05395152792413066);
        Star sun = new Star("Sun", 1.0, 1.0, 5778);

        ArrayList<Planet> planets = new ArrayList<>(); //Oppretter en tom liste ment for planeter

        // Legger til planeter i listen
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

    }
}
