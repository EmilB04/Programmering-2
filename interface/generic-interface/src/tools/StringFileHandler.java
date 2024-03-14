package tools;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import interfaces.FileHandler;

public class StringFileHandler implements FileHandler<String>{
    
    @Override
    public void writeToFile(String fileName, String content) {
        try(BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName))) {
            bufferedWriter.write(content);
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
            //e.printStackTrace();
        }
    }
    @Override
    public String readFromFile(String fileName) {
        String contentFromFile = "";
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                contentFromFile += line + "\n";
            }
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        return contentFromFile;
    }
}
