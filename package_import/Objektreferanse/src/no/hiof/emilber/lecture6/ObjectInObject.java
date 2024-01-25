package no.hiof.emilber.lecture6;
import no.hiof.emilber.lecture6.models.Student;
import no.hiof.emilber.lecture6.models.Course;

public class ObjectInObject {
    
    public static void main(String[] args) {
        Student student1 = new Student("Emil", "Berglund", 19, "13487");

        student1.getFavoriteCourse();

        Course course1 = new Course("Programmering 2", "ITF10619", 10);
        
        student1.setFavoriteCourse(course1);

        System.out.println();
        System.out.println(student1.getFavoriteCourse().getCourseName());
        System.out.println(course1.getCourseName());
    }
}
