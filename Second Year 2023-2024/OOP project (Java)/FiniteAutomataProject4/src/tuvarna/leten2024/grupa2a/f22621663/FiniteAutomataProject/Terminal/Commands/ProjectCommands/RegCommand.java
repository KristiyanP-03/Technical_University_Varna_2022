package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

public class RegCommand implements Command {
    private static final List<String> regexList = new ArrayList<>();
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: reg <regex>");
            return;
        }

        String regex = args[0];
        int state = 1;
        int nextState = 2;


        Map<Integer, Map<Character, Integer>> transitions = new HashMap<>();


        for (int i = 0; i < regex.length(); i++) {
            char letter = regex.charAt(i);

            if (i + 1 < regex.length() && regex.charAt(i + 1) == '*') {
                nextState -= 1;
            }

            if (letter == '+') {
                state = 1;
                nextState -= 1;
                continue;
            }

            if (letter == '*') {
                continue;
            }


            Map<Character, Integer> transitionMap = transitions.getOrDefault(state, new HashMap<>());
            transitionMap.put(letter, nextState);
            transitions.put(state, transitionMap);

            state = nextState;
            nextState++;
        }

        int id = regexList.size();
        System.out.println("Automaton created for regular expression " + regex + " with ID: " + id);
        regexList.add(regex);

        for (int startState : transitions.keySet()) {
            Map<Character, Integer> transitionMap = transitions.get(startState);
            for (char input : transitionMap.keySet()) {
                int endState = transitionMap.get(input);
                System.out.println(startState + "->" + input + "->" + endState);
            }
        }
    }
    public static List<String> getRegexList() {
        return regexList;
    }
}
