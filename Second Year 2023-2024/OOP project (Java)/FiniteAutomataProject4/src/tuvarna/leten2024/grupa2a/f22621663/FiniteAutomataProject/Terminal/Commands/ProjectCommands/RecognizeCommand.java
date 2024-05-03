package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;

public class RecognizeCommand implements Command {
    @Override
    public void execute(String[] args) {
        System.out.println("Проверява дали дадената дума е в езика на автомата или не.");
    }
}
