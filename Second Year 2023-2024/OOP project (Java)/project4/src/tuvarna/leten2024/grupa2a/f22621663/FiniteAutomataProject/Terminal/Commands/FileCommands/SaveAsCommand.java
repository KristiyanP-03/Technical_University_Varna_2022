package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor.CommandExecutor;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands.RegCommand;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import java.io.*;
import java.nio.file.*;



/**
 * Класът SaveAsCommand представлява команда за запазване на съдържанието на текущия файл в нов файл.
 */
public class SaveAsCommand implements Command {
    private final CommandExecutor commandExecutor;

    /**
     * Конструктор за SaveAsCommand.
     *
     * @param commandExecutor изпълнител на командите
     */
    public SaveAsCommand(CommandExecutor commandExecutor) {
        this.commandExecutor = commandExecutor;
    }

    /**
     * Изпълнява командата за запазване на съдържанието на текущия файл в нов файл.
     *
     * @param args аргументи на командата, като очаква точно два аргумента: път до директория и име на файл
     */
    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: saveas <directory> <filename>");
            return;
        }

        String directoryPath = args[0];
        String fileName = args[1];

        if (!commandExecutor.isFileOpened()) {
            System.out.println("No file opened. Please open a file first.");
            return;
        }

        Path directory = Paths.get(directoryPath);

        String currentFileName = commandExecutor.getCurrentFileName();
        Path currentFilePath = Paths.get(currentFileName);

        Path newFilePath = directory.resolve(fileName);

        try (PrintWriter writer = new PrintWriter(Files.newBufferedWriter(newFilePath))) {
            for (String regex : RegCommand.getRegexList()) {
                writer.println(regex);
            }
            System.out.println("Automatons saved successfully to " + newFilePath);
        } catch (IOException e) {
            System.out.println("Error saving automatons to file: " + e.getMessage());
        }
    }
}
