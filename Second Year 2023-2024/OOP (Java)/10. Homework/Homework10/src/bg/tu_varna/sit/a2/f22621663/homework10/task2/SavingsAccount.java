package bg.tu_varna.sit.a2.f22621663.homework10.task2;

class SavingsAccount extends Account {
    public SavingsAccount(String id, AccountType type, Currency currency, double balance) throws InvalidDataException {
        super(id, type, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        switch (getType()) {
            case PERSONAL:
                if (getCurrency() == Currency.BGN) {
                    return 0.15 * getBalance();
                } else {
                    return 0.1 * getBalance();
                }
            default:
                switch (getCurrency()) {
                    case BGN:
                        return 0.05 * getBalance();
                    default:
                        return 0.01 * getBalance();
                }
        }
    }

    @Override
    public String toString() {
        return String.format("Savings Account %s: Balance=%.2f %s", getId(), getBalance(), getCurrency());
    }
}
