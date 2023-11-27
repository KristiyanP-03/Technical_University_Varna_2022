package bg.tu_varna.sit.a2.f22621663.homework8.task5;

import java.util.Arrays;

class SoftDrink extends Drink {
    private boolean isSugarFree;
    private String drinkFragrance;

    public static final String[] FRAGRANCES = {"lemon", "orange", "kiwi", "peach", "apricot", "pear", "cola", "none"};

    public SoftDrink(String name, double quantity, double serveQuantity, boolean isSugarFree, String drinkFragrance) {
        super(name, quantity, serveQuantity);
        this.isSugarFree = isSugarFree;
        if (Arrays.asList(FRAGRANCES).contains(drinkFragrance)) {
            this.drinkFragrance = drinkFragrance;
        } else {
            throw new IllegalArgumentException("Invalid fragrance");
        }
    }
}