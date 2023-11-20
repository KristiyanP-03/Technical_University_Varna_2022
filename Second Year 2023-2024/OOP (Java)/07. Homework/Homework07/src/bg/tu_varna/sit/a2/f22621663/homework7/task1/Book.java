package bg.tu_varna.sit.a2.f22621663.homework7.task1;

abstract class Book implements Margin {
    private String title;
    private Author author;
    private int publishingYear;
    private double price;
    private CoverType coverType;

    public Book(String title, Author author, int publishingYear, double price, CoverType coverType) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.price = price;
        this.coverType = coverType;
    }


    public double getPrice() {
        return price;
    }

    public CoverType getCoverType() {
        return coverType;
    }

    public int getPublishingYear() {
        return publishingYear;
    }





    @Override
    public double calculateMargin() {
        return 0;
    }




    public abstract double getFinalPrice();




    @Override
    public String toString() {
        return title + " by " + author + " (" + publishingYear + "), Price: $" + getFinalPrice();
    }
}
