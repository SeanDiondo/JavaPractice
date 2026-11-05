package javaCodingExercise;

public class Student {
    String name;
    int age;
    String course;

    public Student (String name, int age, String course) {
        this.name = name;
        this.age = age;
        this.course = course;
    }
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);

    } public static void main(String[] args){
        Student student1 = new Student("Sean Diondo", 22, "BSIT");

        System.out.println("Student Information: ");
        student1.displayInfo();
    }
}