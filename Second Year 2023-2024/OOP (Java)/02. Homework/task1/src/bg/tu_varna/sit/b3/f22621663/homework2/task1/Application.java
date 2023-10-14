package bg.tu_varna.sit.b3.f22621663.homework2.task1;

public class Application {
    public static void main(String[] args) {
        Item[] item = new Item[2];
        item[0] = new Item("apple", 30, 0.2, 10);
        item[1] = new Item("banana", 15, 0.4, 15);


        ItemArray itemArray = new ItemArray(item);

        double averagePrice = itemArray.calculateAveragePrice();
        System.out.println("avg price = " + averagePrice); // трябва да е 0.3
    }
}
