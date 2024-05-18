package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.App;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.CommandExecutor;

import java.util.Scanner;

/**
 * Класът Main е входната точка на приложението.
 * Инициализира CommandExecutor и обработва входа от потребителя, за да изпълнява команди.
 */
public class Main {
    /**
     * Главният метод на приложението. Чете вход от потребителя, обработва команди
     * и ги изпълнява чрез CommandExecutor.
     *
     * @param args Командни аргументи (не се използват).
     */
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();
        Scanner scanner = new Scanner(System.in);

        String input;
        do {
            System.out.print("> ");
            input = scanner.nextLine().trim();
            String[] tokens = input.split("\\s+");
            String command = tokens[0];
            String[] commandArgs = new String[tokens.length - 1];
            System.arraycopy(tokens, 1, commandArgs, 0, commandArgs.length);
            executor.executeCommand(command, commandArgs);
        } while (!input.equals("exit"));

        System.out.println("Програмата приключи.");
    }
}

