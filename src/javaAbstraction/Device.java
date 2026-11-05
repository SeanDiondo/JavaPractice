package javaAbstraction;

public abstract class Device {
    String brand;

    public Device(String brand){
        this.brand = brand;
    }
    public abstract void turnOn();
    public abstract void turnOff();

    public void displayBrand() {
        System.out.println("Brand: " + brand);
    }
}
