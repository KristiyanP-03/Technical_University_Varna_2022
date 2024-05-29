package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor.Automaton;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import java.util.*;



public class RegCommand implements Command {
    private static final List<String> regexList = new ArrayList<>();
    private static final List<Automaton> automatonList = new ArrayList<>();

    public static Automaton getAutomaton(int id) {
        if (id >= 0 && id < automatonList.size()) {
            return automatonList.get(id);
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


        int state = 0;
        int nextState = 1;
        List<Automaton.Transition> transitions = new ArrayList<>();

        for (int i = 0; i < regex.length(); i++) {
            char letter = regex.charAt(i);

            if (letter == '&') {
                transitions.add(new Automaton.Transition(state, letter, state));

            } else if (i + 1 < regex.length() && regex.charAt(i + 1) == '*') {
                transitions.add(new Automaton.Transition(state, letter, state));
                i++;
            } else if (i + 1 < regex.length() && regex.charAt(i + 1) == '+') {
                transitions.add(new Automaton.Transition(state, letter, nextState));
                state = 0;
                i++;
            } else {
                transitions.add(new Automaton.Transition(state, letter, nextState));
                state = nextState;
                nextState++;
            }
        }

        int id = regexList.size();

        System.out.println("Automaton created for regular expression " + regex + " with ID: " + id);

        regexList.add(regex);
        automatonList.add(new Automaton(transitions));
    }

    public static List<String> getRegexList() {
        return regexList;
    }
}