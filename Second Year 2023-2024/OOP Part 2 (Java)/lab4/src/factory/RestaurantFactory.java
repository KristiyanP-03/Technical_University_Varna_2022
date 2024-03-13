package factory;

public class RestaurantFactory {
    public Restorant create(String Type) {
        switch (Type){
            case "Fast Food":
                return new FastFood();
            case "Vegan":
                return new VeganRestaurant();

            default:
                return null;

        }
    }
}
