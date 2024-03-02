package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.TerminalFunctionality.Command;

public class ExitCommand implements Command {
    public void functionality(String[] args) {
        System.out.println("Exiting the program...");
        System.exit(0);
    }
}
