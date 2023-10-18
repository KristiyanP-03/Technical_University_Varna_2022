package bg.tu_varna.sit.b3.f22621663.homework2.task5;

public class Application5 {
    public static void main(String[] args) {
        SoftDrink[] drinks = new SoftDrink[5];
        drinks[0] = new SoftDrink("Coca-Cola", "14/10/2023", 100.0, 50.0);
        drinks[1] = new SoftDrink("Pepsi", "10/12/2023", 100.0, 50.0);
        drinks[2] = new SoftDrink("Sprite", "12/12/2023", 100.0, 50.0);
        drinks[3] = new SoftDrink("Coca-Cola", "1/1/2024", 100.0, 50.0);
        drinks[4] = new SoftDrink("Pepsi", "28/6/1997", 100.0, 50.0);

        SoftDrinkShelf shelf = new SoftDrinkShelf(drinks);

        SoftDrink mostFrequentDrink = shelf.getMostFrequentSoftDrink();

        if (mostFrequentDrink != null) {
            System.out.println("Most Frequent Soft Drink:");
            System.out.println("Brand: " + mostFrequentDrink.brand);
            System.out.println("Expiration Date: " + mostFrequentDrink.expirationDate);
            System.out.println("Bottle Volume: " + mostFrequentDrink.bottleVolume);
            System.out.println("Sugar Amount: " + mostFrequentDrink.sugarAmount + "per 100ml");
        } else {
            System.out.println("No soft drinks on the shelf.");
        }
    }
}
