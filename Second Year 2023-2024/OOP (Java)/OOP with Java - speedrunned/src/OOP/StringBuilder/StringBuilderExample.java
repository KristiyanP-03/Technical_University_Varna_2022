package OOP.StringBuilder;

public class StringBuilderExample {
    public static void main(String[] args) {
        // Създаване на обект от тип StringBuilder с начален размер
        StringBuilder stringBuilder = new StringBuilder(20);

        // Добавяне на текст
        stringBuilder.append("Hello, ");

        // Добавяне на число
        int number = 42;
        stringBuilder.append(number);

        // Добавяне на друг текст
        stringBuilder.append(" World!");

        // Извеждане на резултата
        System.out.println(stringBuilder.toString());
    }
}
