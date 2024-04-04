package bg.tu_varna.sit.а2.f22621663.decorators;

import bg.tu_varna.sit.а2.f22621663.interfaces.Book;
import bg.tu_varna.sit.а2.f22621663.interfaces.BookDecorator;

public class PhysicalBookDecorator implements BookDecorator {
    private Book book;
    private double physicalBookPrice;

    public PhysicalBookDecorator(Book book, double physicalBookPrice) {
        this.book = book;
        this.physicalBookPrice = physicalBookPrice;
    }

    @Override
    public String getContent() {
        return book.getContent() + " - physical version";
    }

    @Override
    public double getPrice() {
        return book.getPrice() + physicalBookPrice;
    }
}
