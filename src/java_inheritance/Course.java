package java_inheritance;

public class Course {
    private String courseName;
    private String courseCode;

    public Course(String courseName, String courseCode){
        this.courseName = courseName;
        this.courseCode = courseCode;
        }

        public void displayCourse() {
        System.out.println("Course: " + courseName);
        System.out.println("Course Code: " + courseCode);
    }
}

