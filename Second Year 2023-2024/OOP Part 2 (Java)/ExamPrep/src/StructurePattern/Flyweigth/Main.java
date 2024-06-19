package StructurePattern.Flyweigth;

public class Main {
    public static void main(String[] args) {
        // Създаване на потребители
        User user1 = UserFactory.getUser("john_doe", "john@example.com");
        User user2 = UserFactory.getUser("jane_doe", "jane@example.com");
        User user3 = UserFactory.getUser("john_doe", "john@example.com"); // Повторно създаване на потребител със същите данни

        // Показване на потребителите
        user1.display();
        user2.display();
        user3.display(); // Показва същия потребител като user1, защото са споделени обекти

        // Проверка на броя на създадените потребители
        System.out.println("Total number of users: " + UserFactory.getUsersCount());
    }
}
