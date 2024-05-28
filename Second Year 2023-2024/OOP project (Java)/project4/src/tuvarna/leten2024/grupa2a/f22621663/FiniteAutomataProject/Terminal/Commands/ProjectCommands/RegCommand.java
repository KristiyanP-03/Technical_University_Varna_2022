package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;

import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;


public class RegCommand implements Command {
    private static final List<String> regexList = new ArrayList<>();
    private static final List<Map<Integer, Map<Character, List<Integer>>>> transitionList = new ArrayList<>();



    public static Map<Integer, Map<Character, List<Integer>>> getTransitions(int id) {
        if (id >= 0 && id < transitionList.size()) {
            return transitionList.get(id);
        } else {
            return null;
        }
    }

    public static void setRegexList(List<String> uniqueRegexes) {
        regexList.clear();
        regexList.addAll(uniqueRegexes);
    }


    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: reg <regex>");
            return;
        }



        String regex = args[0];
        if (regex.equals("emptyreg")) {
            regex = "&";
        } else if (!regex.matches("[a-zA-Z*+]+")) {
            System.out.println("Invalid regex. It should contain only letters, '*' or '+'!");
            return;
        }

        int state = 1;
        int nextState = 2;

        Map<Integer, Map<Character, List<Integer>>> transitions = new HashMap<>();


        for (int i = 0; i < regex.length(); i++) {
            char letter = regex.charAt(i);

            if (letter == '&') {
                transitions.computeIfAbsent(state, k -> new HashMap<>()).computeIfAbsent(letter, k -> new ArrayList<>()).add(state);
                i++;
            } else if (i + 1 < regex.length() && regex.charAt(i + 1) == '*') {
                transitions.computeIfAbsent(state, k -> new HashMap<>()).computeIfAbsent(letter, k -> new ArrayList<>()).add(state);
                i++;
            } else if (letter == '+') {
                transitions.computeIfAbsent(1, k -> new HashMap<>()).computeIfAbsent(regex.charAt(i + 1), k -> new ArrayList<>()).add(state);
                i++;
            } else {
                transitions.computeIfAbsent(state, k -> new HashMap<>()).computeIfAbsent(letter, k -> new ArrayList<>()).add(nextState);
                state = nextState;
                nextState++;
            }

        }


        int id = regexList.size();

        System.out.println("Automaton created for regular expression " + regex + " with ID: " + id);

        regexList.add(regex);
        transitionList.add(transitions);
        
    }

    public static List<String> getRegexList() {
        return regexList;
    }
}
