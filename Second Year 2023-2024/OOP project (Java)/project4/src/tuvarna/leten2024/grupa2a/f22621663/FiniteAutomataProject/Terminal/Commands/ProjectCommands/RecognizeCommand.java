package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Commands.ProjectCommands;

import tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject.Terminal.Kernel.Command;

import java.util.List;
import java.util.ArrayList;


public class RecognizeCommand implements Command {
    @Override
    public void execute(String[] args) {
        if (args.length != 2) {
            System.out.println("Usage: recognize <id> <word>");
            return;
        }

        try {
            int id = Integer.parseInt(args[0]);
            String word = args[1];

            List<String> regexList = RegCommand.getRegexList();

            if (id < 0 || id >= regexList.size()) {
                System.out.println("Invalid ID.");
                return;
            }

            String regex = regexList.get(id);

            String[] parts = regex.split("\\+");
            List<String> subRegexList = new ArrayList<>();

            for (String part : parts) {
                StringBuilder subRegex = new StringBuilder();
                boolean inBracket = false;
                int bracketCount = 0;

                for (int i = 0; i < part.length(); i++) {
                    char c = part.charAt(i);

                    if (c == '(') {
                        inBracket = true;
                        bracketCount++;
                    } else if (c == ')') {
                        bracketCount--;
                        if (bracketCount == 0) {
                            inBracket = false;
                        }
                    }

                    if (!inBracket && (c == '*' || c == '+')) {
                        if (i > 0 && part.charAt(i - 1) == ')') {
                            subRegex.insert(subRegex.lastIndexOf(")") + 1, c);
                        } else {
                            subRegex.append(c);
                        }
                    } else {
                        subRegex.append(c);
                    }
                }

                subRegexList.add(subRegex.toString());
            }

            boolean match = false;
            for (String subRegex : subRegexList) {
                if (word.matches(subRegex)) {
                    match = true;
                    break;
                }
            }

            if (match) {
                System.out.println("The word \"" + word + "\" is accepted by the regex.");
            } else {
                System.out.println("The word \"" + word + "\" is not accepted by the regex.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid ID.");
        }
    }
}






