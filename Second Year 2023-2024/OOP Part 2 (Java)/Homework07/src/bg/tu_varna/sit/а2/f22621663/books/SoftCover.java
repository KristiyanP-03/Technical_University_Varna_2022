package bg.tu_varna.sit.а2.f22621663.books;

import bg.tu_varna.sit.а2.f22621663.interfaces.Cover;

public class SoftCover implements Cover {
    private double weight;

    public SoftCover(double weight) {
        this.weight = weight;
    }

    @Override
    public String getDescription() {
        return "Soft cover - weight: " + weight + "g";
    }

    @Override
    public double getCoverPrice() {
        return weight * 0.01;
    }
}
