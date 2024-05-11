package bg.tu_varna.sit.а2.f22621663.app;

import bg.tu_varna.sit.а2.f22621663.commands.*;
import bg.tu_varna.sit.а2.f22621663.interfaces.Command;
import bg.tu_varna.sit.а2.f22621663.object.TV;

public class App {
    public static void main(String[] args) {
        TV tv = new TV();

        Command turnOnCommand = new TurnOnCommand(tv);
        Command turnOffCommand = new TurnOffCommand(tv);
        Command channelUpCommand = new ChannelUpCommand(tv);
        Command channelDownCommand = new ChannelDownCommand(tv);
        Command volumeUpCommand = new VolumeUpCommand(tv);
        Command volumeDownCommand = new VolumeDownCommand(tv);



        tv.pressOnButton();


        turnOnCommand.execute();
        channelUpCommand.execute();
        channelDownCommand.execute();
        volumeUpCommand.execute();
        volumeDownCommand.execute();
        turnOffCommand.execute();
    }
}
