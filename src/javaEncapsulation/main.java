package javaEncapsulation;

public class main {
    public static void main(String[] args){
        Student student1 = new Student(
                "Sean", 22, "BSIT");

        student1.displayInfo();
        student1.setAge(25);

        System.out.println("Age: " + student1.getAge());
    }
}
