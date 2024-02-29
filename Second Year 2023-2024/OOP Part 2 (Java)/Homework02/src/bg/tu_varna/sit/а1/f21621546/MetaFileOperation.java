package bg.tu_varna.sit.а1.f21621546;

import java.io.IOException;

class MetaFileOperation implements FileOperation {
    @Override
    public void execute(String userInput) throws IOException {
        FileOperationHandler.createMetaFile(userInput);
    }
}
