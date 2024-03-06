package bg.tu_varna.sit.а2.f22621663;

// FileOperationFactory creates appropriate FileOperation object based on user input
class FileOperationFactory {
    public static FileOperation createOperation(String userInput) {
        if (userInput.startsWith("Author:")) {
            return new MetaFileOperation();
        } else if (!userInput.trim().isEmpty()) {
            return new TextFileOperation();
        } else {
            return new ErrorFileOperation();
        }
    }
}
