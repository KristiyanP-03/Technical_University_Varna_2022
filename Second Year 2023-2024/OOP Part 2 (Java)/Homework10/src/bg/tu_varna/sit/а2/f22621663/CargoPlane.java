package bg.tu_varna.sit.а2.f22621663;

import java.util.ArrayList;
import java.util.List;

class CargoPlane implements Airplane {
    private String identifier;
    private double cargoCapacity;
    private String cargoType;
    private FlightControlMediator mediator;
    private List<String> blackBox = new ArrayList<>();

    public CargoPlane(String identifier, double cargoCapacity, String cargoType, FlightControlMediator mediator) {
        this.identifier = identifier;
        this.cargoCapacity = cargoCapacity;
        this.cargoType = cargoType;
        this.mediator = mediator;
    }

    @Override
    public String getIdentifier() {
        return identifier;
    }

    @Override
    public boolean requestTakeoff() {
        blackBox.add("Requesting takeoff.");
        return mediator.requestTakeoff(this);
    }

    @Override
    public boolean requestLanding() {
        blackBox.add("Requesting landing.");
        return mediator.requestLanding(this);
    }

    @Override
    public void receiveMessage(String message) {
        blackBox.add("Received message: " + message);
    }

    @Override
    public List<String> getBlackBox() {
        return blackBox;
    }
}
