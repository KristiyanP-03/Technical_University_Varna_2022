package bg.tu_varna.sit.а1.f21621546;

import java.io.IOException;

class TextFileOperation implements FileOperation {
    @Override
    public void execute(String userInput) throws IOException {
        FileOperationHandler.createTextFile(userInput);
    }
}
