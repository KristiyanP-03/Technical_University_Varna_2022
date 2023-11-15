package bg.tu_varna.sit.a2.f22621663.homework6.task1;

public class CrimeNovel extends Book {
    public CrimeNovel(String title, Author author, int publishingYear,
                      double price, boolean hasHardCover) {

        super(title, author, publishingYear, price, hasHardCover);
    }



    @Override
    public double calculateMargin(Book book) {
        if (book.hasHardCover()) {
            return book.getPrice() * 0.02;
        } else {
            return book.getPrice() * 0.01;
        }
    }
}
