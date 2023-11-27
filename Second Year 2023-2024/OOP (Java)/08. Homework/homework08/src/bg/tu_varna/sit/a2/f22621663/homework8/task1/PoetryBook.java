package bg.tu_varna.sit.a2.f22621663.homework8.task1;

class PoetryBook extends Book {
    public PoetryBook(String title, Author author, int publishingYear, double price, CoverType coverType) throws InvalidDataException {
        super(title, author, publishingYear, price, coverType);
    }

    @Override
    public double calculateMargin() {
        if (coverType == CoverType.hardcover && publishingYear > 2000) {
            return 0.01 * price;
        } else {
            return 0.05 * price;
        }
    }

    @Override
    public double getFinalPrice() {
        return price + calculateMargin();
    }
}