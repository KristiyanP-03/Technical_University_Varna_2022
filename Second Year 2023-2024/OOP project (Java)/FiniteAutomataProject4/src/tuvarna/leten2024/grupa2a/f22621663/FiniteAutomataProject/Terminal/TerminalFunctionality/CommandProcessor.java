package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.TerminalFunctionality;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CommandProcessor {
    private final BufferedReader reader;
    private final Command[] commands;

    
    public CommandProcessor() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        
        //Тук се добавят нови команди.
        commands = new Command[]{
                new OpenCommand(),
                new CloseCommand(),
                new SaveCommand(),
                new SaveAsCommand(),
                new HelpCommand(),
                new ExitCommand(),

                new ListCommand(),
                new PrintCommand(),
                new SaveAutomatonCommand(),
                new EmptyCommand(),
                new DeterministicCommand(),
                new RecognizeCommand(),
                new UnionCommand(),
                new ConcatCommand(),
                new PositiveWrapCommand(),
                new RegularExpressionCommand()
        };
    }

    public void processInput() {
        while (true) {
            System.out.print("> ");
            
            try {
                String input = reader.readLine();
                String[] tokens = input.split("\\s+");
                String commandName = tokens[0];
                
                String[] args = new String[tokens.length - 1];
                System.arraycopy(tokens, 1, args, 0, args.length);

                boolean isFound = false;
                for (Command command : commands) {
                    if (command.getClass().getSimpleName().toLowerCase().startsWith(commandName)) {
                        command.functionality(args);
                        isFound = true;
                        break;
                    }
                }

                if (!isFound) {
                    System.out.println("Command not isFound. Type 'help' for available commands.");
                }
                
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        
    }
}
