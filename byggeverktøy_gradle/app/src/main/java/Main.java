import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.xml.XmlMapper;

import java.io.File;
import models.SuperHero;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        SuperHero batman = new SuperHero("Batman", "Bruce Wayne");
        batman.getSideKicks().add(new SuperHero("Robin", "Jason Todd"));
        batman.getSideKicks().add(new SuperHero("Batgirl", "Barbara Gordon"));

        File file = new File("superheroes.json");
        try {
            objectMapper.writerWithDefaultPrettyPrinter().writeValue(file, batman);
            SuperHero superHeroFromJSON = objectMapper.readValue(file, SuperHero.class);
            System.out.println(superHeroFromJSON.getName());
        } 
        catch (Exception e) {
            e.printStackTrace();
        }


        XmlMapper xmlMapper = new XmlMapper();
        File xmlFile = new File("superheroes.xml");
        try {
            xmlMapper.writerWithDefaultPrettyPrinter().writeValue(xmlFile, batman);
            SuperHero superHeroFromXML = xmlMapper.readValue(xmlFile, SuperHero.class);
            System.out.println(superHeroFromXML.getName());
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
