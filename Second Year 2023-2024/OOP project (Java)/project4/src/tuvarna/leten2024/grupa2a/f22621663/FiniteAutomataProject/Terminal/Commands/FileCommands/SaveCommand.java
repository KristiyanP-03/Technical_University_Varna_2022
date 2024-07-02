package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor.CommandExecutor;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands.RegCommand;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;



/**
 * Класът SaveCommand представлява команда за запазване на текущото състояние на автоматите в отворения файл.
 */
public class SaveCommand implements Command {
    private final CommandExecutor commandExecutor;

    /**
     * Конструктор за SaveCommand.
     *
     * @param commandExecutor изпълнител на командите
     */
    public SaveCommand(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    /**
     * Изпълнява командата за запазване на текущото състояние на автоматите в отворения файл.
     *
     * @param args аргументи на командата, които трябва да бъдат празни ([]), иначе извежда съобщение за грешка
     */
    @Override
    public void execute(String[] args) {
        if (args.length != 0) {
            System.out.println("Usage: save");
            return;
        }

        String filename = commandExecutor.getCurrentFileName();

        if (filename == null) {
            System.out.println("No file opened. Please open a file first.");
            return;
        }

        List<String> regexList = RegCommand.getRegexList();

        try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
            for (String regex : regexList) {
                writer.println(regex);
            }
            System.out.println("Automatons saved successfully to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving automatons to file: " + e.getMessage());
        }
    }
}

