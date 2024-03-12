import models.SuperHero;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.io.FileWriter;

public class Main {
    public static void main(String[] args) {
        ArrayList<SuperHero> superHeroes = new ArrayList<SuperHero>();
        superHeroes.add(new SuperHero("Batman", "Bruce Wayne"));
        superHeroes.add(new SuperHero("Superman", "Clark Kent"));
        superHeroes.add(new SuperHero("Wonder Woman", "Diana Prince"));

        writeCSV(superHeroes, "superheroes.csv");
        readCSV("superheroes.csv");
        ArrayList<SuperHero> superHeroesFromCSV = readCSV("superheroes.csv");

        for (SuperHero superHeroX : superHeroesFromCSV) {
            System.out.println(superHeroX.getName() + "'s secret identity is " + superHeroX.getSecretIdentity());
        }
    }

    public static void writeCSV(ArrayList<SuperHero> superHeroes, String filename) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename))) {
            // Write the superHeroes to a CSV file
            for (SuperHero superHeroX : superHeroes) {
                bufferedWriter.write(superHeroX.getName() + ";" + superHeroX.getSecretIdentity() + "\n");
            
            }
        } 
        catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    public static ArrayList<SuperHero> readCSV(String filename) {
        ArrayList<SuperHero> superHeroesFromCSV = new ArrayList<SuperHero>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));) {
            String line;
            while ( (line = bufferedReader.readLine()) != null) {
                String[] values = line.split(";");
                SuperHero superHeroX = new SuperHero(values[0], values[1]);


                superHeroesFromCSV.add(superHeroX);
            }


        }
        catch (FileNotFoundException e) {
            System.err.println("File not found: " + e.getMessage());
        }
        catch (IOException e) {
            System.err.println("Error reading from file: " + e.getMessage());
        }

        return superHeroesFromCSV;
    }    
}
