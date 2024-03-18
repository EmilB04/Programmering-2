package interfaces;

import java.util.ArrayList;

// Oppgave 2.2 A - Genereic interface
public interface ObjectFileHandler<T>{
    public void writeObjectsToFile(String filename, ArrayList<T> objectsToWriteToFile);
    public ArrayList<T> readObjectsFromFile(String filename);
}
