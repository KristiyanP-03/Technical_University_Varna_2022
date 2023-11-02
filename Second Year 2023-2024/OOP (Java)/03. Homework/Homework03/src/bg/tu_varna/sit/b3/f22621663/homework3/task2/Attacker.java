package bg.tu_varna.sit.b3.f22621663.homework3.task2;

public class Attacker extends Character {
    private int efficiency;


    public Attacker(String name, int efficiency) {
        super(name, 150);
        this.efficiency = efficiency;
    }


    public int getEfficiency() {
        return efficiency;
    }


    public void setEfficiency(int efficiency) {
        this.efficiency = efficiency;
    }
}