package bg.tu_varna.sit.a2.f22621663.homework5.task2;

public abstract class Character {
    protected String name;
    protected double life;

    public Character(String name, double life) {
        this.name = name;
        this.life = life;
    }


    public abstract double strike();
    public abstract void defend(double damage);
}