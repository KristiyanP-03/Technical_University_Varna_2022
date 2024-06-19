package CreationPattern.ABCFactory;

// Абстрактна фабрика за Батерии
abstract class AbstractFactory {
    abstract Battery getBattery(String batteryType);
}
