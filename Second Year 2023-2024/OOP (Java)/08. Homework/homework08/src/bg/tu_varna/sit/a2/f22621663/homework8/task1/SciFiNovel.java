package bg.tu_varna.sit.a2.f22621663.homework8.task1;

class SciFiNovel extends Book {
    public SciFiNovel(String title, Author author, int publishingYear, double price, CoverType coverType) throws InvalidDataException {
        super(title, author, publishingYear, price, coverType);
    }

    @Override
    public double calculateMargin() {
        if (coverType == CoverType.paperback) {
            return 0.09 * price;
        } else {
            return 0.12 * price;
        }
    }

    @Override
    public double getFinalPrice() {
        return price + calculateMargin();
    }
}
