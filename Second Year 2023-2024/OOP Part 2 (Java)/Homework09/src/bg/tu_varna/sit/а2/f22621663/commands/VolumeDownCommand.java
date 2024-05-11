package bg.tu_varna.sit.а2.f22621663.commands;

import bg.tu_varna.sit.а2.f22621663.object.TV;
import bg.tu_varna.sit.а2.f22621663.interfaces.Command;

public class VolumeDownCommand implements Command {
    private TV tv;

    public VolumeDownCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeDown();
    }
}
