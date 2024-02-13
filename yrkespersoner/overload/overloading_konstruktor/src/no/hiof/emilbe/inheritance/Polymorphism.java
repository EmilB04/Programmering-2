package no.hiof.emilbe.inheritance;

import java.util.ArrayList;

import no.hiof.emilbe.inheritance.models.BusDriver;
import no.hiof.emilbe.inheritance.models.Carpenter;
import no.hiof.emilbe.inheritance.models.Person;

public class Polymorphism {
    public static void main(String[] args) {
        Carpenter carpenter1 = new Carpenter("John", "Doe", 30);
        Carpenter carpenter2 = new Carpenter("Jane", "Doe", 31, 2);

        System.out.println(carpenter1);
        System.out.println(carpenter2);
        System.out.println();

        BusDriver busDriver1 = new BusDriver("Ola", "Nordmann", 45);
        System.out.println(busDriver1);
        System.out.println();

        Person person1 = new Person("Emil", "Berglund", 19);
        person1.compareAgeWith(busDriver1);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(carpenter1);
        personList.add(carpenter2);
        personList.add(busDriver1);


        System.out.println();
        for (Person personX : personList) {
            if (personX instanceof Carpenter) {
                System.out.println("Carpenter --> " + personX);
            }
            else if (personX instanceof BusDriver) {
                System.out.println("Bus driver --> " + personX);
            }
            else {
                System.out.println(personX);
            }
        }


    }
}
