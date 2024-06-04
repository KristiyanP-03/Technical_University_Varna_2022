package strategy;

class MachinePart {
    private MachinePartStrategy strategy;
    public MachinePart(MachinePartStrategy strategy) {
        this.strategy = strategy;
    }
    public void operate() {
        strategy.operate();
    }
    public void setStrategy(MachinePartStrategy strategy) {
        this.strategy = strategy;
    }
}
