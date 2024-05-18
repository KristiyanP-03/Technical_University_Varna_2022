package bg.tu_varna.sit.а2.f22621663;

import java.util.ArrayList;
import java.util.List;

class FlightControlMediatorImpl implements FlightControlMediator {
    private int capacity;
    private int currentAircraftCount;
    private List<Airplane> airplanes = new ArrayList<>();

    public FlightControlMediatorImpl(int capacity) {
        this.capacity = capacity;
        this.currentAircraftCount = 0;
    }

    @Override
    public boolean requestLanding(Airplane airplane) {
        if (currentAircraftCount < capacity) {
            airplanes.add(airplane);
            currentAircraftCount++;
            String message = airplane.getIdentifier() + " is cleared to land.";
            sendMessage(message, airplane);
            return true;
        } else {
            String message = airplane.getIdentifier() + " landing request denied. No available slots.";
            sendMessage(message, airplane);
            return false;
        }
    }

    @Override
    public boolean requestTakeoff(Airplane airplane) {
        if (airplanes.remove(airplane)) {
            currentAircraftCount--;
            String message = airplane.getIdentifier() + " is cleared for takeoff.";
            sendMessage(message, airplane);
            return true;
        } else {
            String message = airplane.getIdentifier() + " takeoff request denied. Not found in the system.";
            sendMessage(message, airplane);
            return false;
        }
    }

    @Override
    public void sendMessage(String message, Airplane airplane) {
        airplane.receiveMessage(message);
    }
}
