package java_Polymorphism;

public class polymorphism_Animal {
    public void makeSound() {
        System.out.println("Animal makes sound");
    }
} class Dog extends polymorphism_Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog: Arf Arf!");
    }
}
class Cat extends polymorphism_Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat: Meow meow");
    }
}