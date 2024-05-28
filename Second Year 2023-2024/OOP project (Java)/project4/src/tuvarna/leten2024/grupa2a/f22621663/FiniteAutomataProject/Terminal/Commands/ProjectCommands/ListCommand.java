package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;

import java.util.List;
public class ListCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 0) {
            System.out.println("Usage: list");
            return;
        }

        List<String> regexList = RegCommand.getRegexList();

        if (regexList.isEmpty()) {
            System.out.println("Няма регистрирани регулярни изрази.");
            return;
        }


        System.out.println("Регистрирани регулярни изрази:");
        for (String regex : regexList) {
            int id = regexList.indexOf(regex);
            System.out.println("ID: " + id + ", Регекс: " + regex);
        }
    }
}
