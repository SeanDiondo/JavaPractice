package javaAbstraction;

public class SmartTV extends Device implements Connectable{
    public SmartTV(String brand){
        super(brand);
    }
    @Override
    public void turnOn(){
        System.out.println("TV is Turning On");
    }
    @Override
    public void turnOff(){
        System.out.println("TV is Turning Off");
    }
    @Override
    public void connectToWifi(){
        System.out.println("TV is Turning On");
    }
}
