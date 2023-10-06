package bg.tu_varna.sit.b3.f22621663.homework01.task4;

public class zad4 {
    public static void main(String[] args) {
        int[] fNumbers = {
           23621663,
                22621663,22621663,22621663,22621663,22621663,22621663,22621663,
                21621663,
                20621663
        };
        int firstYearStudentsCount = 0;
        int secondYearStudentsCount = 0;
        int thirdYearStudentsCount = 0;
        int fourthYearStudentsCount = 0;



        for (int fN : fNumbers) {
            int firstDigit = fN / 1000000;

            switch (firstDigit) {
                case 23:
                    firstYearStudentsCount++;
                    break;
                case 22:
                    secondYearStudentsCount++;
                    break;
                case 21:
                    thirdYearStudentsCount++;
                    break;
                case 20:
                    fourthYearStudentsCount++;

            }
        }

        System.out.println("|--------------ЛИСТ----------------|");
        System.out.println("1-ви курс: " + firstYearStudentsCount);
        System.out.println("2-ри курс: " + secondYearStudentsCount);
        System.out.println("3-ти курс: " + thirdYearStudentsCount);
        System.out.println("4-ти курс: " + fourthYearStudentsCount);
    }
}
