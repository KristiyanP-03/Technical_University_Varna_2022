package bg.tu_varna.sit.а2.f22621663.commands;

import bg.tu_varna.sit.а2.f22621663.object.TV;
import bg.tu_varna.sit.а2.f22621663.interfaces.Command;

public class VolumeUpCommand implements Command {
    private TV tv;

    public VolumeUpCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.volumeUp();
    }
}
