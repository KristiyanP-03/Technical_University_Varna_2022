package strategy;

class EngineStrategy implements MachinePartStrategy {
    @Override
    public void operate() {
        System.out.println("The engine is running.");
    }
}
