package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.TerminalFunctionality.Command;


public class CloseCommand implements Command {
    @Override
    public void functionality(String[] args) {



        System.out.println("Successfully closed file.xml");
    }
}
