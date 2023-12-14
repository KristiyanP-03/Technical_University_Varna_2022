package bg.tu_varna.sit.a2.f22621663.homework9.task2;

import java.util.*;

class BookCatalogue {
    private Set<Book> books;

    public BookCatalogue() {
        this.books = new HashSet<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void borrowBook(Book book) {
        if (books.contains(book)) {
            int currentQuantity = book.getAvailableQuantity();
            if (currentQuantity > 0) {
                book.setAvailableQuantity(currentQuantity - 1);
                if (currentQuantity == 1) {
                    books.remove(book);
                }
            }
        }
    }

    public void returnBook(Book book) {
        int currentQuantity = book.getAvailableQuantity();
        book.setAvailableQuantity(currentQuantity + 1);
        if (!books.contains(book)) {
            books.add(book);
        }
    }

    public int countBooksByAuthor(Author author) {
        return (int) books.stream()
                .filter(book -> book.getAuthor().equals(author))
                .count();
    }

    public List<Book> sortCatalogueByAuthor() {
        List<Book> sortedList = new ArrayList<>(books);
        sortedList.sort(Comparator.comparing(Book::getAuthor));
        return sortedList;
    }

    public List<Book> sortCatalogueByAvailableQuantity() {
        List<Book> sortedList = new ArrayList<>(books);
        sortedList.sort(Comparator.comparing(Book::getAvailableQuantity).reversed());
        return sortedList;
    }

    public List<Book> sortCatalogueByTitle() {
        List<Book> sortedList = new ArrayList<>(books);
        sortedList.sort(Comparator.comparing(Book::getTitle));
        return sortedList;
    }

    public int countBooksPublishedAfterYear(int year) {
        return (int) books.stream()
                .filter(book -> book.getPublishingYear() > year)
                .count();
    }

    public String toString() {
        return "BookCatalogue{" +
                "books=" + books +
                '}';
    }
}
