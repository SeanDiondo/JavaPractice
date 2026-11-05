package javaAbstraction;

public class Smartphone extends Device implements Connectable {
    public Smartphone(String brand) {
        super(brand);
    }

    @Override
    public void turnOn() {
        System.out.println("Smartphone is Turning On");
    }

    @Override
    public void turnOff() {
        System.out.println("Smartphone is Turning Off");
    }

    @Override
    public void connectToWifi() {
        System.out.println("Smartphone is Connecting to WiFi");
    }
}