package bg.tu_varna.sit.a2.f22621663.homework9.task2;

import java.util.*;

public class Application {
    public static void main(String[] args) throws InvalidDataException {
        Author author1 = new Author("Kris", "P", "BG");
        Author author2 = new Author("Ivan", "Ivanov", "BG");

        Book book1 = new Book("Java", author1, 2020, 5);
        Book book2 = new Book("Python", author1, 2019, 3);
        Book book3 = new Book("PHP", author2, 2021, 8);

        BookCatalogue catalogue = new BookCatalogue();
        catalogue.addBook(book1);
        catalogue.addBook(book2);
        catalogue.addBook(book3);

        System.out.println("Before Operations:");
        System.out.println(catalogue);

        catalogue.borrowBook(book1);
        catalogue.returnBook(book2);

        System.out.println("\nAfter Operations:");
        System.out.println(catalogue);

        System.out.println("\nBooks (Kris): " + catalogue.countBooksByAuthor(author1));

        List<Book> sortedByAuthor = catalogue.sortCatalogueByAuthor();
        System.out.println("\nSorted by Author:");
        sortedByAuthor.forEach(System.out::println);

        List<Book> sortedByQuantity = catalogue.sortCatalogueByAvailableQuantity();
        System.out.println("\nSorted by Available Quantity:");
        sortedByQuantity.forEach(System.out::println);

        List<Book> sortedByTitle = catalogue.sortCatalogueByTitle();
        System.out.println("\nSorted by Title:");
        sortedByTitle.forEach(System.out::println);

        System.out.println("\nBooks published after 2020: " + catalogue.countBooksPublishedAfterYear(2020));
    }
}

