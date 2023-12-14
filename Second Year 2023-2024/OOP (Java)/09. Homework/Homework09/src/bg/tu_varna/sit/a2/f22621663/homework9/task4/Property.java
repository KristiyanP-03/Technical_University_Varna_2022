package bg.tu_varna.sit.a2.f22621663.homework9.task4;

import java.util.Objects;

abstract class Property implements PriceCalculator, Comparable<Property> {
    private double area;
    private double basePrice;
    private PropertyType propertyType;

    public Property(double area, double basePrice, PropertyType propertyType) {
        this.area = area;
        this.basePrice = basePrice;
        this.propertyType = propertyType;
    }

    public double getArea() {
        return area;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public PropertyType getPropertyType() {
        return propertyType;
    }

    @Override
    public int compareTo(Property other) {
        return Double.compare(this.area, other.area);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Property property = (Property) obj;
        return Double.compare(property.area, area) == 0 &&
                Double.compare(property.basePrice, basePrice) == 0 &&
                propertyType == property.propertyType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, basePrice, propertyType);
    }

    @Override
    public String toString() {
        return "Property{" +
                "area=" + area +
                ", basePrice=" + basePrice +
                ", propertyType=" + propertyType +
                '}';
    }
}
