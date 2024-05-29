package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import java.util.List;



public class DeterministicCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: deterministic <id>");
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
            boolean deterministic = isDeterministic(regex);

            if (deterministic) {
                System.out.println("The automaton with ID " + id + " is deterministic.");
            } else {
                System.out.println("The automaton with ID " + id + " is not deterministic.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID.");
        }
    }

    private boolean isDeterministic(String regex) {
        int length = regex.length();
        for (int i = 0; i < length; i++) {
            char currentChar = regex.charAt(i);
            if (currentChar == '*') {
                if (i + 1 < length) {
                    char nextChar = regex.charAt(i + 1);
                    if (nextChar == regex.charAt(i-1)) {
                        return false;
                    }
                }
            }
            if (currentChar == '+') {
                if (i + 1 < length) {
                    char nextChar = regex.charAt(i + 1);
                    if (nextChar == regex.charAt(0)) {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}


