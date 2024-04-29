package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;

public class PrintCommand implements Command {
    @Override
    public void execute(String[] args) {
        System.out.println("Извежда информация за всички преходи в автомата с даден идентификатор.");
    }
}
