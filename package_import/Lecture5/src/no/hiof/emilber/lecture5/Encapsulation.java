package no.hiof.emilber.lecture5;

import no.hiof.emilber.lecture5.models.Student;

public class Encapsulation {
    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println(student1.getStudentId());
        student1.setStudentId("123456");
        System.out.println(student1.getStudentId());

        student1.setFirstName("Emil");
        System.out.println(student1.getFirstName());

        student1.setAge(23);
        System.out.println(student1.getAge());
    }
}
