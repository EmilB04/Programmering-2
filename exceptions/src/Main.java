import java.io.FileWriter;
import java.io.IOException;

public class Main{
    public static void main(String[] args) {
        simpleFileWriting("textFile.txt");
    }

    public static void simpleFileWriting(String fileName) {
        try {
            FileWriter fileWriter = new FileWriter(fileName);

            fileWriter.append("something..");

            fileWriter.close();
        }

        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}