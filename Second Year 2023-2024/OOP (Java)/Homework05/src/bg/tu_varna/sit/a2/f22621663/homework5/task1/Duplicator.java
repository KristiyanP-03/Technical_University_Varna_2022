package bg.tu_varna.sit.a2.f22621663.homework5.task1;

public class Duplicator extends Machine {
    private int paperCount;
    private Paper copyPaper;

    public Duplicator(double price, int paperCount) {
        super(price);
        this.paperCount = paperCount;
    }

    public void setCopyPaper(Paper copyPaper) {
        this.copyPaper = copyPaper;
    }

    @Override
    public Paper[] createTracePaper(String content, int numberOfCopies) {
        if (paperCount < numberOfCopies) {
            return new Paper[0];
        }

        Paper[] pages = new Paper[numberOfCopies];

        return pages;
    }
}