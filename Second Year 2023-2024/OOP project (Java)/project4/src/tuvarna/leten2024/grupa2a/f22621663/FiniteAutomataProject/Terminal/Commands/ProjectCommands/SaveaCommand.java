package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;



/**
 * Имплементация на командата за запис на регулярен израз във файл по зададен идентификатор.
 */
public class SaveaCommand implements Command {
    /**
     * Изпълнява командата за запис на регулярен израз във файл по зададени идентификатор и име на файл.
     *
     * @param args Аргументи на командата. Очаква се два аргумента: идентификатор на регулярния израз и име на файл
     */
    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Употреба: savea <id> <filename>");
            return;
        }

        String id = args[0];
        String filename = args[1];

        List<String> regexList = RegCommand.getRegexList();

        try {
            int index = Integer.parseInt(id);
            if (index >= 0 && index < regexList.size()) {
                String regex = regexList.get(index);
                try (PrintWriter writer = new PrintWriter(new FileWriter(filename))) {
                    writer.println(regex);
                    System.out.println("Автоматът е успешно записан във файл " + filename);
                } catch (IOException e) {
                    System.out.println("Грешка при запис на автомат във файл: " + e.getMessage());
                }
            } else {
                System.out.println("Невалиден идентификатор: " + id);
            }
        } catch (NumberFormatException e) {
            System.out.println("Невалиден идентификатор: " + id);
        }
    }
}
