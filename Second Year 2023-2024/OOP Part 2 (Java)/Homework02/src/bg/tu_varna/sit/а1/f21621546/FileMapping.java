package bg.tu_varna.sit.а1.f21621546;

class FileMapping {
    private FileMapping() {
    }

    static FileOperation createOperation(String userInput) {
        if (userInput.startsWith("Author:")) {
            return new MetaFileOperation();



        } else if (!userInput.trim().isEmpty()) {
            if (userInput.startsWith("read:")) {
                return new ReadFileOperation();
            } else {
                return new TextFileOperation();
            }



        } else {
            return new ErrorFileOperation();
        }
    }
}
