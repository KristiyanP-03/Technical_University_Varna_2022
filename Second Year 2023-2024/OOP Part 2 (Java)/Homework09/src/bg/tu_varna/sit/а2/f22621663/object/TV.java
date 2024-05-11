package bg.tu_varna.sit.а2.f22621663.object;

import bg.tu_varna.sit.а2.f22621663.interfaces.State;
import bg.tu_varna.sit.а2.f22621663.states.TVOffState;
import bg.tu_varna.sit.а2.f22621663.states.TVOnState;

public class TV {
    private State onState;
    private State offState;
    private State currentState;

    public TV() {
        onState = new TVOnState(this);
        offState = new TVOffState(this);
        currentState = offState;
    }

    public void setState(State state) {
        currentState = state;
    }

    public State getOnState() {
        return onState;
    }

    public State getOffState() {
        return offState;
    }

    public void pressOnButton() {
        currentState.pressOnButton();
    }

    public void pressOffButton() {
        currentState.pressOffButton();
    }

    public void pressChannelUp() {
        currentState.pressChannelUp();
    }

    public void pressChannelDown() {
        currentState.pressChannelDown();
    }

    public void pressVolumeUp() {
        currentState.pressVolumeUp();
    }

    public void pressVolumeDown() {
        currentState.pressVolumeDown();
    }

    public void turnOn() {
        System.out.println("Turning TV on");
        setState(onState);
    }

    public void turnOff() {
        System.out.println("Turning TV off");
        setState(offState);
    }

    public void channelUp() {
        System.out.println("Channel up");
    }

    public void channelDown() {
        System.out.println("Channel down");
    }

    public void volumeUp() {
        System.out.println("Volume up");
    }

    public void volumeDown() {
        System.out.println("Volume down");
    }
}
