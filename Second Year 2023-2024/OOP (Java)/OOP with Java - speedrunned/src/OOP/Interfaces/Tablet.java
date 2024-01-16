package OOP.Interfaces;

public class Tablet implements Device{

    @Override
    public String TurnOn() {
        return "Lenovo...";
    }

    @Override
    public String TurnOff() {
        return "*in the trash*";
    }

    @Override
    public int ShowBattery() {
        return 99;
    }
}
