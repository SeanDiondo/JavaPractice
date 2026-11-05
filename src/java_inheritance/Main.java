package java_inheritance;

public class Main {
    public static void main(String[] args){
        Course course1 = new Course("Object Oriented Programming", "OOP101");

        Student student1 = new Student("Sean Diondo", 22, "01", course1);

        student1.displayStudentInfo();
    }
}
