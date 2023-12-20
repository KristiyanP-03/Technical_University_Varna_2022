package bg.tu_varna.sit.a2.f22621663.homework10.task2;

import java.util.Objects;

abstract class Account implements InterestCalculator {
    private String id;
    private AccountType type;
    private Currency currency;
    private double balance;

    public Account(String id, AccountType type, Currency currency, double balance) throws InvalidDataException {
        if (id == null || id.isEmpty() || type == null || currency == null || balance < 0) {
            throw new InvalidDataException("Invalid account data");
        }
        this.id = id;
        this.type = type;
        this.currency = currency;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return Objects.equals(id, account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
