package bg.tu_varna.sit.b3.f22621663.homework3.task2;

public class Application2 {
    public static void main(String[] args) {
        Attacker attacker = new Attacker("Hog Rider", 100);
        System.out.println("Attacker's Name: " + attacker.getName());
        System.out.println(attacker.getName() + "'s Life: " + attacker.getLife());
        System.out.println(attacker.getName() + "'s Efficiency: " + attacker.getEfficiency());
    }
}
