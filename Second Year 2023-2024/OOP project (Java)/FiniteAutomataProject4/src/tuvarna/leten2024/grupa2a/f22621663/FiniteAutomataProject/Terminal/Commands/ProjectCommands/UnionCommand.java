package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;

import java.util.List;

public class UnionCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: union <id1> <id2>");
            return;
        }

        try {
            int id1 = Integer.parseInt(args[0]);
            int id2 = Integer.parseInt(args[1]);

            List<String> regexList = RegCommand.getRegexList();

            if (id1 < 0 || id1 >= regexList.size() || id2 < 0 || id2 >= regexList.size()) {
                System.out.println("Invalid IDs.");
                return;
            }

            String regex1 = regexList.get(id1);
            String regex2 = regexList.get(id2);


            StringBuilder unionRegex = new StringBuilder();
            for (char c : regex1.toCharArray()) {
                if (regex2.contains(String.valueOf(c))) {
                    unionRegex.append(c);
                }
            }

            regexList.add(unionRegex.toString());

            System.out.println("Union of regexes with IDs " + id1 + " and " + id2 + " created with ID: " + (regexList.size() - 1));
        } catch (NumberFormatException e) {
            System.out.println("Invalid IDs.");
        }
    }
}

