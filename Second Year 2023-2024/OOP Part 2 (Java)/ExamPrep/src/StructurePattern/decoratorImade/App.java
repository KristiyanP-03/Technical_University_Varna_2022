package StructurePattern.decoratorImade;

public class App {
    public static void main(String[] args) {
        DroneInterface E99 = new Drone();

        DroneInterface E99S = new UpgradedDroneDecorator(new Drone());

        E99S.powerUp();
    }
}
