package bg.tu_varna.sit.a2.f22621663.homework8.task2;

class Apartment extends Property {
    private int numberOfRooms;
    private int floor;
    private ParkingLot parkingLot;


    public Apartment(double area, double price, PropertyType propertyType, int numberOfRooms,
                     int floor, ParkingLot parkingLot) {
        super(area, price, propertyType);
        this.numberOfRooms = numberOfRooms;
        this.floor = floor;
        this.parkingLot = parkingLot;
    }





    @Override
    public double calculateCommission() {
        if (getPropertyType() == PropertyType.rent &&
                (parkingLot == ParkingLot.onePlaceForRent || parkingLot == ParkingLot.twoPlacesForRent)) {
            return 0.15 * getPrice();
        } else if (getArea() < 60) {
            return 0.10 * getPrice();
        } else {
            return 0.07 * getPrice();
        }
    }
}