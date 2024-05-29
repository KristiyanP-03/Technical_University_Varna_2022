package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import java.util.List;



public class ConcatCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("ERROR! Expected command: concat <id1> <id2>");
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


            String concatRegex = regex1 + regex2;
            RegCommand regCommand = new RegCommand();
            regCommand.execute(new String[] {concatRegex});



            System.out.println("Concatenation of regexes with IDs " + id1 + " and " + id2 + " created with ID: " + (regexList.size() - 1));

        } catch (NumberFormatException e) {
            System.out.println("Invalid IDs.");
        }
    }
}
