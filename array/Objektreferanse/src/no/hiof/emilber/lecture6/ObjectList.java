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


        Course course2 = new Course("Programmering 1", "ITF10618", 10);
        courseList.add(course2);
        System.out.println(courseList.size()); // 2
        System.out.println(courseList.get(1).getCourseName()); // Programmering 1

        // For loop
        System.out.println();
        for (int i = 0; i < courseList.size(); i++) {
            Course courseI = courseList.get(i);
            System.out.println(courseI.getCourseName());
        }

        Course course3 = new Course("Magi og trylling", "ITF10617", 10);
        courseList.add(course3);

        // for loop reverse
        System.out.println();
        for (int i = courseList.size() - 1; i >= 0; i--) {
            Course courseI = courseList.get(i);
            System.out.println(courseI.getCourseName());
        }

        // For each loop
        System.out.println();
        for (Course course : courseList) {
            System.out.println(course.getCourseName());
        }

        // Remove
        System.out.println();
        courseList.remove(2);
        for (Course course : courseList) {
            System.out.println(course.getCourseName());
        }

    }
}
