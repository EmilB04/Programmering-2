package interfaces;

public interface FileHandler {
    void writeToFile(String fileName, String content);
    String readFromFile(String fileName);
}
