package bg.tu_varna.sit.a2.f22621663.homework9.task4;

import java.util.Objects;

class House extends Property {
    private int numberOfFloors;
    private boolean hasGarden;

    public House(double area, double basePrice, PropertyType propertyType, int numberOfFloors, boolean hasGarden) {
        super(area, basePrice, propertyType);
        this.numberOfFloors = numberOfFloors;
        this.hasGarden = hasGarden;
    }

    @Override
    public double calculate() {
        double price = getBasePrice();

        if (getPropertyType() == PropertyType.NEW && hasGarden && numberOfFloors > 1) {
            price += 0.2 * getBasePrice();
        } else if (hasGarden) {
            price += 0.1 * getBasePrice();
        } else {
            price += 0.07 * getBasePrice();
        }

        return price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        House house = (House) obj;
        return numberOfFloors == house.numberOfFloors &&
                hasGarden == house.hasGarden;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), numberOfFloors, hasGarden);
    }

    @Override
    public String toString() {
        return "House{" +
                "numberOfFloors=" + numberOfFloors +
                ", hasGarden=" + hasGarden +
                "} " + super.toString();
    }
}
