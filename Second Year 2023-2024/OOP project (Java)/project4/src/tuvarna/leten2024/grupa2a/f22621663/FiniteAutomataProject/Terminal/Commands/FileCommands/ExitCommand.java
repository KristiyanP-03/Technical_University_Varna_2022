package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;

/**
 * Класът ExitCommand представлява команда за изход от програмата.
 */
public class ExitCommand implements Command {
    /**
     * Изпълнява командата за изход от програмата.
     * Проверява аргументите и ако има повече от един аргумент или първият аргумент не е "exit", изписва съобщение за грешка.
     * В противен случай, изписва съобщение за изход и прекратява изпълнението на програмата.
     *
     * @param args аргументи на командата
     */
    @Override
    public void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("ERROR! Unexpected argument: " + args[1]);
            return;
        }

        if (args.length == 1 && !args[0].trim().equals("exit")) {
            System.out.println("ERROR! Unexpected argument: " + args[0]);
            return;
        }

        System.out.println("Exiting the program...");
        System.exit(0);
    }
}
