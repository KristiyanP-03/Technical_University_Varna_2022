package CreationPattern.ABCFactory;

public class main {
    public static void main(String[] args) {
        // Създаваме фабрика за батерии чрез FactoryProducer
        AbstractFactory batteryFactory = FactoryProducer.getFactory();

        // Създаваме AA батерия и извикваме нейния метод getSpecification
        Battery aaBattery = batteryFactory.getBattery("AA");
        aaBattery.getSpecification();

        // Създаваме AAA батерия и извикваме нейния метод getSpecification
        Battery aaaBattery = batteryFactory.getBattery("AAA");
        aaaBattery.getSpecification();
    }
}
