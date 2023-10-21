package bg.tu_varna.sit.b3.f22621663.homework3.task4;

public class GroupTicket extends StandardTicket {
    private int numberOfUsers;

    public GroupTicket(String performanceName, double originalPrice) {
        super(performanceName, 20 * originalPrice);
        this.numberOfUsers = 0;
    }

    public void addUser() {
        if (numberOfUsers < 20) {
            numberOfUsers++;
            price -= 2;
        }
    }
}