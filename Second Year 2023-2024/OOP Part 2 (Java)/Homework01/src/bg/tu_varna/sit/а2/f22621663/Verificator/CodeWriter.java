package bg.tu_varna.sit.а2.f22621663.Verificator;

import java.io.FileWriter;
import java.io.IOException;

class CodeWriter {
    public static void writeCodeToFile(String code, int option) {
        try {
            String fileName = (option == 1) ? "DigitsCodes.txt" : "LettersAndDigitsCodes.txt";
            FileWriter writer = new FileWriter(fileName, true);
            writer.write(code + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
