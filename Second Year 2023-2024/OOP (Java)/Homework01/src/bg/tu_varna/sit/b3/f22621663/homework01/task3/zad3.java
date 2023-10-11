package bg.tu_varna.sit.b3.f22621663.homework01.task3;

public class zad3 {
    public static void main(String[] args) {
        String dayOfWeek = "петък";


        if (dayOfWeek.equals("понеделник") || dayOfWeek.equals("сряда") || dayOfWeek.equals("петък")) {
            System.out.println("Работен ден е от 13:30 - 18:00 часа");

        } else if (dayOfWeek.equals("вторник") || dayOfWeek.equals("четвъртък")) {
            System.out.println("Работен ден е от 8:00 - 12:30 часа");

        } else {
            System.out.println("Почивен ден");
        }


    }
}
