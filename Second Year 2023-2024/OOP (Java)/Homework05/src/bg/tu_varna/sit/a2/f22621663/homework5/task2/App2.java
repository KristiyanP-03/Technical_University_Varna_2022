package bg.tu_varna.sit.a2.f22621663.homework5.task2;

public class App2 {
    public static void main(String[] args) {
        Defender defender = new Defender("Защитник", 350.0, 150.0, 350.0);
        double damage = 400.0;


        defender.defend(damage);

        System.out.println("Резултат: живот: " + defender.life + ", броня: " + defender.armor + ", лечителско умение: " + defender.healingSkill);
    }
}
