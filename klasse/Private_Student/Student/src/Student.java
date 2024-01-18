public class Student {
    // fornavn, etternavn, alder og studentid
    // Denne klassen skal ikke brukes til å kjøre programmet. Dette gjøres i
    // ClassesAndObjects
    public String firstName;
    public String lastName;
    public int age;
    private String studentId;





    public void printStudentInfo() {
        System.out.println(
                firstName + " " + lastName + " is " + age + " years old, with the student id of: " + studentId);
    }
}
