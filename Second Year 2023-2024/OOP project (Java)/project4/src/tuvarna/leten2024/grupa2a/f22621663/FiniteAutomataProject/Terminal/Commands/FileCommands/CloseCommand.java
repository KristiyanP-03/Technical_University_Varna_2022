package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor.CommandExecutor;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands.RegCommand;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class CloseCommand implements Command {
    private final CommandExecutor commandExecutor;

    public CloseCommand(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    @Override
    public void execute(String[] args) {
        if (commandExecutor.isFileOpened()) {
            System.out.println("Файлът е затворен.");
            commandExecutor.setFileOpened(false);
        } else {
            System.out.println("Няма отворен файл, който да затворите.");
        }
    }
}






