import models.Reverse;
import models.Bankkonto;
import models.ListCare;

public class Main {
    public static void main(String[] args) {
        // Skriv ut reversert streng
        String str = "Emil Berglund";
        System.out.println(str);
        System.out.println(Reverse.reverseString(str));

        System.out.println();
        // Listebehandling 
        ListCare listCare = new ListCare();
        listCare.addToList(1);
        listCare.addToList(2);
        listCare.addToList(3);
        listCare.addToList(4);
        System.out.println(listCare);
        System.out.println("Gjennomsnitt: " + listCare.averageValue());
        listCare.removeFromList(3);
        System.out.println(listCare);


        // Konto - Klasser og objekter
        Bankkonto bankKonto = new Bankkonto("1084.74.84176", "Emil Berglund", 54_000);
        System.out.println(bankKonto.getSaldo());
        bankKonto.taUt(300);
        bankKonto.settInn(300);
        System.out.println(bankKonto.getSaldo());

        /*
         * Oppgave 4: Arv og polymorfisme
         * Lag et hierarki av klasser som representerer ulike typer kjøretøy, for
         * eksempel Bil, Lastebil, Motorsykkel osv. Implementer egenskaper og metoder
         * som er relevante for hvert kjøretøy. Bruk arv og polymorfisme der det er
         * hensiktsmessig.
         * 
         * Oppgave 5: Feilhåndtering
         * Lag en Java-applikasjon som leser inn et tall fra brukeren. Hvis brukeren
         * skriver inn noe annet enn et tall, skal programmet fange opp feilen og be
         * brukeren om å skrive inn tallet på nytt. Fortsett å be brukeren om et tall
         * til riktig input er gitt, og skriv deretter ut tallet.
         */
    }
}
