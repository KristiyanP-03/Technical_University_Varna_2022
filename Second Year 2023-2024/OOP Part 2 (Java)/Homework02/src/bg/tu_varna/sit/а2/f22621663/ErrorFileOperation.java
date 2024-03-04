package bg.tu_varna.sit.а2.f22621663;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Class for handling errors
class ErrorFileOperation implements FileOperation {
    @Override
    public void execute(String userInput) throws IOException {
        File errorFile = new File("LocalErrors.txt");
        FileWriter writer = new FileWriter(errorFile, true);
        writer.write("Error: Empty or whitespace input detected.\n");
        writer.close();
        System.out.println("Error logged in LocalErrors.txt");
    }
}
