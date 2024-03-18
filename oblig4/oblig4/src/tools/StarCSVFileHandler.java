package tools;

import models.Star;
import interfaces.ObjectFileHandler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

// Oppgave 2.2 B - Klasse for filhåndtering av Star-objekter

public class StarCSVFileHandler implements ObjectFileHandler<Star>{
    private final String SKILLETEGN = ";";

    @Override
    public void writeObjectsToFile(String fileName, ArrayList<Star> objectsToWriteToFile) {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, false))) { // Append = False
            for (Star starX : objectsToWriteToFile) {
                bufferedWriter.write(starX.getName() + SKILLETEGN + starX.getRadius() + SKILLETEGN + starX.getMass() + SKILLETEGN + starX.getEffectiveTemp() + "\n");
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public ArrayList<Star> readObjectsFromFile(String fileName) {
        ArrayList<Star> stars = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] starData = line.split(SKILLETEGN);
                stars.add(new Star(starData[0], Double.parseDouble(starData[1]), Double.parseDouble(starData[2]), Double.parseDouble(starData[3])));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stars;
    }
}
