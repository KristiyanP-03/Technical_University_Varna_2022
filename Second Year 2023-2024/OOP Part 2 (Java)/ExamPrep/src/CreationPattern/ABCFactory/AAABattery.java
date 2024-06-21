package CreationPattern.ABCFactory;

// Клас за AAA батерия
class AAABattery implements Battery {
    @Override
    public void getSpecification() {
        System.out.println("AAA Battery: 1.5V, 1000mAh");
    }
}
