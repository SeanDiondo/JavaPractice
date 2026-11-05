package javaAbstraction;

public class ElectricFan extends Device{
    public ElectricFan(String brand){
        super(brand);
    }
    @Override
    public void turnOn(){
        System.out.println("Electric Fan is Turning On");
    }
    @Override
    public void turnOff(){
        System.out.println("Electric Fan is Turning Off");
    }
}
