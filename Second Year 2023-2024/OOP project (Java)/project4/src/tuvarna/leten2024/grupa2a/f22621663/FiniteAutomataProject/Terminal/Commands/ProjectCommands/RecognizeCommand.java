package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import java.util.List;



/**
 * Имплементация на командата за разпознаване дали дадена дума е приета от регулярен израз с определен ID.
 */
public class RecognizeCommand implements Command {

    /**
     * Изпълнява командата за разпознаване дали дадена дума е приета от регулярен израз с определен ID.
     * Ако ID или думата са невалидни, извежда съобщение за грешка.
     *
     * @param args Аргументи на командата. Очаква се два аргумента: ID на регулярния израз и дума за разпознаване.
     */
    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Употреба: recognize <id> <word>");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Невалиден ID.");
            return;
        }

        List<String> regexList = RegCommand.getRegexList();
        if (id < 0 || id >= regexList.size()) {
            System.out.println("Невалиден ID.");
            return;
        }

        String regex = regexList.get(id);
        String word = args[1];

        if (regex.contains("+")) {
            String[] parts = regex.split("\\+");

            boolean match = false;
            for (String part : parts) {
                if (word.matches(part.replace("*", ".*"))) {
                    match = true;
                    break;
                }
            }

            if (match) {
                System.out.println("Думата \"" + word + "\" е приета от регулярния израз.");
            } else {
                System.out.println("Думата \"" + word + "\" не е приета от регулярния израз.");
            }
            return;
        }

        int regexIndex = 0;
        int wordIndex = 0;

        while (regexIndex < regex.length() && wordIndex < word.length()) {
            char regexChar = regex.charAt(regexIndex);

            if (regexChar == '*') {
                if (regexIndex == 0) {
                    System.out.println("Невалиден регулярен израз.");
                    return;
                }

                char loopedChar = regex.charAt(regexIndex - 1);

                while (wordIndex < word.length() && word.charAt(wordIndex) == loopedChar) {
                    wordIndex++;
                }

                regexIndex++;
            } else {
                if (wordIndex < word.length() && word.charAt(wordIndex) == regexChar) {
                    regexIndex++;
                    wordIndex++;
                } else {
                    System.out.println("Думата \"" + word + "\" не е приета от регулярния израз.");
                    return;
                }
            }
        }

        while (regexIndex < regex.length() && regex.charAt(regexIndex) == '*') {
            regexIndex++;
        }

        if (regexIndex == regex.length() && wordIndex == word.length()) {
            System.out.println("Думата \"" + word + "\" е приета от регулярния израз.");
        } else {
            System.out.println("Думата \"" + word + "\" не е приета от регулярния израз.");
        }
    }
}
