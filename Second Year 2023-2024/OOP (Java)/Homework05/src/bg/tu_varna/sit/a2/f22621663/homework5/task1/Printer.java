package bg.tu_varna.sit.a2.f22621663.homework5.task1;

public class Printer extends Machine{
    private int numberOfPages;

    public Printer(double price, int numberOfPages) {
        super(price);
        this.numberOfPages = numberOfPages;
    }


    @Override
    public Paper[] createTracePaper(String content, int numberOfCopies) {
        int charactersPerPage = 2500;
        int numberOfNonPrintableChars = 0;

        for (char character : content.toCharArray()) {
            if (character == ' ' || character == '\n' || character == '\t') {
                numberOfNonPrintableChars++;
            }
        }

        int totalPages = ((content.length() - numberOfNonPrintableChars) + (charactersPerPage - 1))
                / charactersPerPage;
        Paper[] pages = new Paper[totalPages * numberOfCopies];

        return pages;
    }

}
