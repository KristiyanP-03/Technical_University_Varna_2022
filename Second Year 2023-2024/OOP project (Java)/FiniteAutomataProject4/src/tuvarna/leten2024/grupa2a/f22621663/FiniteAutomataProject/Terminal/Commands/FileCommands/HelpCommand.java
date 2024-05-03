package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;

public class HelpCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 0) {
            System.out.println("ERROR! Expected command: help");
        }


        System.out.println("The following commands are supported:");

        System.out.println("open <file> opens <file>");
        System.out.println("close closes currently opened file");
        System.out.println("save saves the currently open file");
        System.out.println("saveas <file> saves the currently open file in <file>");
        System.out.println("help prints this information");
        System.out.println("exit exists the program");
    }
}
