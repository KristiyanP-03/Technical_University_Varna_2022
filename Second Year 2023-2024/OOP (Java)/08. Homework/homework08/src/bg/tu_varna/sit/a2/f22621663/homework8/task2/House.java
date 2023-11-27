package bg.tu_varna.sit.a2.f22621663.homework8.task2;

class House extends Property {
    private int numberOfFloors;
    private boolean hasGarden;

    public House(double area, double price, PropertyType propertyType, int numberOfFloors,
                 boolean hasGarden) {
        super(area, price, propertyType);
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;
    }





    @Override
    public double calculateCommission() {
        if (getPropertyType() == PropertyType.rent && hasGarden) {
            return 0.08 * getPrice();
        } else if (getPropertyType() == PropertyType.sale && getArea() < 100) {
            return 0.05 * getPrice();
        } else {
            return 0.03 * getPrice();
        }
    }
}
