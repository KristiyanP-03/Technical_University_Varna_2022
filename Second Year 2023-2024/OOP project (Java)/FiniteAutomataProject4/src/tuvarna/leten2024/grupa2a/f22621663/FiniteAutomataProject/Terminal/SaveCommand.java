package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal;

public class SaveCommand implements Command {
    @Override
    public void execute(String[] args) {
        System.out.println("Записва направените промени обратно в същия файл.");
    }
}
