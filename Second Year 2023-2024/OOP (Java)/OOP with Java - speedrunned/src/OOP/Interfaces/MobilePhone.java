package OOP.Interfaces;

public class MobilePhone implements Device{

    @Override
    public String TurnOn() {
        return "Samsung S20 FE 4G is starting...  Hello!";
    }

    @Override
    public String TurnOff() {
        return "Turning Off ...";
    }

    @Override
    public int ShowBattery() {
        return 5;
    }
}
