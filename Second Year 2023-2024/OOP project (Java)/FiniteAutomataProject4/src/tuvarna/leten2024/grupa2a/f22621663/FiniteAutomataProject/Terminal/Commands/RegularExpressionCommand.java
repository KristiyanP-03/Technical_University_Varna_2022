package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.TerminalFunctionality.Command;


import java.util.HashMap;
import java.util.Map;



public class RegularExpressionCommand implements Command {
    @Override
    public void functionality(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: reg <regex>");
            return;
        }
        String regex = args[0];

        Map<Integer, Map<String, Integer>> transitions = new HashMap<>();
        int currentState = 1;
        transitions.put(currentState, new HashMap<>());

        int previousState = 1;

        for (int i = 0; i < regex.length(); i++) {
            char c = regex.charAt(i);
            int nextState = currentState + 1;

            if (regex.charAt(i) == '*'){
                continue;
            }
            if (i < regex.length() - 1 && regex.charAt(i + 1) == '*') {
                nextState--;
            }

            transitions.putIfAbsent(nextState, new HashMap<>());
            transitions.get(currentState).put(String.valueOf(c), nextState);
            previousState = currentState;
            currentState = nextState;
        }

        System.out.println("Automaton created for regular expression " + regex + ":");
        for (Map.Entry<Integer, Map<String, Integer>> entry : transitions.entrySet()) {
            int fromState = entry.getKey();
            Map<String, Integer> transitionMap = entry.getValue();
            for (Map.Entry<String, Integer> transition : transitionMap.entrySet()) {
                String symbol = transition.getKey();
                int toState = transition.getValue();
                System.out.println(fromState + "->" + symbol + "->" + toState);
            }
        }
    }
}