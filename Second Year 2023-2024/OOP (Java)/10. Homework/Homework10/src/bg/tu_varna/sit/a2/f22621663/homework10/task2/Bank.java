package bg.tu_varna.sit.a2.f22621663.homework10.task2;

import java.util.*;

class Bank {
    private Map<Account, Double> bankAccounts;

    public Bank() {
        this.bankAccounts = new HashMap<>();
    }

    public void addAccount(Account account) {
        bankAccounts.putIfAbsent(account, account.calculateInterestValue());
    }

    public void sortAccountsByBalance() {
        List<Account> sortedAccounts = new ArrayList<>(bankAccounts.keySet());
        sortedAccounts.sort(Comparator.comparingDouble(Account::getBalance));
        sortedAccounts.forEach(account -> System.out.println(account.toString()));
    }

    public void sortAccountsByInterest() {
        List<Map.Entry<Account, Double>> sortedAccounts = new ArrayList<>(bankAccounts.entrySet());
        sortedAccounts.sort(Comparator.comparingDouble(Map.Entry::getValue));
        sortedAccounts.forEach(entry -> System.out.println(entry.getKey().toString()));
    }

    public Currency findCurrencyWithMostAccounts() {
        Map<Currency, Integer> currencyCounts = new HashMap<>();
        for (Account account : bankAccounts.keySet()) {
            currencyCounts.put(account.getCurrency(), currencyCounts.getOrDefault(account.getCurrency(), 0) + 1);
        }
        return Collections.max(currencyCounts.entrySet(), Map.Entry.comparingByValue()).getKey();
    }

    public void printBankInfo() {
        System.out.println("Bank Information:");
        bankAccounts.forEach((account, interest) ->
                System.out.println(String.format("%s - Interest: %.2f", account.toString(), interest)));
    }
}
