package Flyweigth;

import java.util.HashMap;
import java.util.Map;

// Фабрика за потребители, която управлява споделените (flyweight) обекти
class UserFactory {
    private static final Map<String, User> users = new HashMap<>();

    public static User getUser(String username, String email) {
        // Генериране на уникален ключ за потребителя
        String key = username + "_" + email;

        // Проверка дали потребителят е вече създаден
        if (!users.containsKey(key)) {
            users.put(key, new ConcreteUser(username, email));
        }

        return users.get(key);
    }

    public static int getUsersCount() {
        return users.size();
    }
}
