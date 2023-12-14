package bg.tu_varna.sit.a2.f22621663.homework9.task5;

class SalaryAccount extends Account {
    public SalaryAccount(String id, AccountType type, Currency currency, double balance) {
        super(id, type, currency, balance);
    }

    @Override
    public double calculateInterestValue() {
        switch (getCurrency()) {
            case BGN:
                return 0;
            case USD:
                return 0.03 * getBalance();
            case EUR:
                return 0.02 * getBalance();
            default:
                return 0.01 * getBalance();
        }
    }

    @Override
    public String toString() {
        return "SalaryAccount{" +
                super.toString() +
                '}';
    }
}
