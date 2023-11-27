package bg.tu_varna.sit.a2.f22621663.homework8.task2;

class Shop extends Property {
    public Shop(double area, double price, PropertyType propertyType) {
        super(area, price, propertyType);
    }




    @Override
    public double calculateCommission() {
        if (getPropertyType() == PropertyType.rent && getArea() < 50) {
            return 0.02 * getPrice();
        } else if (getArea() > 100) {
            return 0.01 * getPrice();
        } else {
            return 0.06 * getPrice();
        }
    }
}

