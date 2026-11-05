package java_Polymorphism;

public class Employee {
    public void performTask(){
        System.out.println("Employee is performing task");
    }
}
class Developer extends Employee {
    @Override
    public void performTask() {
        System.out.println("I make the Company Website");
    }
}
class Designer extends Employee {
    @Override
    public void performTask() {
        System.out.println("I Design Company Graphics");
    }
}