package no.hiof.emilber.lecture6;
import no.hiof.emilber.lecture6.models.Student;
import no.hiof.emilber.lecture6.models.Course;

public class StudentsWithCourses {
    public static void main(String[] args) {
        Student student1 = new Student("Emil", "Berglund", 19, "12122");

        Course course1 = new Course("Programmering 2", "ITF10619", 10);
        Course course2 = new Course("Databasesystemer", "ITF10618", 10);

        

        student1.addCourse(course1);
        student1.addCourse(course2);

        System.out.println(student1.getNumberOfCourses());

        student1.removeCourse(course2);
        
    }
}
