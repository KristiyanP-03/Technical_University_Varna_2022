package bg.tu_varna.sit.b3.f22621663.homework01.task5;

public class zad5 {
    public static void main(String[] args) {
        int[] arrayWithRandomNumbers = {12, 7, 14, 18, 6, 24, 10, 8, 16, 31};

        java.util.Arrays.sort(arrayWithRandomNumbers); //Ползвах пакет

        int topThreeEvenNumbers = 0;

        System.out.println("И най-големите четни числа са:");
        for(int index = arrayWithRandomNumbers.length - 1;index > 0; index--){
            if(arrayWithRandomNumbers[index] % 2 == 0 && topThreeEvenNumbers != 3){
                System.out.println(arrayWithRandomNumbers[index]);
                topThreeEvenNumbers++;
            }

        }
    }
}
