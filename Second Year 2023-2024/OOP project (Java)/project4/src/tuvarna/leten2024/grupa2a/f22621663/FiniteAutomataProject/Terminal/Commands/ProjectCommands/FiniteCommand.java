package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;

import java.util.List;

public class FiniteCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: finite <id>");
            return;
        }

        try {
            int id = Integer.parseInt(args[0]);

            List<String> regexList = RegCommand.getRegexList();

            if (id < 0 || id >= regexList.size()) {
                System.out.println("Invalid ID.");
                return;
            }

            String regex = regexList.get(id);

            if (regex.endsWith("*")) {
                System.out.println("The automaton with ID " + id + " is not finite.");
            } else {
                System.out.println("The automaton with ID " + id + " is finite.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid ID.");
        }
    }
}

