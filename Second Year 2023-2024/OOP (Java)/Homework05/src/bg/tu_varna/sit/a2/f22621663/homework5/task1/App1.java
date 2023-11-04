package bg.tu_varna.sit.a2.f22621663.homework5.task1;

public class App1 {
    public static void main(String[] args) {
        Paper paper = new Paper(0.1);
        Printer printer = new Printer(499.0, 10);
        Duplicator duplicator = new Duplicator(199.0, 0);

        String content = "Нещо да се напечата";
        Paper[] printedPages = printer.createTracePaper(content, 2);
        System.out.println("Страници с принтер - " + printedPages.length);

        duplicator.setCopyPaper(paper);
        Paper[] copiedPages = duplicator.createTracePaper("копиране", 2);
        System.out.println("Страници с копирна машина - " + copiedPages.length);
    }
}
