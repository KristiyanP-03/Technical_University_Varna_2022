package bg.tu_varna.sit.а2.f22621663.Verificator;

import java.io.FileWriter;
import java.io.IOException;
class ErrorWriter {
    public static void writeErrorToFile(String userCode, String verificationCode) {
        try {
            FileWriter writer = new FileWriter("LocalErrors.txt", true);
            writer.write("Wrong code: " + userCode + "\t\t" + "The code was: " + verificationCode + "\n");
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
