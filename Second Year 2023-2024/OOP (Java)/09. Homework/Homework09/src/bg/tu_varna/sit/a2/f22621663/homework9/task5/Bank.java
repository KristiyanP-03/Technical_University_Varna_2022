package bg.tu_varna.sit.a2.f22621663.homework9.task5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

class Bank {
    private List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();
    }

    public void createAccount(Account account) {
        if (!accounts.contains(account)) {
            accounts.add(account);
        }
    }

    public void closeAccount(Account account) {
        accounts.remove(account);
    }

    public long calculateNumberOfSalaryAccounts() {
        return accounts.stream()
                .filter(account -> account instanceof SalaryAccount)
                .count();
    }

    public double calculateAverageInterestByCurrency(Currency currency) {
        return accounts.stream()
                .filter(account -> account.getCurrency() == currency)
                .mapToDouble(Account::calculateInterestValue)
                .average()
                .orElse(0.0);
    }

    public Account findHighestInterest(double exchangeRate) {
        return accounts.stream()
                .max(Comparator.comparingDouble(account -> account.calculateInterestValue() * exchangeRate))
                .orElse(null);
    }

    @Override
    public String toString() {
        return "Bank{" +
                "accounts=" + accounts +
                '}';
    }
}
