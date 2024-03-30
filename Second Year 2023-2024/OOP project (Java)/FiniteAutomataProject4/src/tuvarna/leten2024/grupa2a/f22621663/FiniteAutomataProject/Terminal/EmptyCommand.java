package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal;

public class EmptyCommand implements Command {
    @Override
    public void execute(String[] args) {
        System.out.println("Проверява дали езикът на автомата е празен или не.");
    }
}
