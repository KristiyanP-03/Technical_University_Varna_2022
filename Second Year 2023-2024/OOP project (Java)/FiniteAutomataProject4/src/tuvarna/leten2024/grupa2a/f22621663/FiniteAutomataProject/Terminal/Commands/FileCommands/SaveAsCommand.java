package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;

public class SaveAsCommand implements Command {
    @Override
    public void execute(String[] args) {
        System.out.println("Записва направените промени във файл, като позволява на потребителя да укаже неговия път.");
    }
}
