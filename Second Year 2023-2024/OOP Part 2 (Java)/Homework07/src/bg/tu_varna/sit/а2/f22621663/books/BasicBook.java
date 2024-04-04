package bg.tu_varna.sit.а2.f22621663.books;

import bg.tu_varna.sit.а2.f22621663.interfaces.Book;

public class BasicBook implements Book {
    private String content;
    private double price;

    public BasicBook(String content, double price) {
        this.content = content;
        this.price = price;
    }

    @Override
    public String getContent() {
        return content;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
