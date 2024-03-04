package bg.tu_varna.sit.а2.f22621663;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your input:");
        String userInput = scanner.nextLine();

        FileOperation fileOperation = FileOperationFactory.createOperation(userInput);
        try {
            fileOperation.execute(userInput);
        } catch (IOException e) {
            System.err.println("Error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
