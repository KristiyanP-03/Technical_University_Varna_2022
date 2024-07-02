package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import java.util.List;



/**
 * Имплементация на командата за извеждане на списък с всички регистрирани регулярни изрази.
 */
public class ListCommand implements Command {

    /**
     * Изпълнява командата за извеждане на списък с всички регистрирани регулярни изрази.
     * Извежда съобщение за употреба, ако броят на аргументите не е нула.
     * Извежда съобщение, че няма регистрирани регулярни изрази, ако списъкът е празен.
     * Извежда всеки регистриран регулярен израз с неговият ID и съответния регекс.
     *
     * @param args Аргументи на командата. Очаква се списъкът да бъде празен.
     */
    @Override
    public void execute(String[] args) {
        if (args.length != 0) {
            System.out.println("Употреба: list");
            return;
        }

        List<String> regexList = RegCommand.getRegexList();

        if (regexList.isEmpty()) {
            System.out.println("Няма регистрирани регулярни изрази.");
            return;
        }

        System.out.println("Регистрирани регулярни изрази:");
        for (String regex : regexList) {
            int id = regexList.indexOf(regex);
            System.out.println("ID: " + id + ", Регекс: " + regex);
        }
    }
}
