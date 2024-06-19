package CreationPattern.ABCFactory;

// Клас за AA батерия
class AABattery implements Battery {
    @Override
    public void getSpecification() {
        System.out.println("AA Battery: 1.5V, 2500mAh");
    }
}
