package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands.*;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands.*;
import java.util.HashMap;
import java.util.Map;



public class CommandExecutor {
    private final Map<CommandType, Command> commandMap;
    private boolean fileOpened;
    private String currentFileName;

    public CommandExecutor() {
        commandMap = new HashMap<>();
        initializeCommands();
    }

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
        commandMap.put(CommandType.SAVEA, new SaveAutomataCommand());
        commandMap.put(CommandType.UNION, new UnionCommand());
        commandMap.put(CommandType.CONCAT, new ConcatCommand());
        commandMap.put(CommandType.UN, new UnCommand());
    }

    public void executeCommand(String command, String[] args) {
        CommandType commandType;
        try {
            commandType = CommandType.valueOf(command.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Невалидна команда.");
            return;
        }


        if (!fileOpened && (commandType == CommandType.SAVE || commandType == CommandType.SAVEAS || commandType == CommandType.CLOSE)) {
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

    public void setFileOpened(boolean isOpen) {
        this.fileOpened = isOpen;
    }

    public boolean isFileOpened() {
        return fileOpened;
    }

    public void setCurrentFileName(String fileName) {
        this.currentFileName = fileName;
    }

    public String getCurrentFileName() {
        return currentFileName;
    }
}
