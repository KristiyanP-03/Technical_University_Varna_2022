package bg.tu_varna.sit.a2.f22621663.homework9.task4;

import java.util.Objects;

class Apartment extends Property {
    private int floorNumber;
    private int numberOfRooms;
    private Exposition exposition;
    private boolean hasParkingPlace;

    public Apartment(double area, double basePrice, PropertyType propertyType, int floorNumber,
                     int numberOfRooms, Exposition exposition, boolean hasParkingPlace) {
        super(area, basePrice, propertyType);
        this.floorNumber = floorNumber;
        this.numberOfRooms = numberOfRooms;
        this.exposition = exposition;
        this.hasParkingPlace = hasParkingPlace;
    }

    @Override
    public double calculate() {
        double price = getBasePrice();

        if (getPropertyType() == PropertyType.NEW) {
            if ((exposition == Exposition.SOUTH || exposition == Exposition.WEST || exposition == Exposition.SOUTHWEST)
                    && getArea() > 50 && hasParkingPlace) {
                price += 0.25 * getBasePrice();
            } else if (exposition == Exposition.SOUTH || exposition == Exposition.WEST || exposition == Exposition.SOUTHWEST) {
                price += 0.2 * getBasePrice();
            } else if (exposition == Exposition.NORTHEAST || exposition == Exposition.NORTH || exposition == Exposition.NORTHWEST
                    || exposition == Exposition.EAST || exposition == Exposition.SOUTHEAST) {
                price += 0.15 * getBasePrice();
            }
        } else {
            if (hasParkingPlace) {
                price += 0.18 * getBasePrice();
            } else {
                price += 0.12 * getBasePrice();
            }
        }

        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Apartment apartment = (Apartment) obj;
        return floorNumber == apartment.floorNumber &&
                numberOfRooms == apartment.numberOfRooms &&
                hasParkingPlace == apartment.hasParkingPlace &&
                exposition == apartment.exposition;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), floorNumber, numberOfRooms, exposition, hasParkingPlace);
    }

    @Override
    public String toString() {
        return "Apartment{" +
                "floorNumber=" + floorNumber +
                ", numberOfRooms=" + numberOfRooms +
                ", exposition=" + exposition +
                ", hasParkingPlace=" + hasParkingPlace +
                "} " + super.toString();
    }
}
