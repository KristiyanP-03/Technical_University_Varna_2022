package bg.tu_varna.sit.a2.f22621663.homework7.task1;

class SciFiNovel extends Book {
    public SciFiNovel(String title, Author author, int publishingYear, double price, CoverType coverType) {
        super(title, author, publishingYear, price, coverType);
    }



    @Override
    public double calculateMargin() {
        return (getCoverType() == CoverType.paperback) ? 0.09 * getPrice() : 0.12 * getPrice();
    }




    @Override
    public double getFinalPrice() {
        return getPrice() + calculateMargin();
    }
}