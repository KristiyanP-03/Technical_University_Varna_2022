package bg.tu_varna.sit.a2.f22621663.homework8.task1;

class CrimeNovel extends Book {
    public CrimeNovel(String title, Author author, int publishingYear, double price, CoverType coverType) throws InvalidDataException {
        super(title, author, publishingYear, price, coverType);
    }

    @Override
    public double calculateMargin() {
        if (coverType == CoverType.hardcover) {
            return 0.02 * price;
        } else {
            return 0.01 * price;
        }
    }

    @Override
    public double getFinalPrice() {
        return price + calculateMargin();
    }
}
