package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.App;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.CommandExecutor;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();
        Scanner scanner = new Scanner(System.in);

        String input;

        while(true) {
            System.out.print("> ");

            input = scanner.nextLine().trim();

            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            String[] commandArgs = new String[tokens.length - 1];
            System.arraycopy(tokens, 1, commandArgs, 0, commandArgs.length);


            if (!executor.isFileOpened() && !command.equalsIgnoreCase("open")) {
                System.out.println("Файлът не е отворен. Моля, отворете файла с командата 'open'.");
                continue;
            }

            executor.executeCommand(command, commandArgs);
        }
    }
}


