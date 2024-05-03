package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands.*;
import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands.*;
import java.util.HashMap;
import java.util.Map;

public class CommandExecutor {
    private final Map<String, Command> commandMap;

    public CommandExecutor() {
        commandMap = new HashMap<>();
        initializeCommands();
    }

    private void initializeCommands() {
        commandMap.put("open", new OpenCommand());
        commandMap.put("close", new CloseCommand());
        commandMap.put("save", new SaveCommand());
        commandMap.put("saveas", new SaveAsCommand());
        commandMap.put("help", new HelpCommand());
        commandMap.put("exit", new ExitCommand());
        commandMap.put("list", new ListCommand());
        commandMap.put("print", new PrintCommand());
        commandMap.put("empty", new EmptyCommand());
        commandMap.put("deterministic", new DeterministicCommand());
        commandMap.put("recognize", new RecognizeCommand());
        commandMap.put("reg", new RegCommand());
        commandMap.put("union", new UnionCommand());
        commandMap.put("concat", new ConcatCommand());
        commandMap.put("un", new UnCommand());
    }

    public void executeCommand(String command, String[] args) {
        Command cmd = commandMap.get(command);
        if (cmd == null) {
            System.out.println("Невалидна команда.");
            return;
        }

        cmd.execute(args);
    }
}
