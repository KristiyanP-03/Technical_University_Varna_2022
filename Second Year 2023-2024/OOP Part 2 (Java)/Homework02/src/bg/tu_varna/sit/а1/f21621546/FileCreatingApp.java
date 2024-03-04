package bg.tu_varna.sit.а1.f21621546;

import java.io.IOException;

public class FileCreatingApp {
    public static void main(String[] args) {
        try (java.util.Scanner scanner = new java.util.Scanner(System.in)) {
            System.out.println("Just start typing:");

            String userInput = scanner.nextLine();
            FileOperation fileOperation = FileMapping.createOperation(userInput);
            fileOperation.execute(userInput);


        } catch (IOException e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
