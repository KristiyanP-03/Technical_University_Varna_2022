package bg.tu_varna.sit.а2.f22621663.decorators;

import bg.tu_varna.sit.а2.f22621663.interfaces.Book;
import bg.tu_varna.sit.а2.f22621663.interfaces.BookDecorator;

public class ElectronicBookDecorator implements BookDecorator {
    private Book book;
    private double electronicBookPrice;

    public ElectronicBookDecorator(Book book, double electronicBookPrice) {
        this.book = book;
        this.electronicBookPrice = electronicBookPrice;
    }

    @Override
    public String getContent() {
        return book.getContent() + " - electronic version";
    }

    @Override
    public double getPrice() {
        return book.getPrice() + electronicBookPrice;
    }
}
