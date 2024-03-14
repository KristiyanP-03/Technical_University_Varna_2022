package bg.tu_varna.sit.а2.f22621663.templates;

import bg.tu_varna.sit.а2.f22621663.interface_and_factory.Building;

public class House implements Building {
    private int floors;
    private double price;
    private double area;
    private int bedrooms;
    private int bathrooms;

    public House(int floors, double price, double area, int bedrooms, int bathrooms) {
        this.floors = floors;
        this.price = price;
        this.area = area;
        this.bedrooms = bedrooms;
        this.bathrooms = bathrooms;
    }

    @Override
    public void printInfo() {
        System.out.println("Type: House");
        System.out.println("Architect: Architect2");
        System.out.println("Area: " + area + " sq.m");
        System.out.println("Area with all floors: " + area * floors + " sq.m");
    }
}
