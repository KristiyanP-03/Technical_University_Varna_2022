package tuvarna.leten2024.grupa2a.f22621663.FiniteAutomataProject;


import java.io.IOException;

public class CMD {
    public static void main(String[] args) {
        try {
            Process process = Runtime.getRuntime().exec("cmd.exe /c start");
            System.out.println("Command prompt opened successfully.");
        } catch (IOException e) {
            System.err.println("Error opening command prompt: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

