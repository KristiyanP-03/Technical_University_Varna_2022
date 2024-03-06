package bg.tu_varna.sit.а2.f22621663;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Class for creating meta files
class MetaFileOperation implements FileOperation {
    @Override
    public void execute(String userInput) throws IOException {
        if (userInput.startsWith("Author:")) {
            File metaDir = new File("meta");
            if (!metaDir.exists()) {
                metaDir.mkdir();
            }
            File metaFile = new File(metaDir, "meta.txt");
            FileWriter writer = new FileWriter(metaFile);
            writer.write("Meta information: " + userInput);
            writer.close();
            System.out.println("Meta file created successfully.");
        }
    }
}
