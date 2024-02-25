package bg.tu_varna.sit.а2.f22621663.Verificator;

import java.util.Random;
import java.util.Scanner;

class VerificationApp {
    public static void main(String[] args) {
        // Тип на код
        int option = new Random().nextInt(2) + 1;  // 1 - само числа / 2 - числа и букви

        String verificationCode;

        if (option == 1) {
            DigitsOnlyVerificationCodeGenerator digitsCodeGenerator = new DigitsOnlyVerificationCodeGenerator();
            verificationCode = digitsCodeGenerator.generateVerificationCode();
        } else {
            LettersAndDigitsVerificationCodeGenerator lettersAndDigitsCodeGenerator = new LettersAndDigitsVerificationCodeGenerator();
            verificationCode = lettersAndDigitsCodeGenerator.generateVerificationCode();
        }



        //Запазване на кода
        CodeWriter.writeCodeToFile(verificationCode, option);




        //Въвеждане на кода
        System.out.println("Please, type the same code to verify! The code: " + verificationCode);
        Scanner scanner = new Scanner(System.in);
        String userCode = scanner.nextLine();



        //Проверка на кода
        if (verificationCode.equals(userCode)) {
            System.out.println("Verification successful!");
        } else {
            try {
                throw new VerificationException("Verification failed: Invalid code entered!", userCode, verificationCode);
            } catch (VerificationException e) {
                System.out.println(e.getMessage());
            }
        }



        scanner.close();
    }
}

