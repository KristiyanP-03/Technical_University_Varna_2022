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
            String regex;
            int id = RegCommand.getRegexList().size();

            while ((regex = reader.readLine()) != null) {
                if (!regex.isEmpty()) {
                    System.out.println("Regex read from file: " + regex);
                    RegCommand.getRegexList().add(regex);
                    id++;
                }
            }

            System.out.println("Automatons created for regexes in file: " + filename);
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
