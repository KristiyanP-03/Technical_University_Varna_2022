package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;

public class ExitCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length > 1) {
            System.out.println("ERROR! Unexpected argument: " + args[1]);
            return;
        }

        if (args.length == 1 && !args[0].trim().equals("exit")) {
            System.out.println("ERROR! Unexpected argument: " + args[0]);
            return;
        }

        System.out.println("Exiting...");
        System.exit(0);
    }
}