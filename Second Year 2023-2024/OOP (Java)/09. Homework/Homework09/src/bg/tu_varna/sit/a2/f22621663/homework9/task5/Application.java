package bg.tu_varna.sit.a2.f22621663.homework9.task5;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Bank bank = new Bank();

        DepositAccount depositAccount1 = new DepositAccount("D1", AccountType.PERSONAL, Currency.BGN, 1000);
        SalaryAccount salaryAccount1 = new SalaryAccount("S1", AccountType.CORPORATE, Currency.USD, 2000);
        SavingsAccount savingsAccount1 = new SavingsAccount("SA1", AccountType.PERSONAL, Currency.EUR, 3000);

        bank.createAccount(depositAccount1);
        bank.createAccount(salaryAccount1);
        bank.createAccount(savingsAccount1);

        System.out.println("Number of Salary Accounts: " + bank.calculateNumberOfSalaryAccounts());
        System.out.println("Average Interest in EUR: " + bank.calculateAverageInterestByCurrency(Currency.EUR));
        System.out.println("Highest Interest Account: " + bank.findHighestInterest(1.5));
        System.out.println("Bank Details: " + bank);
    }
}
