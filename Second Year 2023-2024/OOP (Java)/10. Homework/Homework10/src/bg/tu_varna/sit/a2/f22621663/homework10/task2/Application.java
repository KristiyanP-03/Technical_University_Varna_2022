package bg.tu_varna.sit.a2.f22621663.homework10.task2;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        try {
            Bank bank = new Bank();

            DepositAccount depositAccount1 = new DepositAccount("D001", AccountType.PERSONAL, Currency.BGN, 1000);
            DepositAccount depositAccount2 = new DepositAccount("D002", AccountType.CORPORATE, Currency.USD, 2000);

            SalaryAccount salaryAccount1 = new SalaryAccount("S001", AccountType.CORPORATE, Currency.EUR, 3000);
            SalaryAccount salaryAccount2 = new SalaryAccount("S002", AccountType.PERSONAL, Currency.BGN, 4000);

            SavingsAccount savingsAccount1 = new SavingsAccount("SA001", AccountType.PERSONAL, Currency.BGN, 5000);
            SavingsAccount savingsAccount2 = new SavingsAccount("SA002", AccountType.PERSONAL, Currency.EUR, 6000);

            bank.addAccount(depositAccount1);
            bank.addAccount(depositAccount2);
            bank.addAccount(salaryAccount1);
            bank.addAccount(salaryAccount2);
            bank.addAccount(savingsAccount1);
            bank.addAccount(savingsAccount2);

            System.out.println("Sorted Accounts by Balance:");
            bank.sortAccountsByBalance();

            System.out.println("\nSorted Accounts by Interest:");
            bank.sortAccountsByInterest();

            Currency mostAccountsCurrency = bank.findCurrencyWithMostAccounts();
            System.out.println("\nCurrency with most accounts: " + mostAccountsCurrency);

            System.out.println("\nBank Information:");
            bank.printBankInfo();
        } catch (InvalidDataException e) {
            e.printStackTrace();
        }
    }
}
