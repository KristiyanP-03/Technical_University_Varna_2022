package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal;

import java.util.List;
public class ListCommand implements Command {
    @Override
    public void execute(String[] args) {
        List<String> regexList = RegCommand.getRegexList();
        if (regexList.isEmpty()) {
            System.out.println("Няма регистрирани регулярни изрази.");
            return;
        }

        System.out.println("Регистрирани регулярни изрази:");
        for (String regex : regexList) {
            System.out.println(regex);
        }
    }
}
