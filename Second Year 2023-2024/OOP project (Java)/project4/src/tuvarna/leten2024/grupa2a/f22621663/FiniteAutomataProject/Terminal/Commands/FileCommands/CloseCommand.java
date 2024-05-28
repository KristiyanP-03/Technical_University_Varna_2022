package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands.RegCommand;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;


public class CloseCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: close <filename>");
            return;
        }

        String filename = args[0];
        List<String> regexList = RegCommand.getRegexList();

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String regex;
            boolean removed = false;
            while ((regex = reader.readLine()) != null) {
                if (!regex.isEmpty()) {
                    System.out.println("Regex read from file: " + regex);
                    removed |= regexList.remove(regex);
                }
            }

            if (removed) {
                System.out.println("Removed equal regexes from file: " + filename);
            } else {
                System.out.println("No equal regexes found in file: " + filename);
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}





