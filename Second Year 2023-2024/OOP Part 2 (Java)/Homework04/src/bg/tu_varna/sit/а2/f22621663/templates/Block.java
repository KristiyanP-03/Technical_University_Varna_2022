package bg.tu_varna.sit.а2.f22621663.templates;

import bg.tu_varna.sit.а2.f22621663.interface_and_factory.Building;

public class Block implements Building {
    private int floors;
    private double price;
    private double area;
    private int apartments;

    public Block(int floors, double price, double area, int apartments) {
        this.floors = floors;
        this.price = price;
        this.area = area;
        this.apartments = apartments;
    }

    @Override
    public void printInfo() {
        System.out.println("Type: Apartment");
        System.out.println("Architect: Architect1");
        System.out.println("Area: " + area + " sq.m");
        System.out.println("Area with all floors: " + area * floors + " sq.m");
    }
}
