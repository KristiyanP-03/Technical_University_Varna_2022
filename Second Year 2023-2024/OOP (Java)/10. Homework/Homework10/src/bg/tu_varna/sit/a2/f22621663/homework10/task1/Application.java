package bg.tu_varna.sit.a2.f22621663.homework10.task1;

import java.util.*;

public class Application {
    public static void main(String[] args) {
        Shop shop = new Shop();



        Biscuits biscuits = new Biscuits("Biscuits", 2.5, 3);
        Bread bread = new Bread("Bread", 1.8, 10);
        Butter butter = new Butter(200, 82.5, 4.0, 25);
        Chocolate chocolate = new Chocolate("Chocolate", 70.0, 3.0, 8);
        Eggs eggs = new Eggs(12, 2.0, 18);
        Milk milk = new Milk("Milk", 5, 2.2, 12);
        Water water = new Water("Mineral Water", WaterType.MINERAL, 1.0, 20);



        shop.addItem(biscuits);
        shop.addItem(bread);
        shop.addItem(butter);
        shop.addItem(chocolate);
        shop.addItem(eggs);
        shop.addItem(milk);
        shop.addItem(water);



        System.out.println("Delivery: " + shop.countItemsForDelivery());
        System.out.println("Total price: " + shop.calculateItemsPrice());
        System.out.println("Most available quantity: " + shop.getItemWithMostAvailableQuantity().getDescription());
        System.out.println("Least quantity: " + shop.getItemTypeWithLeastQuantity());
    }
}
