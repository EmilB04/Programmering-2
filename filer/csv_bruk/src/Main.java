import models.SuperHero;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<SuperHero> superHeroes = new ArrayList<SuperHero>();
        superHeroes.add(new SuperHero("Batman", "Bruce Wayne"));
        superHeroes.add(new SuperHero("Superman", "Clark Kent"));
        superHeroes.add(new SuperHero("Wonder Woman", "Diana Prince"));
    }
}