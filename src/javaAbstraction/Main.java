package javaAbstraction;

public class Main {
    public static void main(String[] args){
        Smartphone iphone13 = new Smartphone("Apple");
        SmartTV Samsung50inch = new SmartTV("Samsung");
        ElectricFan Hanabishi = new ElectricFan("Hanabishi");

        iphone13.displayBrand();
        iphone13.turnOn();
        iphone13.connectToWifi();
    }
}
