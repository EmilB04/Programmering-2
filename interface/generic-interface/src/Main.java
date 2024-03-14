import tools.StringFileHandler;

public class Main {
    public static void main(String[] args) {
        StringFileHandler stringFileHandler = new StringFileHandler();
        stringFileHandler.writeToFile("text.txt", "Noe interessant...");
        System.out.println(stringFileHandler.readFromFile("text.txt"));
    }
}
