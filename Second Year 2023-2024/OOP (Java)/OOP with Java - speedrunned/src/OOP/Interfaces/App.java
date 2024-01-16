package OOP.Interfaces;

public class App {
    public static void main(String[] args) {
        MobilePhone samsung = new MobilePhone();
        System.out.println(samsung.TurnOn());
        System.out.println(samsung.ShowBattery() + "%");
        System.out.println(samsung.TurnOff());

        Tablet lenovo = new Tablet();
        System.out.println(lenovo.TurnOn());
        System.out.println(lenovo.TurnOff());
    }
}
