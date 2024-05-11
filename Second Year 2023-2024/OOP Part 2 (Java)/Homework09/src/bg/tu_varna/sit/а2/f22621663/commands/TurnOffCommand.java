package bg.tu_varna.sit.а2.f22621663.commands;

import bg.tu_varna.sit.а2.f22621663.object.TV;
import bg.tu_varna.sit.а2.f22621663.interfaces.Command;

public class TurnOffCommand implements Command {
    private TV tv;

    public TurnOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.turnOff();
    }
}
