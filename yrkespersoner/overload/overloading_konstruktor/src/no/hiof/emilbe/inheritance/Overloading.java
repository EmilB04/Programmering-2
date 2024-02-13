package no.hiof.emilbe.inheritance;
import no.hiof.emilbe.inheritance.models.BusDriver;
import no.hiof.emilbe.inheritance.models.Carpenter;

public class Overloading {
    public static void main(String[] args) {
        Carpenter carpenter1 = new Carpenter("John", "Doe", 30);
        Carpenter carpenter2 = new Carpenter("Jane", "Doe", 31, 2);

        System.out.println(carpenter1);
        System.out.println(carpenter2);

        System.out.println();

        BusDriver busDriver1 = new BusDriver("Ola", "Nordmann", 45);
        System.out.println(busDriver1);
    }
}
