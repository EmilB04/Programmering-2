package interfaces;

// Generisk interface
public interface FileHandler<T> {
    void writeToFile(String fileName, T content);
    T readFromFile(String fileName);
}
