package bg.tu_varna.sit.a2.f22621663.homework9.task4;

import java.util.Comparator;
import java.util.List;

class RealEstateAgency {
    private List<Property> properties;

    public RealEstateAgency(List<Property> properties) {
        this.properties = properties;
    }

    public void addProperty(Property property) {
        properties.add(property);
    }

    public double calculatePriceOfAllProperties() {
        return properties.stream().mapToDouble(Property::calculate).sum();
    }

    public List<Property> sortPropertiesByArea() {
        properties.sort(Comparator.comparingDouble(Property::getArea));
        return properties;
    }

    public List<Property> sortPropertiesByPrice() {
        properties.sort(Comparator.comparingDouble(Property::calculate));
        return properties;
    }

    public long getNumberOfPropertiesByType(PropertyType propertyType) {
        return properties.stream().filter(property -> property.getPropertyType() == propertyType).count();
    }

    public long getNumberOfAvailableHouses() {
        return properties.stream().filter(property -> property instanceof House).count();
    }

    public Apartment getMostExpensiveApartment() {
        return (Apartment) properties.stream()
                .filter(property -> property instanceof Apartment)
                .max(Comparator.comparingDouble(Property::calculate))
                .orElse(null);
    }

    public double calculateAverageHousePrice() {
        return properties.stream()
                .filter(property -> property instanceof House)
                .mapToDouble(Property::calculate)
                .average()
                .orElse(0.0);
    }

    @Override
    public String toString() {
        return "RealEstateAgency{" +
                "properties=" + properties +
                '}';
    }
}
