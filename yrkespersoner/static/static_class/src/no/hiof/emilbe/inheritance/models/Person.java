package no.hiof.emilbe.inheritance.models;

public class Person {

    public static int numPersons = 0;

    protected String firstName;
    protected String lastName;
    protected int age;


    public Person(String firstName, String lastName, int age){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void compareAgeWith(Person person) {
        if (this.age > person.age) {
            System.out.println(this.firstName + " " + this.lastName + " is older");
        }
        else if (this.age < person.age) {
            System.out.println(person.firstName + " " + person.lastName + " is older");
        }
        else {
            System.out.println("The persons are the same age.");
        }
    }

    @Override
    public String toString() {
        // Denne skrives ut når man printer objektet (person1.toString() eller bare person1)
        // Det samme gjelder de andre klassene som arver fra Person
        return "My name is " + firstName + " " + lastName + " and I am " + age + " years old.";
    }


    
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void printDescription(){
        System.out.println(firstName + " " + lastName + " er " + age + " år gammel.");
    }
}