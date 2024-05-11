package bg.tu_varna.sit.а2.f22621663.commands;

import bg.tu_varna.sit.а2.f22621663.object.TV;
import bg.tu_varna.sit.а2.f22621663.interfaces.Command;

public class ChannelDownCommand implements Command {
    private TV tv;

    public ChannelDownCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.channelDown();
    }
}
