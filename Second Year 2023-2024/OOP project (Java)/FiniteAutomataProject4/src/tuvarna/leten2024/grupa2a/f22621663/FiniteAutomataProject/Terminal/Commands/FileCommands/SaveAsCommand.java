package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands.RegCommand;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;


public class SaveAsCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: saveas <id> <filename>");
            return;
        }

        String id = args[0];
        String filename = args[1];


        if (filename.startsWith("\"") && filename.endsWith("\"")) {
            filename = filename.substring(1, filename.length() - 1);
        }

        List<String> regexList = RegCommand.getRegexList();

        int index;
        try {
            index = Integer.parseInt(id);
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID: " + id);
            return;
        }

        if (index >= 0 && index < regexList.size()) {
            String regex = regexList.get(index);
            try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
                writer.println(regex);
                System.out.println("Automaton saved successfully to " + filename);
            } catch (IOException e) {
                System.out.println("Error saving automaton to file: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid ID: " + id);
        }
    }
}
