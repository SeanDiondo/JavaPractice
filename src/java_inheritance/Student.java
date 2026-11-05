package java_inheritance;

public class Student extends Person {
    private String studentId;
    private Course course;

    public Student(String name, int age, String studentId, Course course){
        super (name, age);

        this.studentId = studentId;
        this.course = course;
    } public void displayStudentInfo(){
        super.displayInfo();
        System.out.println("Student ID: " + studentId);
        course.displayCourse();
    }
}
