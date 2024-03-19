public class Main {
    public static void main(String[] args) {
        Book book = new Book.Builder("To Kill a Mockingbird", "Harper Lee")
                .withGenre("Fiction")
                .withPages(281)
                .withPrice(9.99)
                .build();

        System.out.println(book);
    }
}