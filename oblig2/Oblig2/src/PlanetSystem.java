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