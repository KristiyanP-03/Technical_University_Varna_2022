package decoratorImade;

public class UpgradedDroneDecorator implements DroneInterface {
    private DroneInterface drone;

    public UpgradedDroneDecorator(DroneInterface drone) {
        this.drone = drone;
    }

    @Override
    public void powerUp() {
        drone.powerUp();
        upgrade();
    }

    void upgrade(){

    }
}
