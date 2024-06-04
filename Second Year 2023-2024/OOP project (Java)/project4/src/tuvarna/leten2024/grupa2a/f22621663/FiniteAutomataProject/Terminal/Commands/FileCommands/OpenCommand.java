package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands.RegCommand;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor.CommandExecutor;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.File;



public class OpenCommand implements Command {
    private final CommandExecutor commandExecutor;

    public OpenCommand(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: open <filename>");
            return;
        }

        String filename = args[0];
        try {
            File file = new File(filename);
            if (!file.exists()) {
                if (file.createNewFile()) {
                    System.out.println("Successfully created and opened " + filename);
                } else {
                    System.out.println("Error creating file " + filename);
                    return;
                }
            }

            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
                String regex;
                int id = RegCommand.getRegexList().size();

                while ((regex = reader.readLine()) != null) {
                    if (!regex.isEmpty()) {
                        System.out.println("Regex read from " + regex);
                        RegCommand.getRegexList().add(regex);
                        id++;
                    }
                }

                System.out.println("Successfully opened " + filename);
                commandExecutor.setFileOpened(true);
                commandExecutor.setCurrentFileName(filename);

            } catch (IOException e) {
                System.out.println("Error reading file " + e.getMessage());
            }

        } catch (IOException e) {
            System.out.println("Error creating file " + e.getMessage());
        }
    }
}

