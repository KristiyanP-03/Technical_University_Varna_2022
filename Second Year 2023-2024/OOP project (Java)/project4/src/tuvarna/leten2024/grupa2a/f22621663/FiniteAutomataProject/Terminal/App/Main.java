package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.App;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.CommandProcessor.*;
import java.util.Scanner;



/**
 * Класът Main е началната точка на приложението.
 * Непрекъснато чете потребителски вход от конзолата,
 * обработва входа за извличане на команди и аргументи,
 * и след това изпълнява съответната команда с помощта на CommandExecutor.
 */
public class Main {

    /**
     * Методът main инициализира CommandExecutor и Scanner,
     * след което влиза в цикъл за непрекъснато четене и обработка на потребителския вход.
     *
     * @param args Командни аргументи (не се използват в това приложение).
     */
    public static void main(String[] args) {
        CommandExecutor executor = new CommandExecutor();
        Scanner scanner = new Scanner(System.in);

        String input;
        while (true){
            System.out.print("> ");

            input = scanner.nextLine().trim();
            String[] commandParts = input.split("\\s+");
            String command = commandParts[0];

            String[] commandArgs = new String[commandParts.length - 1];
            System.arraycopy(commandParts, 1, commandArgs, 0, commandArgs.length);
            executor.executeCommand(command, commandArgs);
        }
    }
}