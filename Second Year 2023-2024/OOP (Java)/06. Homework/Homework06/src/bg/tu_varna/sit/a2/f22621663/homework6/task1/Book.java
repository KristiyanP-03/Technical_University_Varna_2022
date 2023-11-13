package bg.tu_varna.sit.a2.f22621663.homework6.task1;

public abstract class Book implements Margin {
    private String title;
    private Author author;
    private int publishingYear;
    private double price;
    private boolean hasHardCover;



    public Book(String title, Author author, int publishingYear, double price, boolean hasHardCover) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.price = price;
        this.hasHardCover = hasHardCover;
    }



    public String getTitle() {
        return title;
    }
    public Author getAuthor() {
        return author;
    }
    public int getPublishingYear() {
        return publishingYear;
    }
    public double getPrice() {
        return price;
    }
    public boolean hasHardCover() {
        return hasHardCover;
    }




    public double getFinalPrice() {
        double margin = calculateMargin(this);
        return price + margin;
    }
    public String toString() {
        return author.getLastName() + ", " + author.getFirstName() + ": " + title;
    }
    public abstract double calculateMargin(Book book);
}
