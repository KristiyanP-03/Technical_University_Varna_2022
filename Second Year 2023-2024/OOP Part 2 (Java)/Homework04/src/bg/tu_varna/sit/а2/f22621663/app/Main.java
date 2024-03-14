package bg.tu_varna.sit.а2.f22621663.app;

import bg.tu_varna.sit.а2.f22621663.interface_and_factory.Building;
import bg.tu_varna.sit.а2.f22621663.interface_and_factory.BuildingFactory;
import bg.tu_varna.sit.а2.f22621663.templates.BuildingType;

public class Main {
    public static void main(String[] args) {
        BuildingFactory factory = new BuildingFactory();

        Building house = factory.createBuilding(BuildingType.HOUSE, 1, 200000, 120, 1);
        house.printInfo();

        Building apartment = factory.createBuilding(BuildingType.APARTMENT, 3, 100000, 90, 1);
        apartment.printInfo();
    }
}