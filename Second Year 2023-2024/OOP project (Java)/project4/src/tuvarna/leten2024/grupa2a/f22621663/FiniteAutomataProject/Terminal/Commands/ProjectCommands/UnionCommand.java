package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import java.util.List;



/**
 * Имплементация на командата за обединение на два регулярни израза по зададени идентификатори.
 */
public class UnionCommand implements Command {
    /**
     * Изпълнява командата за обединение на два регулярни израза по зададени идентификатори.
     *
     * @param args Аргументи на командата. Очаква се два аргумента: идентификатори на регулярните изрази
     */
    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Употреба: union <id1> <id2>");
            return;
        }

        try {
            int id1 = Integer.parseInt(args[0]);
            int id2 = Integer.parseInt(args[1]);

            List<String> regexList = RegCommand.getRegexList();

            if (id1 < 0 || id1 >= regexList.size() || id2 < 0 || id2 >= regexList.size()) {
                System.out.println("Невалидни идентификатори.");
                return;
            }

            String regex1 = regexList.get(id1);
            String regex2 = regexList.get(id2);

            // Създава се нов регулярен израз, който е обединение на символите от regex1 и regex2
            StringBuilder unionRegex = new StringBuilder();
            for (char c : regex1.toCharArray()) {
                if (regex2.contains(String.valueOf(c))) {
                    unionRegex.append(c);
                }
            }

            RegCommand regCommand = new RegCommand();
            regCommand.execute(new String[] { unionRegex.toString() });

            System.out.println("Обединение на регулярните изрази с идентификатори " + id1 + " и " + id2 +
                    " създадено с идентификатор: " + (regexList.size() - 1));
        } catch (NumberFormatException e) {
            System.out.println("Невалидни идентификатори.");
        }
    }
}


