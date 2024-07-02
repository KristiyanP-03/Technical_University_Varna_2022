package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;

import java.util.List;


/**
 * Имплементация на командата за създаване на позитивна обвивка на регулярен израз по зададен идентификатор.
 */
public class UnCommand implements Command {
    /**
     * Изпълнява командата за създаване на позитивна обвивка на регулярен израз по зададен идентификатор.
     *
     * @param args Аргументи на командата. Очаква се един аргумент: идентификатор на регулярния израз
     */
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Употреба: un <id>");
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

            if (regex.contains("*")) {
                String concatRegex = regex + regex;
                RegCommand regCommand = new RegCommand();
                regCommand.execute(new String[] { concatRegex });
                System.out.println("Създаден е нов автомат от позитивната обвивка на стария.");
            } else {
                System.out.println("Не може да бъде създадена позитивна обвивка на този автомат.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Невалиден идентификатор.");
        }
    }
}
