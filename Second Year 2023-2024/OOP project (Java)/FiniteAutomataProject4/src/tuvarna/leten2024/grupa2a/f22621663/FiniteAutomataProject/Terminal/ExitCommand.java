package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal;

public class ExitCommand implements Command {
    @Override
    public void execute(String[] args) {
        System.out.println("Излиза от програмата.");
    }
}
