package bg.tu_varna.sit.а2.f22621663;

import java.util.ArrayList;
import java.util.List;

class PassengerPlane implements Airplane {
    private String identifier;
    private int passengerSeats;
    private FlightControlMediator mediator;
    private List<String> blackBox = new ArrayList<>();

    public PassengerPlane(String identifier, int passengerSeats, FlightControlMediator mediator) {
        this.identifier = identifier;
        this.passengerSeats = passengerSeats;
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
