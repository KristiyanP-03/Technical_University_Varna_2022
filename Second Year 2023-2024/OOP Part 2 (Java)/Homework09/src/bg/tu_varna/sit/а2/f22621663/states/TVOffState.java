package bg.tu_varna.sit.а2.f22621663.states;

import bg.tu_varna.sit.а2.f22621663.object.TV;
import bg.tu_varna.sit.а2.f22621663.interfaces.State;

public class TVOffState implements State {
    private TV tv;

    public TVOffState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void pressOnButton() {
        System.out.println("Turning TV on");
        tv.setState(tv.getOnState());
    }

    @Override
    public void pressOffButton() {
        System.out.println("TV is already off");
    }

    @Override
    public void pressChannelUp() {
        System.out.println("Can't change channel, TV is off");
    }

    @Override
    public void pressChannelDown() {
        System.out.println("Can't change channel, TV is off");
    }

    @Override
    public void pressVolumeUp() {
        System.out.println("Can't change volume, TV is off");
    }

    @Override
    public void pressVolumeDown() {
        System.out.println("Can't change volume, TV is off");
    }
}
