package bg.tu_varna.sit.b3.f22621663.homework3.task4;

public class StandardTicket extends Ticket {
    private boolean used;


    public StandardTicket(String performanceName, double price) {
        super(performanceName, price);
        this.used = false;
    }


    public boolean isUsed() {
        return used;
    }


    public void markAsUsed() {
        this.used = true;
    }
}