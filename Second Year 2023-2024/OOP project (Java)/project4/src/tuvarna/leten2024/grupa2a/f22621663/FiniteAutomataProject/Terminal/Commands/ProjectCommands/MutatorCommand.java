package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;

import java.util.List;

/**
 * Имплементация на командата за мутация на регулярен израз по даден ID.
 */
public class MutatorCommand implements Command {

    /**
     * Изпълнява командата за мутация на регулярен израз по даден ID.
     * Променя регулярния израз, като премахва всички мутации на "*" след символ от азбуката и символа "+".
     * Ако ID е невалиден, извежда съобщение за невалиден ID.
     *
     * @param args Аргументи на командата. Очаква се един аргумент - ID на регулярния израз, който ще се мутира.
     */
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Употреба: mutator <id>");
            return;
        }

        try {
            int id = Integer.parseInt(args[0]);

            List<String> regexList = RegCommand.getRegexList();

            if (id < 0 || id >= regexList.size()) {
                System.out.println("Невалиден ID.");
                return;
            }

            String regex = regexList.get(id);

            // Премахване на мутации на "*" след символ от азбуката и символа "+".
            regex = regex.replaceAll("[a-z][*]", "");
            regex = regex.replaceAll("[+]", "");

            // Извикване на командата за регистриране на мутирания регулярен израз.
            RegCommand regCommand = new RegCommand();
            regCommand.execute(new String[]{regex});

        } catch (NumberFormatException e) {
            System.out.println("Невалиден ID.");
        }
    }
}

