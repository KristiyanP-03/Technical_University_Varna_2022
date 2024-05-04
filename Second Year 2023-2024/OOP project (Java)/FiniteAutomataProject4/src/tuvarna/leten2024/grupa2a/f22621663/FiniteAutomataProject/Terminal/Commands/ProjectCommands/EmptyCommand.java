package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;

public class EmptyCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: empty <id>");
            return;
        }


        String regex = RegCommand.getRegexList().get(Integer.parseInt(args[0]));
        if (regex.equals("&")) {
            System.out.println("Yes. Regex is empty because there is no end state.");
        } else {
            System.out.println("No. Regex has a start state 1 and end state " + (regex.length() + 1) + ".");
        }
    }
}
