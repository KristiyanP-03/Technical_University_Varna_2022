package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor.CommandExecutor;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands.RegCommand;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;



public class SaveCommand implements Command {
    private final CommandExecutor commandExecutor;

    public SaveCommand(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    @Override
    public void execute(String[] args) {
        if (args.length != 0) {
            System.out.println("Usage: save");
            return;
        }

        String filename = commandExecutor.getCurrentFileName();

        if (filename == null) {
            System.out.println("No file opened. Please open a file first.");
            return;
        }

        List<String> regexList = RegCommand.getRegexList();

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (String regex : regexList) {
                writer.println(regex);
            }
            System.out.println("Automatons saved successfully to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving automatons to file: " + e.getMessage());
        }
    }
}
