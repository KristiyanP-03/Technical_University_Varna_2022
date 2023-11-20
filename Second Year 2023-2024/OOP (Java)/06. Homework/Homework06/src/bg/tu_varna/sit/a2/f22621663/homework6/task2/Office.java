package bg.tu_varna.sit.a2.f22621663.homework6.task2;

public class Office extends Property {
    private boolean hasParkingLot;
    private int numberOfRooms;

    public Office(double area, double price, boolean isForRent, boolean hasParkingLot, int numberOfRooms) {
        super(area, price, isForRent);
        this.hasParkingLot = hasParkingLot;
        this.numberOfRooms = numberOfRooms;
    }


    @Override
    public double calculateCommission(Property property) {
        if (isForRent()) {
            return getPrice() * 0.18;
        } else if (hasParkingLot && numberOfRooms > 2) {
            return getPrice() * 0.15;
        } else {
            return getPrice() * 0.11;
        }
    }
}
