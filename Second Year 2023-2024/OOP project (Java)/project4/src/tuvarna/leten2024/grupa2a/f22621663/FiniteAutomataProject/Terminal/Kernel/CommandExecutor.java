package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands.*;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands.*;
import java.util.HashMap;
import java.util.Map;


import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    private final Map<CommandType, Command> commandMap;
    private boolean fileOpened = false;

    public CommandExecutor() {
        commandMap = new HashMap<>();
        initializeCommands();
    }

    private void initializeCommands() {
        commandMap.put(CommandType.OPEN, new OpenCommand(this));
        commandMap.put(CommandType.CLOSE, new CloseCommand());
        commandMap.put(CommandType.SAVE, new SaveCommand());
        commandMap.put(CommandType.SAVEAS, new SaveAsCommand());
        commandMap.put(CommandType.HELP, new HelpCommand());
        commandMap.put(CommandType.EXIT, new ExitCommand());
        commandMap.put(CommandType.LIST, new ListCommand());
        commandMap.put(CommandType.PRINT, new PrintCommand());
        commandMap.put(CommandType.EMPTY, new EmptyCommand());
        commandMap.put(CommandType.DETERMINISTIC, new DeterministicCommand());
        commandMap.put(CommandType.RECOGNIZE, new RecognizeCommand());
        commandMap.put(CommandType.REG, new RegCommand());
        commandMap.put(CommandType.UNION, new UnionCommand());
        commandMap.put(CommandType.CONCAT, new ConcatCommand());
        commandMap.put(CommandType.UN, new UnCommand());
    }


    public boolean isFileOpened() {
        return fileOpened;
    }
    public void setFileOpened(boolean fileOpened) {
        this.fileOpened = fileOpened;
    }



    public void executeCommand(String command, String[] args) {
        CommandType commandType;
        try {
            commandType = CommandType.valueOf(command.toUpperCase());
        } catch (IllegalArgumentException e) {
            System.out.println("Невалидна команда.");
            return;
        }

        Command cmd = commandMap.get(commandType);
        if (cmd == null) {
            System.out.println("Невалидна команда.");
            return;
        }

        cmd.execute(args);
    }
}
