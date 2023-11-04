package bg.tu_varna.sit.a2.f22621663.homework5.task2;

public class Attacker extends Character {
    private double efficiency;

    public Attacker(String name, double efficiency) {
        super(name, 150.0);
        this.efficiency = efficiency;
    }

    @Override
    public double strike() {
        return efficiency;
    }

    @Override
    public void defend(double damage) {
        life -= damage;
    }
}