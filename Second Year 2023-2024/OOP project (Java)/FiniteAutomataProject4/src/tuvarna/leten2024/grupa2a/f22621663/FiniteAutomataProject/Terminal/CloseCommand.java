package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal;

public class CloseCommand implements Command {
    @Override
    public void execute(String[] args) {
        System.out.println("Затваря текущо отворения документ.");
    }
}
