// Normalen klass
public class Book {
    private String title;
    private String author;
    private String genre;
    private int pages;
    private double price;

    // vlojen klass Builder
    public static class Builder {
        // sus sushtite poleta ctrl+c/ctrl+v
        private String title;
        private String author;
        private String genre;
        private int pages;
        private double price;

        // konstruktor na klasa Builder za required poletata
        public Builder(String title, String author) {
            this.title = title;
            this.author = author;
        }

        //ostanalite poleta
        public Builder withGenre(String genre) {
            this.genre = genre;
            return this;
        }
        public Builder withPages(int pages) {
            this.pages = pages;
            return this;
        }
        public Builder withPrice(double price) {
            this.price = price;
            return this;
        }


        // vruzka mejdu glavniq klas i buildera
        public Book build() {
            Book book = new Book();
            book.title = this.title;
            book.author = this.author;
            book.genre = this.genre;
            book.pages = this.pages;
            book.price = this.price;
            return book;
        }
    }


    // konstruktora trqbva da e private i prazen
    private Book() {}



    // toString()
    @Override
    public String toString() {
        return "Book{" +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", pages=" + pages +
                ", price=" + price +
                '}';
    }
}
