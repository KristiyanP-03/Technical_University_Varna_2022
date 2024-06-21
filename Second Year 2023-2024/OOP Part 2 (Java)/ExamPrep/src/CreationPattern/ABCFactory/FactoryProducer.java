package CreationPattern.ABCFactory;

// Фабрика за създаване на фабрики
class FactoryProducer {
    public static AbstractFactory getFactory() {
        return new BatteryFactory();
    }
}
