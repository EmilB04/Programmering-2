package no.hiof.emilber.lecture6.models;

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private String studentId;
    private String birthNumber = "13060667589";
    private Course favoriteCourse;
    public Arraylist<Course> courses = new Arraylist<>();


    public Student() {
    }

    public Student(String firstName, String lastName, int age, String studentId) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.studentId = studentId;
    }




    public String getFirstName() {
        return firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        if (age < 0) {
            this.age = 0;
        }
        else if (age > 120) {
            this.age = 120;
        }
        else {
            this.age = age;
        }
    }

    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId){
        this.studentId = studentId;
    }
    public String getBirthNumber(){
        return birthNumber;
    }

    public Course getFavoriteCourse() {
        return favoriteCourse;
    }
    public void setFavoriteCourse(Course favoriteCourse){
        this.favoriteCourse = favoriteCourse;
    }


    public void addCourse(Course courseObject) {
        courses.add(courseObject);
    }

    public int getNumberOfCourses() {
        return courses.size();
    }

    public void printStudentInfo() {
        System.out.println(firstName + " " + lastName + " is " + age + " years old, with the student id of: " + studentId);
    }
    public void printCourses() {
        for (Course courseX : courses) {
            System.out.println(courseX.getCourseName());
        }
    }
    public void removeCourse(Course courseObject) {
        courses.remove(courseObject);
    }
}
