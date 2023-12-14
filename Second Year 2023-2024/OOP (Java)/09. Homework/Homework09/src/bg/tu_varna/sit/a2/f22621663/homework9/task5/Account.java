package bg.tu_varna.sit.a2.f22621663.homework9.task5;

import java.util.Objects;

abstract class Account implements InterestCalculator {
    private String id;
    private AccountType type;
    private Currency currency;
    private double balance;

    public Account(String id, AccountType type, Currency currency, double balance) {
        this.id = id;
        this.type = type;
        this.currency = currency;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public AccountType getType() {
        return type;
    }

    public Currency getCurrency() {
        return currency;
    }

    public double getBalance() {
        return balance;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Account account = (Account) obj;
        return id.equals(account.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", type=" + type +
                ", currency=" + currency +
                ", balance=" + balance +
                '}';
    }
}
