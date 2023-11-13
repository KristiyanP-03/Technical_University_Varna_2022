package bg.tu_varna.sit.a2.f22621663.homework6.task1;

public class Bookstore {
    private Book[] books;

    public Bookstore(Book[] books) {
        this.books = books;
    }



    public double calculateTotalBookPrice() {
        double total = 0.0;
        for (Book book : books) {
            total += book.getFinalPrice();
        }
        return total;
    }
    public double calculateAverageBookPrice() {
        if (books.length == 0) {
            return 0.0;
        }

        double total = calculateTotalBookPrice();
        return total / books.length;
    }
}
