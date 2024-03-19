package models;
import java.util.ArrayList;

public class ListCare {
    //Lag en Java-klasse som håndterer en liste med heltall. Denne klassen skal ha metoder for å legge til et tall i listen, fjerne et tall fra listen og beregne gjennomsnittet av tallene i listen.
    private ArrayList<Integer> tallListe = new ArrayList<Integer>();

    // vis hele listen
    @Override
    public String toString() {
        return tallListe.toString();
    }

    public void addToList(int tall) {
        tallListe.add(tall);
    }
    public void removeFromList(int index) {
        try {
            tallListe.remove(index);
            System.out.println("Fjernet element på index " + index);
        } 
        catch (IndexOutOfBoundsException e) {
            System.out.println("Index "+ index + " finnes ikke");
        }
    }
    public double averageValue() {
        double sum = 0;
        double average = 0;
        for (int i = 0; i < tallListe.size(); i++) {
            sum += tallListe.get(i);
        }
        average = sum / tallListe.size();
        return average;
    }
}
