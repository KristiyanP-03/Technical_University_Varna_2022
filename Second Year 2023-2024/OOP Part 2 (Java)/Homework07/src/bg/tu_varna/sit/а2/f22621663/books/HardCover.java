package bg.tu_varna.sit.а2.f22621663.books;

import bg.tu_varna.sit.а2.f22621663.interfaces.Cover;

public class HardCover implements Cover {
    private String material;
    private double weight;

    public HardCover(String material, double weight) {
        this.material = material;
        this.weight = weight;
    }

    @Override
    public String getDescription() {
        return "Hard cover - material: " + material + ", weight: " + weight + "g";
    }

    @Override
    public double getCoverPrice() {
        double materialPrice = 0;
        return 5 + weight * 0.02 + materialPrice;
    }
}
