package no.hiof.emilber.lecture6;
import java.util.ArrayList;
import no.hiof.emilber.lecture6.models.Course;

public class ObjectList {
    public static void main(String[] args) {
        ArrayList<Course> courseList = new ArrayList<>();
        System.out.println(courseList.size()); // 0
        Course course1 = new Course("Programmering 2", "ITF10619", 10);
        courseList.add(course1);

        System.out.println(courseList.size()); // 1
        System.out.println(courseList.get(0).getCourseName()); // Programmering 2
    }
}
