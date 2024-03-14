package bg.tu_varna.sit.а2.f22621663.interface_and_factory;

import bg.tu_varna.sit.а2.f22621663.templates.Block;
import bg.tu_varna.sit.а2.f22621663.templates.BuildingType;
import bg.tu_varna.sit.а2.f22621663.templates.House;

public class BuildingFactory {
    public static Building createBuilding(BuildingType type, int floors, double price, double area, int extraInfo) {
        switch (type) {
            case HOUSE:
                int bedrooms = extraInfo;
                int bathrooms = extraInfo;
                return new House(floors, price, area, bedrooms, bathrooms);
            case APARTMENT:
                int apartments = extraInfo;
                return new Block(floors, price, area, apartments);
            default:
                throw new IllegalArgumentException("Unknown building " + type); // da ima default
        }
    }
}
