package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;

public class OpenCommand implements Command {
    @Override
    public void execute(String[] args) {
        System.out.println("Зарежда съдържанието на даден файл.");
    }
}
