package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands.RegCommand;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class SaveCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: save <id> <filename>");
            return;
        }

        String id = args[0];
        String filename = args[1];

        List<String> regexList = RegCommand.getRegexList();

        int index = Integer.parseInt(id);
        if (index >= 0 && index < regexList.size()) {
            String regex = regexList.get(index);
            try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
                writer.println(regex);
                System.out.println("Automaton saved successfully to " + filename + ".txt");
            } catch (IOException e) {
                System.out.println("Error saving automaton to file: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid ID: " + id);
        }
    }
}
