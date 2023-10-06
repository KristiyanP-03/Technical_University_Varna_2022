package bg.tu_varna.sit.b3.f22621663.homework01.task2;

public class zad2 {
    public static void main(String[] args) {
        char[] charArray = {'S', 'o', 'm', 'e', ' ', 't', 'e', 'x', 't'};
        int currentArrayIndex = 0;

        while(currentArrayIndex < charArray.length){
            System.out.println(charArray[currentArrayIndex]);
            currentArrayIndex += 1;
        }
    }
}
