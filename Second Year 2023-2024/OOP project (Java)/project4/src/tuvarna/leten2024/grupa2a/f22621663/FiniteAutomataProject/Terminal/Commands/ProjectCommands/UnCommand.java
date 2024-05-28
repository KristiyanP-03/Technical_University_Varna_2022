package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;

import java.util.List;

public class UnCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: un <id>");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID: " + args[0]);
            return;
        }

        List<String> regexList = RegCommand.getRegexList();

        if (id >= 0 && id < ((List<?>) regexList).size()) {
            String oldRegex = regexList.get(id);
            String newRegex = removeStarsAndPluses(oldRegex);

            Command regCommand = new RegCommand();
            regCommand.execute(new String[]{newRegex});
        } else {
            System.out.println("Invalid ID: " + id);
        }
    }

    private String removeStarsAndPluses(String regex) {
        return regex.replaceAll("[*+]", "");
    }
}
