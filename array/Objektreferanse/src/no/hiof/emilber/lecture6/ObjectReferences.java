package no.hiof.emilber.lecture6;
import no.hiof.emilber.lecture6.models.Student;


public class ObjectReferences {
    public static void main(String[] args) {

        Student student1 = new Student("Emil", "Berglund", 19, "12122");
        Student student2 = student1;

        student1.printStudentInfo();
        student2.printStudentInfo();

        student1.setLastName("Antonsen");

        System.out.println();
        student1.printStudentInfo();
        student2.printStudentInfo();
    }
    
}