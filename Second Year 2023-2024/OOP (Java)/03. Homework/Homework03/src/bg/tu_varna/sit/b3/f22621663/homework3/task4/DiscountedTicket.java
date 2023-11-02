package bg.tu_varna.sit.b3.f22621663.homework3.task4;

public class DiscountedTicket extends StandardTicket {
    private String nameOfUser;

    public DiscountedTicket(String performanceName, double originalPrice, String nameOfUser) {
        super(performanceName, 0.5 * originalPrice);
        this.nameOfUser = nameOfUser;
    }

    public String getNameOfUser() {
        return nameOfUser;
    }
}