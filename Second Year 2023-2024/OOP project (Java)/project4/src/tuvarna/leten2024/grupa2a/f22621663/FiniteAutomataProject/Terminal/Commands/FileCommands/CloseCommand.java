package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor.CommandExecutor;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;



/**
 * Класът CloseCommand представлява команда за затваряне на отворен файл.
 */
public class CloseCommand implements Command {
    private final CommandExecutor commandExecutor;

    /**
     * Конструктор за създаване на CloseCommand с подаден CommandExecutor.
     *
     * @param commandExecutor обектът, който изпълнява командите
     */
    public CloseCommand(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    /**
     * Изпълнява командата за затваряне на отворен файл.
     * Ако има отворен файл, той ще бъде затворен.
     * Ако няма отворен файл, ще бъде изведено съобщение за грешка.
     *
     * @param args аргументи на командата
     */
    @Override
    public void execute(String[] args) {
        if (commandExecutor.isFileOpened()) {
            System.out.println("Файлът е затворен.");
            commandExecutor.setFileOpened(false);
        } else {
            System.out.println("Няма отворен файл, който да затворите.");
        }
    }
}







