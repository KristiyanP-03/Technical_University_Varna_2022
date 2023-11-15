package bg.tu_varna.sit.a2.f22621663.homework6.task2;

public class Shop extends Property {
    public Shop(double area, double price, boolean isForRent) {
        super(area, price, isForRent);
    }




    @Override
    public double calculateCommission(Property property) {
        if (isForRent() && getArea() < 50) {
            return getPrice() * 0.02;
        } else if (getArea() > 100) {
            return getPrice() * 0.01;
        } else {
            return getPrice() * 0.06;
        }
    }
}
