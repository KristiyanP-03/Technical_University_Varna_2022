package bg.tu_varna.sit.a2.f22621663.homework8.task1;

abstract class Book implements Margin {
    String title;
    Author author;
    int publishingYear;
    double price;
    CoverType coverType;

    public Book(String title, Author author, int publishingYear, double price, CoverType coverType) throws InvalidDataException {
        if (title == null || author == null || price < 5) {
            throw new InvalidDataException("Invalid data for book initialization.");
        }
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.price = price;
        this.coverType = coverType;
    }

    @Override
    public String toString() {
        return title + " by " + author.firstName + " " + author.lastName + ", " + publishingYear + ", $" + price + ", " + coverType;
    }

    public abstract double getFinalPrice();
}

