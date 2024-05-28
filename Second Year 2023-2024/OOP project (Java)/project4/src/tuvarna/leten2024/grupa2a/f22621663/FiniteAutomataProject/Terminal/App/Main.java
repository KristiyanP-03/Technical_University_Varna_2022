package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.App;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor.*;



public class Main {
    private final CommandExecutor executor;

    public Main(CommandExecutor executor) {
        this.executor = executor;
    }

    public void run() {
        CommandReader reader = new CommandReader();
        String input;

        while (true) {
            System.out.print("> ");

            input = reader.readCommand();
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String[] commandArgs = new String[tokens.length - 1];

            System.arraycopy(tokens, 1, commandArgs, 0, commandArgs.length);


            executor.executeCommand(command, commandArgs);
        }
    }

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();
        Main main = new Main(executor);
        main.run();
    }
}
