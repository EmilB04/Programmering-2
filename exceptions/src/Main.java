import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) {
        //simpleFileWriting("textFile.txt");
        fileWritingFromInput("fileWritingFromInput.txt");
    }

    public static void fileWritingFromInput(String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, true);
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));){

            while (true) {
                System.out.print("Din input her: ");
                String inputText = bufferedReader.readLine();

                if (inputText.equals("quit") || inputText.equals("avslutt")) {
                    break;
                }
                else {
                    fileWriter.append(inputText + "\n");
                }
                System.out.println("Skriv en av de oppgitte utrykkene for og avslutte: 'quit' eller 'avslutt'");
            }
        }
        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }



    public static void simpleFileWriting(String fileName) {
        try (FileWriter fileWriter = new FileWriter(fileName, false)) {
            fileWriter.append("something..\n");
            fileWriter.append("something else...\n");
        }

        catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }
}