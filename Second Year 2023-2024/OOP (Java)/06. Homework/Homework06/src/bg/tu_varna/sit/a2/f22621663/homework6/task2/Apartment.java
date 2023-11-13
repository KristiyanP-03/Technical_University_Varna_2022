package bg.tu_varna.sit.a2.f22621663.homework6.task2;

public class Apartment extends Property {
    private int numberOfRooms;
    private int floor;

    public Apartment(double area, double price, boolean isForRent, int numberOfRooms, int floor) {
        super(area, price, isForRent);
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;
    }


    public int getNumberOfRooms() {
        return numberOfRooms;
    }
    public int getFloor() {
        return floor;
    }




    @Override
    public double calculateCommission(Property property) {
        if (isForRent()) {
            return getPrice() * 0.15;
        } else if (getArea() < 60) {
            return getPrice() * 0.10;
        } else {
            return getPrice() * 0.07;
        }
    }
}