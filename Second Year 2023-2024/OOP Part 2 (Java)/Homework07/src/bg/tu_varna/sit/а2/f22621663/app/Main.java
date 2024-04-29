package bg.tu_varna.sit.а2.f22621663.app;

import bg.tu_varna.sit.а2.f22621663.books.BasicBook;
import bg.tu_varna.sit.а2.f22621663.books.HardCover;
import bg.tu_varna.sit.а2.f22621663.books.SoftCover;
import bg.tu_varna.sit.а2.f22621663.decorators.ElectronicBookDecorator;
import bg.tu_varna.sit.а2.f22621663.decorators.PhysicalBookDecorator;
import bg.tu_varna.sit.а2.f22621663.interfaces.Book;
import bg.tu_varna.sit.а2.f22621663.interfaces.BookDecorator;
import bg.tu_varna.sit.а2.f22621663.interfaces.Cover;

public class Main {
    public static void main(String[] args) {
        Book basicBook = new BasicBook("Content of the book", 20.0);
        BookDecorator electronicBook = new ElectronicBookDecorator(basicBook, 5.0);

        Cover softCover = new SoftCover(100);
        BookDecorator physicalBookWithSoftCover = new PhysicalBookDecorator(basicBook, 10.0 + softCover.getCoverPrice());

        Cover hardCover = new HardCover("Leather", 200);
        BookDecorator physicalBookWithHardCover = new PhysicalBookDecorator(basicBook, 15.0 + hardCover.getCoverPrice());
    }
}
