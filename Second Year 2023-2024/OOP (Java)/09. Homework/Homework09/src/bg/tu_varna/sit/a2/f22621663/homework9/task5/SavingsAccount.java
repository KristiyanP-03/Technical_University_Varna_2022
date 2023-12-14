package bg.tu_varna.sit.a2.f22621663.homework9.task5;

class SavingsAccount extends Account {
    public SavingsAccount(String id, AccountType type, Currency currency, double balance) {
        super(id, type, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        switch (getType()) {
            case PERSONAL:
                switch (getCurrency()) {
                    case BGN:
                        return 0.15 * getBalance();
                    case USD:
                        return 0.1 * getBalance();
                    default:
                        return 0.01 * getBalance();
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
        return "SavingsAccount{" +
                super.toString() +
                '}';
    }
}
