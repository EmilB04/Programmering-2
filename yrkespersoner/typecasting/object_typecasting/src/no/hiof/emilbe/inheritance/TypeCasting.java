package no.hiof.emilbe.inheritance;

import java.util.ArrayList;

import no.hiof.emilbe.inheritance.models.BusDriver;
import no.hiof.emilbe.inheritance.models.Carpenter;
import no.hiof.emilbe.inheritance.models.Person;

public class TypeCasting {
    public static void main(String[] args) {
        Carpenter carpenter1 = new Carpenter("John", "Doe", 30);
        Carpenter carpenter2 = new Carpenter("Jane", "Doe", 31, 2);
        BusDriver busDriver1 = new BusDriver("Ola", "Nordmann", 45);
        Person person1 = new Person("Emil", "Berglund", 19);

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(person1);
        personList.add(carpenter1);
        personList.add(carpenter2);
        personList.add(busDriver1);

        for (Person personX : personList) {
            if (personX instanceof BusDriver) {
                System.out.println("Bus driver --> " + personX);
                //personX.getRoute() GÅR IKKE 
                String busRoute = ((BusDriver) personX).getRoute();
                System.out.println("Route: " + busRoute);
            }
            else if (personX instanceof Carpenter) {
                System.out.println("Carpenter --> " + personX);
                //personX.getHousesBuilt() GÅR IKKE 
                int housesBuilt = ((Carpenter) personX).getHousesBuilt();
                System.out.println("Houses built: " + housesBuilt);
            }
            else {
                System.out.println(personX);
            }
        }
    }
}
