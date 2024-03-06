package bg.tu_varna.sit.а2.f22621663;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Class for creating text files
class TextFileOperation implements FileOperation {
    @Override
    public void execute(String userInput) throws IOException {
        if (!userInput.trim().isEmpty()) {
            File baseDir = new File("base");
            if (!baseDir.exists()) {
                baseDir.mkdir();
            }
            File textFile = new File(baseDir, "textfile.txt");
            FileWriter writer = new FileWriter(textFile);
            writer.write(userInput);
            writer.close();
            System.out.println("Text file created successfully.");
        }
    }
}
