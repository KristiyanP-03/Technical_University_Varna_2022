package bg.tu_varna.sit.a2.f22621663.homework9.task4;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        List<Property> properties = new ArrayList<>();

        Apartment apartment1 = new Apartment(60, 100000, PropertyType.NEW, 2, 3, Exposition.SOUTH, true);
        Apartment apartment2 = new Apartment(45, 80000, PropertyType.OLD, 1, 2, Exposition.NORTH, false);
        House house1 = new House(150, 200000, PropertyType.NEW, 2, true);
        House house2 = new House(120, 150000, PropertyType.OLD, 1, false);

        properties.add(apartment1);
        properties.add(apartment2);
        properties.add(house1);
        properties.add(house2);

        RealEstateAgency agency = new RealEstateAgency(properties);

        System.out.println("Total Price of All Properties: " + agency.calculatePriceOfAllProperties());
        System.out.println("Sorted Properties by Area: " + agency.sortPropertiesByArea());
        System.out.println("Sorted Properties by Price: " + agency.sortPropertiesByPrice());
        System.out.println("Number of New Apartments: " + agency.getNumberOfPropertiesByType(PropertyType.NEW));
        System.out.println("Number of Available Houses: " + agency.getNumberOfAvailableHouses());
        System.out.println("Most Expensive Apartment: " + agency.getMostExpensiveApartment());
        System.out.println("Average Price of Houses: " + agency.calculateAverageHousePrice());
    }
}
