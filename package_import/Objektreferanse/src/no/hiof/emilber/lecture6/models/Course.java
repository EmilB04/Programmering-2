package no.hiof.emilber.lecture6.models;

public class Course {
    private String courseName;
    private String courseCode;
    private int studyPoints;

    public Course(String courseName, String courseCode, int studyPoint){
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.studyPoints = studyPoint;
    }

    public String getCourseName() {
        return courseName;
    }
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    public String getCourseCode() {
        return courseCode;
    }
    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public int getStudyPoints() {
        return studyPoints;
    }
    public void setStudyPoints(int studyPoints) {
        this.studyPoints = studyPoints;
    }
}
