package bg.tu_varna.sit.a2.f22621663.homework9.task2;

import java.util.Objects;

class Book implements Comparable<Book> {
    private String title;
    private Author author;
    private int publishingYear;
    private int availableQuantity;

    public Book(String title, Author author, int publishingYear, int availableQuantity) {
        this.title = title;
        this.author = author;
        this.publishingYear = publishingYear;
        this.availableQuantity = availableQuantity;
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

    public int getAvailableQuantity() {
        return availableQuantity;
    }

    public void setAvailableQuantity(int availableQuantity) {
        this.availableQuantity = availableQuantity;
    }

    @Override
    public int compareTo(Book other) {
        int result = this.author.compareTo(other.author);
        if (result == 0) {
            result = this.title.compareTo(other.title);
        }
        return result;
    }

    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

    public int hashCode() {
        return Objects.hash(author, title);
    }

    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author=" + author +
                ", publishingYear=" + publishingYear +
                ", availableQuantity=" + availableQuantity +
                '}';
    }
}
