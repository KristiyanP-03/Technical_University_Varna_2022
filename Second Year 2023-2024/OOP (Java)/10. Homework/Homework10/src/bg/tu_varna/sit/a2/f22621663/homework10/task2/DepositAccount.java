package bg.tu_varna.sit.a2.f22621663.homework10.task2;

class DepositAccount extends Account {
    public DepositAccount(String id, AccountType type, Currency currency, double balance) throws InvalidDataException {
        super(id, type, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        switch (getType()) {
            case PERSONAL:
                return 0.09 * getBalance();
            case CORPORATE:
                return 0.01 * getBalance();
            default:
                switch (getCurrency()) {
                    case BGN:
                        return 0.07 * getBalance();
                    case USD:
                        return 0.05 * getBalance();
                    case EUR:
                        return 0.02 * getBalance();
                    default:
                        return 0.01 * getBalance();
                }
        }
    }

    @Override
    public String toString() {
        return String.format("Deposit Account %s: Balance=%.2f %s", getId(), getBalance(), getCurrency());
    }
}
