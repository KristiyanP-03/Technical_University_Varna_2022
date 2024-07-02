package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;

import java.util.List;

/**
 * Имплементация на командата за проверка дали автоматът с определен идентификатор е краен.
 */
public class FiniteCommand implements Command {

    /**
     * Изпълнява командата за проверка дали автоматът с даден идентификатор е краен.
     * Извежда съобщение дали автоматът е краен или не е, в зависимост от наличието на звезда ('*') в регулярния израз.
     *
     * @param args Аргументи на командата. Очаква се да съдържа само един ID на автомата.
     *             Извежда съобщение за употреба, ако броят на аргументите не е правилен.
     */
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Употреба: finite <id>");
            return;
        }

        try {
            int id = Integer.parseInt(args[0]);

            List<String> regexList = RegCommand.getRegexList();

            if (id < 0 || id >= regexList.size()) {
                System.out.println("Невалиден идентификатор.");
                return;
            }

            String regex = regexList.get(id);

            if (regex.endsWith("*")) {
                System.out.println("Автоматът с идентификатор " + id + " не е краен.");
            } else {
                System.out.println("Автоматът с идентификатор " + id + " е краен.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Невалиден идентификатор.");
        }
    }
}


