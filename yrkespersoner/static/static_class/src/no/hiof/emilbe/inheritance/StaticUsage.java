// Klassen vil ikke kjøre i VsCode, men kjører fint i IntelliJ


package no.hiof.emilbe.inheritance;
import no.hiof.emilbe.inheritance.models.Carpenter;
import no.hiof.emilbe.inheritance.models.Person;

public class StaticUsage {
    public static void main(String[] args){
        //System.out.println(Person.numPersons);


        Person person1 = new Person("Emil", "Berglund", 19);
        //System.out.println(Person.numPersons);

        Person person2 = new Person("Ola", "Nordmann", 20);
        //System.out.println(Person.numPersons);

        Carpenter carpenter1 = new Carpenter("Kari", "Nordmann", 21);
        //System.out.println(Person.numPersons);


        //----------------------------------------------------------------------------------------
        System.out.println("Persons:");
        System.out.println(Person.getNumPersons()); // Sikrere å bruke innkapsling


        System.out.println("\nCarpenters:");
        System.out.println(Carpenter.getNumCarpenters());

    }
}
