package no.hiof.emilbe.inheritance;
import no.hiof.emilbe.inheritance.models.Person;
import no.hiof.emilbe.inheritance.models.BusDriver;
import no.hiof.emilbe.inheritance.models.Carpenter;
import no.hiof.emilbe.inheritance.models.CarpenterApprentice;

public class inheritance {
    public static void main(String[] args) {
        Person person1 = new Person("Emil", "Berglund", 21);
        System.out.println(person1.getFirstName());

        Carpenter carpenter1 = new Carpenter("Rudolf", "Nilsen", 34, 5);
        System.out.println(carpenter1.getFirstName());

        BusDriver busDriver1 = new BusDriver("Ola", "Nordmann", 45, "'Moss - Sarpsborg'");
        System.out.println(busDriver1.getRoute());
        System.out.println(busDriver1.getFirstName() + " " + busDriver1.getLastName() + " kjører bussrute " + busDriver1.getRoute());


        CarpenterApprentice carpenterApprentice1 = new CarpenterApprentice("Byggmester", "Bob", 25, 0, "2022-2024");
        System.out.println(carpenterApprentice1.getFirstName()+ " " + carpenterApprentice1.getLastName() );

        System.out.println(person1.toString());
        // uten override: no.hiof.emilbe.inheritance.models.Person@87aac27
        // med override: My name is Emil Berglund and I am 21 years old.
        System.out.println(busDriver1);
        System.out.println(carpenter1);
        System.out.println(carpenterApprentice1);
    }
}
