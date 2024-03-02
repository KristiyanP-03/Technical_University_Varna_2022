package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.TerminalFunctionality.Command;

public class OpenCommand implements Command {
    public void functionality(String[] args) {
        if (args.length < 2) {
            System.out.println("Usage: open <file>");
            return;
        }
        String filename = args[1];

        //И тук ми трябва функционалност.

        System.out.println("Successfully opened " + filename);
    }
}
