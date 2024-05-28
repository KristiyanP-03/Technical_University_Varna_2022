package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;

import java.util.Map;

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


                Map<Integer, Map<Character, List<Integer>>> transitions = RegCommand.getTransitions(id);



                for (int startState : transitions.keySet()) {
                    Map<Character, List<Integer>> transitionMap = transitions.get(startState);
                    for (char input : transitionMap.keySet()) {
                        List<Integer> endStates = transitionMap.get(input);
                        for (int endState : endStates) {
                            System.out.println(startState + "->" + input + "->" + endState);
                        }
                    }
                }

            } else {
                System.out.println("Invalid ID: " + id);
            }


        } catch (NumberFormatException e) {
            System.out.println("Invalid ID: " + args[0]);
        }
    }
}
