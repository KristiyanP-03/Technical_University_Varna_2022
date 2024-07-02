package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor.Automaton;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import java.util.*;



/**
 * Имплементация на командата за създаване на автомат от регулярен израз и регистриране на този израз.
 */
public class RegCommand implements Command {
    private static final List<String> regexList = new ArrayList<>();
    private static final List<Automaton> automatonList = new ArrayList<>();

    /**
     * Връща автомат по зададен идентификационен номер.
     *
     * @param id Идентификационен номер на автомата
     * @return Автомат със съответния идентификационен номер или null, ако не съществува такъв автомат
     */
    public static Automaton getAutomaton(int id) {
        if (id >= 0 && id < automatonList.size()) {
            return automatonList.get(id);
        } else {
            return null;
        }
    }

    /**
     * Задава списък с уникални регулярни изрази.
     *
     * @param uniqueRegexes Списък с уникални регулярни изрази
     */
    public static void setRegexList(List<String> uniqueRegexes) {
        regexList.clear();
        regexList.addAll(uniqueRegexes);
    }

    /**
     * Изпълнява командата за създаване на автомат от даден регулярен израз и регистрира този израз.
     *
     * @param args Аргументи на командата. Очаква се един аргумент - регулярен израз
     */
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Употреба: reg <regex>");
            return;
        }

        String regex = args[0];
        if (regex.equals("emptyreg")) {
            regex = "&";
        } else if (!regex.matches("[a-zA-Z*+]+")) {
            System.out.println("Невалиден регулярен израз. Трябва да съдържа само букви, '*' или '+'!");
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
            } else if (letter == '+') {
                continue;
            } else {
                transitions.add(new Automaton.Transition(state, letter, nextState));
                state = nextState;
                nextState++;
            }
        }

        int id = regexList.size();

        System.out.println("Създаден автомат за регулярен израз " + regex + " с идентификатор: " + id);

        regexList.add(regex);
        automatonList.add(new Automaton(transitions));
    }

    /**
     * Връща списък с регистрираните регулярни изрази.
     *
     * @return Списък с регистрираните регулярни изрази
     */
    public static List<String> getRegexList() {
        return regexList;
    }
}
