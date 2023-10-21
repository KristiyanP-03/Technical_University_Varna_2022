package bg.tu_varna.sit.b3.f22621663.homework3.task1;

public class Printer extends Machine {
    protected int numberOfPages;
    Printer(double price, int numberOfPages){
        super(price); // Как не ми дава грешка!? price е protected поле
        this.numberOfPages = numberOfPages;
    }

    //метод за четене
    public int getNumberOfPages() {
        return numberOfPages;
    }

    //метод за запис
    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    //метод за принтиране на страниците
    public void printPagesInOneMinute() {
        System.out.println("Printing ...");
        System.out.println("Estimated time in sec:");

        for (int i = 60; i >= 0; i--) {
            System.out.println(i + " sec");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(numberOfPages + " pages printed successfully");
    }
}
