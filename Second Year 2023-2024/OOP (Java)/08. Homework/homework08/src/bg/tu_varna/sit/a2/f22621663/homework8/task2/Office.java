package bg.tu_varna.sit.a2.f22621663.homework8.task2;

class Office extends Property {
    private ParkingLot parkingLot;
    private int numberOfRooms;

    public Office(double area, double price, PropertyType propertyType, ParkingLot parkingLot, int numberOfRooms) {
        super(area, price, propertyType);
        if (propertyType == PropertyType.undefined) {
            throw new InvalidDataException("Invalid property type for office.");
        }
        this.parkingLot = parkingLot;
        this.numberOfRooms = numberOfRooms;
    }

    @Override
    public double calculateCommission() {
        if (getPropertyType() == PropertyType.rent) {
            if (parkingLot == ParkingLot.placesForRent && numberOfRooms > 2) {
                return 0.18 * getPrice();
            } else {
                return 0.15 * getPrice();
            }
        } else {
            return 0;
        }
    }
}