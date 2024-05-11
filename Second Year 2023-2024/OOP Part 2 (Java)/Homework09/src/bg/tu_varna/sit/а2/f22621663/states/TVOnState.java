package bg.tu_varna.sit.а2.f22621663.states;

import bg.tu_varna.sit.а2.f22621663.object.TV;
import bg.tu_varna.sit.а2.f22621663.interfaces.State;

public class TVOnState implements State {
    private TV tv;

    public TVOnState(TV tv) {
        this.tv = tv;
    }

    @Override
    public void pressOnButton() {
        System.out.println("TV is already on");
    }

    @Override
    public void pressOffButton() {
        System.out.println("Turning TV off");
        tv.setState(tv.getOffState());
    }

    @Override
    public void pressChannelUp() {
        System.out.println("Channel up");
    }

    @Override
    public void pressChannelDown() {
        System.out.println("Channel down");
    }

    @Override
    public void pressVolumeUp() {
        System.out.println("Volume up");
    }

    @Override
    public void pressVolumeDown() {
        System.out.println("Volume down");
    }
}
