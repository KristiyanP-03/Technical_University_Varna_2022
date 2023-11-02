package bg.tu_varna.sit.b3.f22621663.homework3.task2;

public class Defender extends Character {
    private String defensiveSkill;
    private int armor;
    private String healingSkill;


    public Defender(String name, int life, String defensiveSkill, int armor, String healingSkill) {
        super(name, 250);
        this.defensiveSkill = defensiveSkill;
        this.armor = armor;
        this.healingSkill = healingSkill;
    }


    public String getDefensiveSkill() {
        return defensiveSkill;
    }
    public int getArmor() {
        return armor;
    }
    public String getHealingSkill() {
        return healingSkill;
    }


    public void setDefensiveSkill(String defensiveSkill) {
        this.defensiveSkill = defensiveSkill;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
    public void setHealingSkill(String healingSkill) {
        this.healingSkill = healingSkill;
    }
}