package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;


import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.Command;
import java.util.List;



public class RecognizeCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: recognize <id> <word>");
            return;
        }

        int id;
        try {
            id = Integer.parseInt(args[0]);
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID.");
            return;
        }

        List<String> regexList = RegCommand.getRegexList();
        if (id < 0 || id >= regexList.size()) {
            System.out.println("Invalid ID.");
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
                System.out.println("The word \"" + word + "\" is accepted by the regex.");
            } else {
                System.out.println("The word \"" + word + "\" is not accepted by the regex.");
            }
            return;
        }

        int regexIndex = 0;
        int wordIndex = 0;

        while (regexIndex < regex.length() && wordIndex < word.length()) {
            char regexChar = regex.charAt(regexIndex);

            if (regexChar == '*') {
                if (regexIndex == 0) {
                    System.out.println("Invalid regex.");
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
                    System.out.println("The word \"" + word + "\" is not accepted by the regex.");
                    return;
                }
            }
        }

        while (regexIndex < regex.length() && regex.charAt(regexIndex) == '*') {
            regexIndex++;
        }

        if (regexIndex == regex.length() && wordIndex == word.length()) {
            System.out.println("The word \"" + word + "\" is accepted by the regex.");
        } else {
            System.out.println("The word \"" + word + "\" is not accepted by the regex.");
        }
    }
}
