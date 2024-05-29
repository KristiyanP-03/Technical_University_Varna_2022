package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor.Automaton;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import java.util.List;



public class PrintCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: print <id>");
            return;
        }


        try {
            int id = Integer.parseInt(args[0]);

            List<String> regexList = RegCommand.getRegexList();

            if (id >= 0 && id < regexList.size()) {
                System.out.println("Automaton for regex with ID " + id + ":");

                String regex = regexList.get(id);
                System.out.println("Regular expression: " + regex);

                Automaton automaton = RegCommand.getAutomaton(id);

                if (automaton != null) {
                    for (Automaton.Transition transition : automaton.getTransitions()) {
                        System.out.println(transition.getFromState() + " -" + transition.getSymbol() + "-> " + transition.getToState());
                    }
                } else {
                    System.out.println("No automaton found for ID: " + id);
                }
            } else {
                System.out.println("Invalid ID: " + id);
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID: " + args[0]);
        }
    }
}
