import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;

import models.SuperHero;

public class App {
    public static void Main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        SuperHero batman = new SuperHero("Batman", "Bruce Wayne");
        batman.getSideKicks().add(new SuperHero("Robin", "Jason Todd"));
        batman.getSideKicks().add(new SuperHero("Batgirl", "Barbara Gordon"));

        File file = new File("superheroes.json");
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, batman);
        } 
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
