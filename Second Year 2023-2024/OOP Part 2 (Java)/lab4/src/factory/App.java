package factory;

public class App {
    public static void main(String[] args) {
        RestaurantFactory factory = new RestaurantFactory();

        Restorant firstR = factory.create("Vegan");
        firstR.createRestarant();
    }
}
