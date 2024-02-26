package bg.tu_varna.sit.а2.f22621663.Verificator;

class VerificationException extends Exception {
    private String verificationCode;
    private String userCode;

    public VerificationException(String message, String userCode, String verificationCode) {
        super(message);
        this.userCode = userCode;
        this.verificationCode = verificationCode;
        ErrorWriter.writeErrorToFile(userCode, verificationCode);
    }
}
