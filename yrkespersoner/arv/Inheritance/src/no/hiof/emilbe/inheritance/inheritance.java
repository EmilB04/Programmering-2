package no.hiof.emilbe.inheritance;
import no.hiof.emilbe.inheritance.models.Person;
import no.hiof.emilbe.inheritance.models.Carpenter;

public class inheritance {
    public static void main(String[] args) {
        Person person1 = new Person("Emil", "Berglund", 21);
        
        System.out.println(person1.getFirstName());
    }
}
