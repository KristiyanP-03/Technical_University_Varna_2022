package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;



/**
 * Имплементация на командата за определяне дали езикът на даден автомат е празен.
 */
public class EmptyCommand implements Command {

    /**
     * Изпълнява командата за определяне дали езикът на автомат с определено ID е празен.
     * Извежда дали регулярният израз е празен или предоставя информация за началните и крайните му състояния.
     *
     * @param args Аргументи на командата. Очаква се да съдържа само един ID на автомата.
     *             Извежда съобщение за употреба, ако броят на аргументите не е правилен.
     */
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Употреба: empty <id>");
            return;
        }

        String regex = RegCommand.getRegexList().get(Integer.parseInt(args[0]));
        if (regex.equals("&")) {
            System.out.println("Да. Регулярният израз е празен, защото няма крайно състояние.");
        } else {
            System.out.println("Не. Регулярният израз има начално състояние 1 и крайно състояние " + (regex.length() + 1) + ".");
        }
    }
}

