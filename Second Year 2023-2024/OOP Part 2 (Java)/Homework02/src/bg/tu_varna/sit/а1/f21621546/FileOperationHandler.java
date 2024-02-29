package bg.tu_varna.sit.а1.f21621546;

import java.io.File;
import java.io.IOException;

class FileOperationHandler {
    private FileOperationHandler() {
    }

    static void createMetaFile(String userInput) throws IOException {
        if (userInput.startsWith("Author:")) {
            File metaDir = new File("meta");

            if (!metaDir.exists()) {
                metaDir.mkdir();
            }

            File metaFile = new File(metaDir, "meta.txt");
            FileIO.writeToFile(metaFile, "Meta information: " + userInput);

            System.out.println("Meta file created successfully.");
        }
    }




    static void createTextFile(String userInput) throws IOException {
        if (!userInput.trim().isEmpty()) {
            File baseDir = new File("base");

            if (!baseDir.exists()) {
                baseDir.mkdir();
            }

            File textFile = new File(baseDir, "textfile.txt");
            FileIO.writeToFile(textFile, userInput);

            System.out.println("Text file created successfully.");
        }
    }




    static void logError(String errorMessage) throws IOException {
        File errorFile = new File("LocalErrors.txt");
        FileIO.writeToFile(errorFile, errorMessage + "\n");
        System.out.println("Error logged in LocalErrors.txt");
    }





    static void readFile(String filePath) throws IOException {
        File fileToRead = new File(filePath);

        if (fileToRead.exists() && !fileToRead.isDirectory()) {
            String fileContent = FileIO.readFromFile(fileToRead);
            System.out.println("Contents of " + filePath + ":\n" + fileContent);
        } else {
            System.out.println("File does not exist or is a directory.");
        }
    }
}
