package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.FileCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;

public class HelpCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 0) {
            System.out.println("ERROR! Expected command: help");
            return;
        }

        StringBuilder helpMessage = new StringBuilder("The following commands are supported:\n\n");

        helpMessage.append("open <file> opens <file>\n");
        helpMessage.append("close closes currently opened file\n");
        helpMessage.append("save saves the currently open file\n");
        helpMessage.append("saveas <file> saves the currently open file in <file>\n");
        helpMessage.append("help prints this information\n");
        helpMessage.append("exit exists the program\n\n");

        helpMessage.append("list Списък с идентификаторите на всички прочетени автомати\n");
        helpMessage.append("print <id> Извежда информация за всички преходи в автомата\n");
        helpMessage.append("save <id> <filename> Записва автомат във файл\n");
        helpMessage.append("empty <id> Проверява дали езикът на автомата е празен\n");
        helpMessage.append("deterministic <id> Проверява дали автомат е детерминиран\n");
        helpMessage.append("recognize <id> <word> Проверява дали дадена дума е в езика на автомата\n");
        helpMessage.append("union <id1> <id2> Намира обединението на два автомата и създава нов автомат.\n");
        helpMessage.append("Отпечатва идентификатора на новия автомат\n");
        helpMessage.append("concat <id1> <id2> Намира конкатенацията на два автомата и създава нов автомат.\n");
        helpMessage.append("Отпечатва идентификатора на новия автомат\n");
        helpMessage.append("un <id> Намира позитивна обвивка на автомат и създава нов автомат.\n");
        helpMessage.append("Отпечатва идентификатора на новия автомат\n");
        helpMessage.append("reg <regex> Създава нов автомат по даден регулярен израз (теорема на Клини).\n");
        helpMessage.append("Отпечатва идентификатора на новия автомат\n");

        System.out.println(helpMessage);
    }
}

