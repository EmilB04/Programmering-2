public class PlanetSystem {
    private String name;
    private String centerStar;
    private Planet[] planets;

    public PlanetSystem(String name, String centerStar, Planet[] planets) {
        this.name = name;
        this.centerStar = centerStar;
        this.planets = planets;
    }

    public String getName() {
        return name;
    }

    public String getCenterStar() {
        return centerStar;
    }

    public Planet[] getPlanets() {
            return planets;
    }
}