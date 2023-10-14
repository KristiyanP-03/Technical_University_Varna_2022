package bg.tu_varna.sit.b3.f22621663.homework2.task1;

public class Item {
    String type;
    int quantity;
    double price;
    int expirationDays;

    Item(String type, int quantity, double price, int expirationDays){
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.expirationDays = expirationDays;
    }

    String getType() {
        return type;
    }
    int getQuantity() {
        return quantity;
    }
    double getPrice() {
        return price;
    }
    int getExpirationDays() {
        return expirationDays;
    }
}
