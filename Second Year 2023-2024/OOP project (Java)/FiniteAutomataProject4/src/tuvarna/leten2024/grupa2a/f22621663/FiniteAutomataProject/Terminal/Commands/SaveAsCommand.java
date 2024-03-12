package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.TerminalFunctionality.Command;

public class SaveAsCommand implements Command {
    @Override
    public void functionality(String[] args) {

        if (args.length < 2) {
            System.out.println("No enough parameters: saveas <file>");
            return;
        }




        String filename = args[1];
        System.out.println("Successfully saved " + filename);
    }
}
