package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor.Automaton;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import java.util.List;



/**
 * Имплементация на командата за извеждане на информация за регулярен израз и свързания с него автомат по даден ID.
 */
public class PrintCommand implements Command {

    /**
     * Изпълнява командата за извеждане на информация за регулярен израз и свързания с него автомат по даден ID.
     * Ако ID е невалиден или не съществува такъв регулярен израз, извежда съобщение за грешка.
     *
     * @param args Аргументи на командата. Очаква се един аргумент - ID на регулярния израз за извеждане на информация.
     */
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Употреба: print <id>");
            return;
        }

        try {
            int id = Integer.parseInt(args[0]);

            List<String> regexList = RegCommand.getRegexList();

            if (id >= 0 && id < regexList.size()) {
                System.out.println("Автомат за регулярен израз с ID " + id + ":");

                String regex = regexList.get(id);
                System.out.println("Регулярен израз: " + regex);

                Automaton automaton = RegCommand.getAutomaton(id);

                if (automaton != null) {
                    for (Automaton.Transition transition : automaton.getTransitions()) {
                        System.out.println(transition.getFromState() + " -" + transition.getSymbol() + "-> " + transition.getToState());
                    }
                } else {
                    System.out.println("Не е намерен автомат за ID: " + id);
                }
            } else {
                System.out.println("Невалиден ID: " + id);
            }
        } catch (NumberFormatException e) {
            System.out.println("Невалиден ID: " + args[0]);
        }
    }
}
