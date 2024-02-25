package bg.tu_varna.sit.а2.f22621663.Verificator;

import java.util.Random;

class LettersAndDigitsVerificationCodeGenerator {
    private static final String ALPHANUMERIC = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    private static final int CODE_LENGTH = 6;

    public String generateVerificationCode() {
        return generateVerificationCode(ALPHANUMERIC);
    }

    private String generateVerificationCode(String characters) {
        StringBuilder code = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < CODE_LENGTH; i++) {
            code.append(characters.charAt(random.nextInt(characters.length())));
        }
        return code.toString();
    }
}
