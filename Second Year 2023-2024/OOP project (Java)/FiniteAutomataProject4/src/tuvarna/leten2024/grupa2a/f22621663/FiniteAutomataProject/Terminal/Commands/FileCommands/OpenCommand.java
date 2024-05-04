package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands.RegCommand;

public class OpenCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: open <filename>");
            return;
        }

        String filename = args[0];
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String regex = reader.readLine();
            if (regex == null) {
                System.out.println("File is empty.");
                return;
            }


            Command regCommand = new RegCommand();
            regCommand.execute(new String[]{regex});
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
