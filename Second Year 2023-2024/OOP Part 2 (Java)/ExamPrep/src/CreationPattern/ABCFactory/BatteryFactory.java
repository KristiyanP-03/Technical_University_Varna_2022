package CreationPattern.ABCFactory;

// Фабрика за създаване на AA и AAA батерии
class BatteryFactory extends AbstractFactory {
    @Override
    public Battery getBattery(String batteryType) {
        if (batteryType == null) {
            return null;
        }
        if (batteryType.equalsIgnoreCase("AA")) {
            return new AABattery();
        } else if (batteryType.equalsIgnoreCase("AAA")) {
            return new AAABattery();
        }
        return null;
    }
}
