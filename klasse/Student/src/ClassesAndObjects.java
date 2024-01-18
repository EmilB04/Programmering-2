public class ClassesAndObjects {
    public static void main(String[] args) {
        Student student1 = new Student();

        student1.firstName = "Emil";
        student1.lastName = "Berglund";
        student1.age = 19;
        student1.studentId = "104567";

        System.out.println(student1.firstName + " " + student1.lastName + " " + student1.age + " " + student1.studentId);


        Student student2 = new Student();
        
        student2.firstName = "Ola";
        student2.lastName = "Nordmann";
        student2.age = 20;
        student2.studentId = "123456";

        System.out.println(student2.firstName + " " + student2.lastName + " " + student2.age + " " + student2.studentId);

        //--------------------------------------


        Course course = new Course();

        course.courseName = "Programmering 2";
        course.courseCode = "ITF10619";
        course.studyPoints = 15;
    }
}
