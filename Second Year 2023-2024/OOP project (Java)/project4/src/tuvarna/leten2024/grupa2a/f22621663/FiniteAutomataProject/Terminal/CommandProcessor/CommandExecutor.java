package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands.*;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands.*;
import java.util.HashMap;
import java.util.Map;



import java.util.HashMap;
import java.util.Map;

/**
 * Класът CommandExecutor отговаря за изпълнението на команди.
 */
public class CommandExecutor {
    private final Map<CommandType, Command> commandMap;
    private boolean fileOpened;
    private String currentFileName;

    /**
     * Конструктор за инициализиране на CommandExecutor.
     */
    public CommandExecutor() {
        commandMap = new HashMap<>();
        initializeCommands();
    }

    /**
     * Инициализира и добавя всички налични команди в командната карта.
     */
    private void initializeCommands() {
        commandMap.put(CommandType.OPEN, new OpenCommand(this));
        commandMap.put(CommandType.CLOSE, new CloseCommand(this));
        commandMap.put(CommandType.SAVE, new SaveCommand(this));
        commandMap.put(CommandType.SAVEAS, new SaveAsCommand(this));
        commandMap.put(CommandType.HELP, new HelpCommand());
        commandMap.put(CommandType.EXIT, new ExitCommand());
        commandMap.put(CommandType.LIST, new ListCommand());
        commandMap.put(CommandType.PRINT, new PrintCommand());
        commandMap.put(CommandType.EMPTY, new EmptyCommand());
        commandMap.put(CommandType.DETERMINISTIC, new DeterministicCommand());
        commandMap.put(CommandType.RECOGNIZE, new RecognizeCommand());
        commandMap.put(CommandType.REG, new RegCommand());
        commandMap.put(CommandType.SAVEA, new SaveaCommand());
        commandMap.put(CommandType.UNION, new UnionCommand());
        commandMap.put(CommandType.CONCAT, new ConcatCommand());
        commandMap.put(CommandType.UN, new UnCommand());
        commandMap.put(CommandType.FINITE, new FiniteCommand());
        commandMap.put(CommandType.MUTATOR, new MutatorCommand());
    }

    /**
     * Изпълнява командата, базирана на въведения низ и аргументи.
     *
     * @param command Командата, която ще бъде изпълнена.
     * @param args Аргументите на командата.
     */
    public void executeCommand(String command, String[] args) {
        CommandType commandType;
        try {
            commandType = CommandType.valueOf(command.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Невалидна команда.");
            return;
        }

        if (!fileOpened &&
                (commandType == CommandType.SAVE || commandType == CommandType.SAVEAS
                        || commandType == CommandType.CLOSE)) {
            System.out.println("Файлът не е отворен за четене. Моля, отворете файла с командата 'open'.");
            return;
        }

        Command cmd = commandMap.get(commandType);
        if (cmd == null) {
            System.out.println("Невалидна команда.");
            return;
        }

        cmd.execute(args);
    }

    /**
     * Задава състоянието на отворен файл.
     *
     * @param isOpen Дали файлът е отворен.
     */
    public void setFileOpened(boolean isOpen) {
        this.fileOpened = isOpen;
    }

    /**
     * Проверява дали файлът е отворен.
     *
     * @return Дали файлът е отворен.
     */
    public boolean isFileOpened() {
        return fileOpened;
    }

    /**
     * Задава текущото име на файла.
     *
     * @param fileName Името на текущия файл.
     */
    public void setCurrentFileName(String fileName) {
        this.currentFileName = fileName;
    }

    /**
     * Връща текущото име на файла.
     *
     * @return Името на текущия файл.
     */
    public String getCurrentFileName() {
        return currentFileName;
    }
}
