package bg.tu_varna.sit.a2.f22621663.homework5.task2;

public class Defender extends Character {
    protected double defensiveSkill;
    protected double armor;
    protected double healingSkill;

    public Defender(String name, double defensiveSkill, double armor, double healingSkill) {
        super(name, 250.0);
        this.defensiveSkill = defensiveSkill;
        this.armor = armor;
        this.healingSkill = healingSkill;
    }

    @Override
    public double strike() {
        return 10.0;
    }

    @Override
    public void defend(double damage) {
        double maxLife = life;

        if(armor > damage){
            armor -= damage;
        }
        else {
            armor -= damage;
            life += armor;
            armor = 0;
            if(life < 0){
                life = 0;
            }
        }

        double healing = (maxLife/100) * (healingSkill / 100.0);
        life += healing;
        if (life > maxLife) {
            life = maxLife;
        }
    }
}

